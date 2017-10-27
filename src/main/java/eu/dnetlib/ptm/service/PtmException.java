package eu.dnetlib.ptm.service;

/**
 * @author mhorst
 *
 */
public class PtmException extends Exception {

    /**
     * 
     */
    private static final long serialVersionUID = 1L;

    public PtmException() {
        super();
    }

    public PtmException(String message) {
        super(message);
    }

    public PtmException(Throwable cause) {
        super(cause);
    }

    public PtmException(String message, Throwable cause) {
        super(message, cause);
    }

}
