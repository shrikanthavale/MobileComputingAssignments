/**
 * 
 */
package at.fhooe.mc.lbcas.contextruleparser;

import at.fhooe.mc.lbcas.component.contextmanagement.ContextSituation;

/**
 * @author Shrikant Havale
 * 
 */
public class ConstantNode extends TreeNode {

	private Object m_value;

	/**
	 * 
	 */
	public ConstantNode() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.contextruleparser.TreeNode#calculate()
	 */
	@Override
	public Object calculate() throws NodeError {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.contextruleparser.TreeNode#clear()
	 */
	@Override
	public void clear() {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
	}

	/**
	 * @return the m_value
	 */
	public Object getM_value() {
		return m_value;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * at.fhooe.mc.lbcas.contextruleparser.TreeNode#setValueForConstantNode(
	 * java.lang.Object)
	 */
	@Override
	public void setValueForConstantNode(Object _value) {
		this.m_value = _value;
	}

}
