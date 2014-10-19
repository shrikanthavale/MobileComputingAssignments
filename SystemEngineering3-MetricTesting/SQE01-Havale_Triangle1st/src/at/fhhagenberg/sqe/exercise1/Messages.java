package at.fhhagenberg.sqe.exercise1;

import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * Message - Auto generated using eclipse externalize string for reading properties file
 * based on locale selected.
 * 
 * @author Shrikant Havale - S1310455005
 * Oct 19, 2014
 *
 */
public class Messages {
	private static final String BUNDLE_NAME = "at.fhhagenberg.sqe.exercise1.messages"; //$NON-NLS-1$

	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
			.getBundle(BUNDLE_NAME);
	
//	private static final ResourceBundle RESOURCE_BUNDLE = ResourceBundle
//			.getBundle(BUNDLE_NAME, new Locale("DE"));

	private Messages() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}
}
