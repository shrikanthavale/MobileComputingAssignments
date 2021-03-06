/**
 * 
 */
package at.fhooe.mc.lbcas.component.gis;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

/**
 * @author Shrikant Havale
 * 
 *         This class reads the constants from properties file
 */
public class Messages {
	private static final String BUNDLE_NAME = "at.fhooe.mc.lbcas.component.gis.messages"; //$NON-NLS-1$

	private static ResourceBundle RESOURCE_BUNDLE = ResourceBundle.getBundle(
			BUNDLE_NAME, new Locale("en"));

	private Messages() {
	}

	public static String getString(String key) {
		try {
			return RESOURCE_BUNDLE.getString(key);
		} catch (MissingResourceException e) {
			return '!' + key + '!';
		}
	}

	public static void setBundleLocale(Locale _locale) {
		RESOURCE_BUNDLE = ResourceBundle.getBundle(BUNDLE_NAME, _locale);
	}
}
