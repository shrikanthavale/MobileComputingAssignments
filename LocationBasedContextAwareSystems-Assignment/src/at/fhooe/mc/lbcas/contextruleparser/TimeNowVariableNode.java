/**
 * 
 */
package at.fhooe.mc.lbcas.contextruleparser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Vector;

import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement;
import at.fhooe.mc.lbcas.component.contextmanagement.ContextSituation;

/**
 * @author Shrikant Havale
 * 
 */
public class TimeNowVariableNode extends TreeNode {

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.contextruleparser.TreeNode#calculate()
	 */
	@Override
	public Object calculate() throws NodeError {
		return m_value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * at.fhooe.mc.lbcas.contextruleparser.TreeNode#setVariableParameters(at
	 * .fhooe.mc.lbcas.component.contextmanagement.ContextSituation)
	 */
	@Override
	public void setVariableParameters(ContextSituation _contextSituation) {
		// cast to context element
		Vector<ContextElement> contextElements = _contextSituation
				.getContextElements();

		for (ContextElement contextElement : contextElements) {

			if ("timecontext".equals(contextElement.getContexttype())) {
				int hour = contextElement.getTimeContextElement().getTime()
						.getHour();
				int minutes = contextElement.getTimeContextElement().getTime()
						.getMinutes();
				SimpleDateFormat df = new SimpleDateFormat("HH:mm");
				try {
					m_value = df.parse(hour + ":" + minutes);
				} catch (ParseException e) {
					e.printStackTrace();
				}
			}
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.contextruleparser.TreeNode#clear()
	 */
	@Override
	public void clear() {
		m_value = null;
	}

	@Override
	public Boolean equalTo(TreeNode _node) throws NodeError {

		Date firstValue = null;
		Date secondValue = null;

		Object nodeValue = _node.calculate();

		if (m_value instanceof Date) {
			firstValue = (Date) m_value;
		}

		if (nodeValue instanceof Date) {
			secondValue = (Date) nodeValue;
		}

		return firstValue.equals(secondValue);
	}

	@Override
	public Boolean notEqualTo(TreeNode _node) throws NodeError {

		Date firstValue = null;
		Date secondValue = null;

		Object nodeValue = _node.calculate();

		if (m_value instanceof Date) {
			firstValue = (Date) m_value;
		}

		if (nodeValue instanceof Date) {
			secondValue = (Date) nodeValue;
		}

		return !firstValue.equals(secondValue);
	}

	@SuppressWarnings("deprecation")
	@Override
	public Boolean greaterThan(TreeNode _node) throws NodeError {

		Date firstValue = null;
		Date secondValue = null;

		Object nodeValue = _node.calculate();

		if (m_value instanceof Date) {
			firstValue = (Date) m_value;
		}

		if (nodeValue instanceof Date) {
			secondValue = (Date) nodeValue;
		}

		if (firstValue.getHours() > secondValue.getHours()) {
			return true;
		} else if (firstValue.getHours() < secondValue.getHours()) {
			return false;
		} else {
			if (firstValue.getMinutes() > secondValue.getMinutes()) {
				return true;
			} else {
				return false;
			}
		}

	}

	@SuppressWarnings("deprecation")
	@Override
	public Boolean lessThan(TreeNode _node) throws NodeError {

		Date firstValue = null;
		Date secondValue = null;

		Object nodeValue = _node.calculate();

		if (m_value instanceof Date) {
			firstValue = (Date) m_value;
		}

		if (nodeValue instanceof Date) {
			secondValue = (Date) nodeValue;
		}

		if (firstValue.getHours() < secondValue.getHours()) {
			return true;
		} else if (firstValue.getHours() > secondValue.getHours()) {
			return false;
		} else {
			if (firstValue.getMinutes() < secondValue.getMinutes()) {
				return true;
			} else {
				return false;
			}
		}

	}
}
