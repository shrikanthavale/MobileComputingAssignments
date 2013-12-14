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
public class PositionNowVariableNode extends TreeNode {

	/**
	 * value of the variable node
	 */
	private Object m_value;

	/**
	 * default constructor
	 */
	public PositionNowVariableNode() {
	}

	/* (non-Javadoc)
	 * @see at.fhooe.mc.lbcas.contextruleparser.TreeNode#calculate()
	 */
	@Override
	public Object calculate() throws NodeError {
		return m_value;
	}

	/* (non-Javadoc)
	 * @see at.fhooe.mc.lbcas.contextruleparser.TreeNode#setVariableParameters(at.fhooe.mc.lbcas.component.contextmanagement.ContextSituation)
	 */
	@Override
	public void setVariableParameters(ContextSituation _contextSituation) {
		// cast to context element
		Vector<ContextElement> contextElements = _contextSituation.getContextElements();

		for (ContextElement contextElement : contextElements) {

			if ("locationcontext".equals(contextElement.getContexttype())) {
				m_value = contextElement.getLocationContextElement().getGeographicalLocation().getAltitude() > 260 
						? "UNIVERSITY_CAMPUS" : "";
			}
		}
	}

	/* (non-Javadoc)
	 * @see at.fhooe.mc.lbcas.contextruleparser.TreeNode#clear()
	 */
	@Override
	public void clear() {
		m_value = null;
	}

}
