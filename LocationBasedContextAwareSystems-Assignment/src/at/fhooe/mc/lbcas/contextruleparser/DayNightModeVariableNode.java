/**
 * 
 */
package at.fhooe.mc.lbcas.contextruleparser;

import java.util.Vector;

import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement;
import at.fhooe.mc.lbcas.component.contextmanagement.ContextSituation;

/**
 * @author Shrikant Havale
 * 
 */
public class DayNightModeVariableNode extends TreeNode {

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

				String dayNight = contextElement.getTimeContextElement()
						.getTime().getAMPM();

				m_value = dayNight;

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

		String firstValue = null;
		String secondValue = null;

		Object nodeValue = _node.calculate();

		if (nodeValue instanceof String) {
			firstValue = (String) nodeValue;
		}

		if (m_value instanceof String) {
			secondValue = (String) m_value;
		}

		return firstValue.equals(secondValue);
	}

	@Override
	public Boolean notEqualTo(TreeNode _node) throws NodeError {

		String firstValue = null;
		String secondValue = null;

		Object nodeValue = _node.calculate();

		if (nodeValue instanceof String) {
			firstValue = (String) nodeValue;
		}

		if (m_value instanceof String) {
			secondValue = (String) m_value;
		}

		return !firstValue.equals(secondValue);
	}
}
