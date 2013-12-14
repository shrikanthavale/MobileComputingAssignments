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
	
	/**
	 * value to store variable
	 */
	private Object m_value;
	
	/**
	 * default constructor
	 */
	public TimeNowVariableNode() {
	}

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
		Vector<ContextElement> contextElements = _contextSituation.getContextElements();

		for (ContextElement contextElement : contextElements) {

			if ("timecontext".equals(contextElement.getContexttype())) {
				int hour = contextElement.getTimeContextElement().getTime().getHour();
				int seconds = contextElement.getTimeContextElement().getTime().getSeconds();
				String amPM = contextElement.getTimeContextElement().getTime().getAMPM();
			    SimpleDateFormat df = new SimpleDateFormat("HH:mm aa");
			    try {
					 m_value = df.parse(hour + ":" + seconds + " " + amPM);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
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

}
