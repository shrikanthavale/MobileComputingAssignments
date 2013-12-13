/**
 * 
 */
package at.fhooe.mc.lbcas.mediator;

import java.util.Set;
import java.util.Vector;

import at.fhooe.mc.lbcas.component.ComponentIF;
import at.fhooe.mc.lbcas.component.contextdatamodel.ContextElement;
import at.fhooe.mc.lbcas.component.contextmanagement.ContextSituation;
import at.fhooe.mc.lbcas.entities.GeoObject;

/**
 * @author Shrikant Havale
 * 
 */
public interface MediatorIF {

	/**
	 * method to initialize the frame of the application
	 */
	public void initializeFrame();

	/**
	 * method to get the Display Message component
	 */
	public ComponentIF getM_componentDisplayMessages();

	/**
	 * Communicates the GEO objects to the required modules
	 * 
	 * @param _geoObjects
	 *            geo objects to be communicated
	 */
	public void communicateGeoObjects(Vector<GeoObject> _geoObjects);

	/**
	 * Communicate the context elements to the required modules
	 * 
	 * @param element
	 *            context elements
	 */
	public void communicateContextElements(
			Vector<ContextElement> _contextElements);

	/**
	 * Communicate context situation to the required modules
	 * 
	 * @param _contextSituation
	 *            context situation containing the different context elements
	 */
	public void communicateContextSituation(ContextSituation _contextSituation);

	/**
	 * communicates the list of selected components to be loaded
	 * 
	 * @param _listComponents
	 *            list of components
	 */
	public void communicateSelectedComponents(Set<String> _listComponents);
}
