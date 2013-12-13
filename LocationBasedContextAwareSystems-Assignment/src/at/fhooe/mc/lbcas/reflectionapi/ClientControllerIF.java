/**
 * 
 */
package at.fhooe.mc.lbcas.reflectionapi;

import java.util.List;

/**
 * @author Shrikant Havale
 * 
 *         This interface represents the way for finding the module by reading
 *         the class path of the project. This interface contains the methods
 *         for retrieving the classes based on interface implementation. Example
 *         Retrieving all the classes implementing the Component Interface
 * 
 */
public interface ClientControllerIF {

	/**
	 * Find all the modules based on the name of the interface passed.
	 * 
	 * @param _interfaceDescription
	 *            name of the interface for finding out the implementation
	 *            classes
	 * @return Array of the names of the classes implementing the passed
	 *         interface name
	 */
	public List<String> findModule(String _interfaceDescription);

	/**
	 * Find all the modules based on the name of interface passed and also on
	 * the based of the filter criteria
	 * 
	 * @param _interfaceDescription
	 *            name of the interface
	 * @param _filter
	 *            filter criteria
	 * @return Array of the names of the classes implementing the passed
	 *         interface name
	 */
	public Class<?> findModule(String _interfaceDescription, String _filter);

	/**
	 * This method gives the class for the fully packaged name string passed
	 * 
	 * @param _fullyQualifiedClassName
	 *            full package naming along with the class name
	 * @return
	 */
	Class<?> findClass(String _fullyQualifiedClassName);

}
