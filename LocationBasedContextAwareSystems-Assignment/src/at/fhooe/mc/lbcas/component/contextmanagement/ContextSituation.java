/**
 * 
 */
package at.fhooe.mc.lbcas.component.contextmanagement;

import java.util.Vector;

import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement;

/**
 * @author Shrikant Havale
 * 
 *         This class represents the combination of several context elements.
 *         All the context elements combines to make context situation
 * 
 */
public class ContextSituation {

	private Vector<ContextElement> contextElements = new Vector<>();

	/**
	 * @return the contextElements
	 */
	public Vector<ContextElement> getContextElements() {
		return contextElements;
	}

	/**
	 * @param contextElements
	 *            the contextElements to set
	 */
	public void setContextElements(Vector<ContextElement> contextElements) {
		this.contextElements = contextElements;
	}

}
