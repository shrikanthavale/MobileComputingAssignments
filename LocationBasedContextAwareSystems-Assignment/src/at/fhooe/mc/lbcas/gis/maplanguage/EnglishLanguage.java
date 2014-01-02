/**
 * 
 */
package at.fhooe.mc.lbcas.gis.maplanguage;

import java.util.Locale;

/**
 * @author mypersonalpc
 * 
 */
public class EnglishLanguage implements LanguageIF {

	/*
	 * (non-Javadoc)
	 * 
	 * @see at.fhooe.mc.lbcas.gis.maplanguage.LanguageIF#getLocale()
	 */
	@Override
	public Locale getLocale() {
		return new Locale("en");
	}
}
