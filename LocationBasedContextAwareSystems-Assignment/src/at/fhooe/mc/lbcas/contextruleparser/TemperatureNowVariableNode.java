/**
 * 
 */
package at.fhooe.mc.lbcas.contextruleparser;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;

import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement;
import at.fhooe.mc.lbcas.component.contextmanagement.ContextSituation;

/**
 * @author Shrikant Havale
 *
 */
public class TemperatureNowVariableNode extends TreeNode {
	
	/**
	 * value to store variable
	 */
	private Object m_value;

	/**
	 * default constructor
	 */
	public TemperatureNowVariableNode() {
		// TODO Auto-generated constructor stub
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

			if ("temperaturecontext".equals(contextElement.getContexttype())) {
				m_value = contextElement.getTemperatureContextElement().getCurrentTemperature().getTemperaturevalue();
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
