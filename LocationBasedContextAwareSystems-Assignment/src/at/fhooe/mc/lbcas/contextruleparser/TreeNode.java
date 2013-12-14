package at.fhooe.mc.lbcas.contextruleparser;

import at.fhooe.mc.lbcas.component.contextmanagement.ContextSituation;

public abstract class TreeNode {

	/**
	 * child nodes
	 */
	protected TreeNode[] m_childs = null;

	/**
	 * root node
	 */
	protected TreeNode m_root = null;

	/**
	 * value node
	 */
	protected Object m_value = null;

	/**
	 * The method calculate triggers the calculation of the dedicated node, she
	 * returns a responding result object
	 * 
	 * @return The calculation result in form of an object
	 * @throws NodeError
	 * 
	 */
	public abstract Object calculate() throws NodeError;

	/**
	 * Dynamic (variable) leaf nodes get their needed values through this
	 * method. Father nodes call the function of their child nodes
	 * 
	 * @param _contextSituation
	 *            the currently known and needed context element values
	 */
	public abstract void setVariableParameters(
			ContextSituation _contextSituation);

	/**
	 * Clears all temporary data (context values inside variable tree nodes)
	 * 
	 */
	public abstract void clear();

	/**
	 * Delivers the root of the processing tree.
	 * 
	 * @return the root of the tree
	 */
	public TreeNode getRoot() {
		return m_root;
	}

	/**
	 * Sets/defines the root node of the processing tree.
	 * 
	 * @return the root of the tree
	 */
	public void setRoot(TreeNode _root) {
		m_root = _root;
	}

	/**
	 * Sets the child nodes of this distinct node
	 * 
	 * @param _childs
	 *            sets the child nodes of this node
	 */
	public void setChildNodes(TreeNode[] _childs) {
		m_childs = _childs;
	}

	/**
	 * Delivers the child nodes of this node
	 * 
	 * @return Delivers the child nodes of this node in form of an node array
	 */
	public TreeNode[] getChilds() {
		return m_childs;
	}

	/**
	 * set the value for node
	 * 
	 * @param _value
	 */
	public void setValueForNode(Object _value) {
		m_value = _value;
	}

	/**
	 * return the value of the node
	 */
	public Object getValueForNode() {
		return m_value;
	}

	/**
	 * greater than method logic, every variable node should implement as per
	 * their needs
	 * 
	 * @throws NodeError
	 */
	public Boolean greaterThan(TreeNode _node) throws NodeError {
		return null;
	}

	/**
	 * less than method logic, every variable node should implement as per their
	 * needs
	 * 
	 * @throws NodeError
	 */
	public Boolean lessThan(TreeNode _node) throws NodeError {
		return null;
	}

	/**
	 * equal to method logic, every variable node should implement as per their
	 * needs
	 * 
	 * @throws NodeError
	 */
	public Boolean equalTo(TreeNode _node) throws NodeError {
		return null;
	}

	/**
	 * not equal to method logic, every variable node should implement as per
	 * their needs
	 * 
	 * @throws NodeError
	 */
	public Boolean notEqualTo(TreeNode _node) throws NodeError {
		return null;
	}

}