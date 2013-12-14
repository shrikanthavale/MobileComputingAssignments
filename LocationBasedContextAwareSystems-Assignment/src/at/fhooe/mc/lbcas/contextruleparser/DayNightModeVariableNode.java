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
	
	/**
	 * to store current value of the node
	 */
	private Object m_value = null;

	/**
	 * Default constructor
	 */
	public DayNightModeVariableNode() {
	}

	/* (non-Javadoc)
	 * @see at.fhooe.mc.lbcas.contextruleparser.TreeNode#calculate()
	 */
	@Override
	public Object calculate() throws NodeError {
		return  m_value;
	}

	/* (non-Javadoc)
	 * @see at.fhooe.mc.lbcas.contextruleparser.TreeNode#setVariableParameters(at.fhooe.mc.lbcas.component.contextmanagement.ContextSituation)
	 */
	@Override
	public void setVariableParameters(ContextSituation _contextSituation) {

		// cast to context element
		Vector<ContextElement> contextElements = _contextSituation.getContextElements();
		
		for (ContextElement contextElement : contextElements) {

			if ("timecontext".equals(contextElement.getContexttype())) {
	
				String dayNight = contextElement.getTimeContextElement().getTime().getAMPM();
				m_value = dayNight.equals("AM") ? "DAY" : "NIGHT"; 
				
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
