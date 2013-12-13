/**
 * 
 */
package at.fhooe.mc.lbcas.reflectionapi;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;

/**
 * @author Shrikant Havale
 * 
 */
public class ClientController implements ClientControllerIF {

	/**
	 * list for storing all the file name
	 */
	private List<String> fileNames = new ArrayList<>();

	/**
	 * constructor for intializing with all the
	 */
	public ClientController() {

		try {
			// get the class path
			String classPath = System.getProperty("java.class.path");

			// get the classes directory from the class path
			String[] classesDirectoryPathArray = classPath.split(";");

			// get all the files
			for (String classesDirectoryPath : classesDirectoryPathArray) {
				getFiles(new File(classesDirectoryPath));
			}
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * at.fhooe.mc.lbcas.reflectionapi.ClientControllerIF#findModule(java.lang
	 * .String)
	 */
	@Override
	public List<String> findModule(String _interfaceDescription) {

		// component implmentation for the interfaces
		List<String> componentImplementation = new ArrayList<>();

		// get the class path
		String classPath = System.getProperty("java.class.path");

		// get the classes directory from the class path
		String classesDirectoryPath = classPath.split(";")[0];

		try {

			// get all the files
			getFiles(new File(classesDirectoryPath));

			Class<?> componentInterface = Class.forName(_interfaceDescription);

			for (String qualifiedClassName : fileNames) {

				// get the class
				Class<?> classComponent = Class.forName(qualifiedClassName);

				// get all the interfaces
				Class<?>[] classesInterface = classComponent.getInterfaces();

				// iterate through the interfaces and check if its matching
				for (Class<?> tempInterface : classesInterface) {
					if (tempInterface.getName().equals(
							componentInterface.getName())) {

						componentImplementation.add(classComponent.getName());
					}
				}

			}
		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		// return the list
		return componentImplementation;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * at.fhooe.mc.lbcas.reflectionapi.ClientControllerIF#findModule(java.lang
	 * .String, java.lang.String)
	 */
	@Override
	public Class<?> findModule(String _interfaceDescription, String _filter) {

		try {

			Class<?> componentInterface = Class.forName(_interfaceDescription);

			for (String qualifiedClassName : fileNames) {

				// get the class
				Class<?> classComponent = Class.forName(qualifiedClassName);

				// get all the interfaces
				Class<?>[] classesInterface = classComponent.getInterfaces();

				// iterate through the interfaces and check if its matching
				for (Class<?> tempInterface : classesInterface) {
					if (tempInterface.getName().equals(
							componentInterface.getName())
							&& classComponent.getName().contains(_filter)) {

						return classComponent;
					}
				}

			}
		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// return the list
		return null;
	}

	@Override
	public Class<?> findClass(String _fullyQualifiedClassName) {

		try {

			Class<?> componentInterface = Class
					.forName(_fullyQualifiedClassName);
			return componentInterface;

		}

		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}

		// return the list
		return null;
	}

	/**
	 * Get all the files from the directory
	 * 
	 * @param directory
	 *            directory from which files are to searched
	 * @throws IOException
	 *             IOException while reading JAR file
	 */
	private void getFiles(File directory) throws IOException {

		File files[];

		if (directory.isFile()) {

			if (directory.getPath().contains(".class")
					&& !directory.getPath().contains("$")) {

				// add the file to list get the directory path
				String subPath = directory.getPath().substring(
						directory.getPath().indexOf("\\at"));

				// get the sub path
				subPath = subPath.replace("\\", ".");

				// remove the beginning slash
				subPath = subPath.substring(1, subPath.indexOf(".class"));

				// add them to file names list
				fileNames.add(subPath);

			} else if (directory.getPath().contains("TemperatureModule.jar")) {

				// JAR File reader
				JarFile jarFile = new JarFile(directory);

				// enumeration of jar files
				Enumeration<JarEntry> enumeration = jarFile.entries();

				while (enumeration.hasMoreElements()) {

					// read the contents of JAR file
					JarEntry jarEntry = enumeration.nextElement();

					if (jarEntry.getName().contains(".class")
							&& !jarEntry.getName().contains("$")) {
						fileNames.add(jarEntry
								.getName()
								.replace("/", ".")
								.substring(0,
										jarEntry.getName().indexOf(".class")));
					}

				}

				// close the JAR file
				jarFile.close();
			}
		}

		else {

			files = directory.listFiles();
			// iterate through all the directory
			for (File file : files) {
				// recursive call to search for files
				getFiles(file);

			}
		}

	}

	public static void main(String[] args) {

		new ClientController()
				.findModule("at.fhooe.mc.lbcas.component.ComponentIF");
	}
}
