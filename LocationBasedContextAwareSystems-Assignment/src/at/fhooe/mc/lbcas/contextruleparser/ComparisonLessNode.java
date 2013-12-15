/**
 * 
 */
package at.fhooe.mc.lbcas.contextruleparser;

import at.fhooe.mc.lbcas.component.contextmanagement.ContextSituation;

/**
 * @author Shrikant Havale
 * 
 */
public class ComparisonLessNode extends TreeNode {

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.contextruleparser.TreeNode#calculate()
	 */
	@Override
	public Object calculate() throws NodeError {
		TreeNode[] childNodes = getChilds();
		return childNodes[0].lessThan(childNodes[1]);
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

		TreeNode[] childNodes = getChilds();

		for (TreeNode temp : childNodes) {
			temp.setVariableParameters(_contextSituation);
		}
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

}
