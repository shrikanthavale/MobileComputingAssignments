/**
 * 
 */
package at.fhhagenberg.sqe.exercise1;

/**
 * This class is responsible for capturing and storing exception messages. Based
 * on validations done in {@link TriangleModel}, this exception will be thrown
 * with custom error messages.
 * 
 * @author Shrikant Havale - S1310455005 Oct 19, 2014
 * 
 */
public class TriangleException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3342738211472740914L;

	/**
	 * 
	 */
	public TriangleException() {
	}

	/**
	 * @param message
	 */
	public TriangleException(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public TriangleException(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public TriangleException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public TriangleException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
