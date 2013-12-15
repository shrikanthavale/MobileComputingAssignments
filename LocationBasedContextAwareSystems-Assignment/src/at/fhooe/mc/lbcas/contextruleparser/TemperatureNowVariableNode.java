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
public class TemperatureNowVariableNode extends TreeNode {

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

			if ("temperaturecontext".equals(contextElement.getContexttype())) {
				m_value = contextElement.getTemperatureContextElement()
						.getCurrentTemperature().getTemperaturevalue();
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

		Integer firstValue = null;
		Integer secondValue = null;

		Object nodeValue = _node.calculate();

		if (nodeValue instanceof Integer) {
			firstValue = (Integer) nodeValue;
		}

		if (m_value instanceof Integer) {
			secondValue = (Integer) m_value;
		}

		return firstValue == secondValue;
	}

	@Override
	public Boolean notEqualTo(TreeNode _node) throws NodeError {

		Integer firstValue = null;
		Integer secondValue = null;

		Object nodeValue = _node.calculate();

		if (nodeValue instanceof Integer) {
			firstValue = (Integer) nodeValue;
		}

		if (m_value instanceof Integer) {
			secondValue = (Integer) m_value;
		}

		return firstValue != secondValue;
	}

	@Override
	public Boolean greaterThan(TreeNode _node) throws NodeError {

		Integer firstValue = null;
		Integer secondValue = null;

		Object nodeValue = _node.calculate();

		if (m_value instanceof Integer) {
			firstValue = (Integer) m_value;
		}

		if (nodeValue instanceof Integer) {
			secondValue = (Integer) nodeValue;
		}

		return firstValue > secondValue;
	}

	@Override
	public Boolean lessThan(TreeNode _node) throws NodeError {

		Integer firstValue = null;
		Integer secondValue = null;

		Object nodeValue = _node.calculate();

		if (m_value instanceof Integer) {
			firstValue = (Integer) m_value;
		}

		if (nodeValue instanceof Integer) {
			secondValue = (Integer) nodeValue;
		}

		return firstValue < secondValue;
	}

}
