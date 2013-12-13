/**
 * 
 */
package at.fhooe.mc.lbcas.contextruleparser;

/**
 * @author Shrikant Havale
 * 
 */
public class NodeError extends Exception {

	/**
	 * Generated Serial Version ID
	 */
	private static final long serialVersionUID = -4783928797697769661L;

	/**
	 * Node Eror constructor
	 */
	public NodeError() {
	}

	/**
	 * @param message
	 */
	public NodeError(String message) {
		super(message);
	}

	/**
	 * @param cause
	 */
	public NodeError(Throwable cause) {
		super(cause);
	}

	/**
	 * @param message
	 * @param cause
	 */
	public NodeError(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * @param message
	 * @param cause
	 * @param enableSuppression
	 * @param writableStackTrace
	 */
	public NodeError(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

}
