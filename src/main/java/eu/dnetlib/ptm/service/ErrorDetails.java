package eu.dnetlib.ptm.service;

import java.io.PrintWriter;
import java.io.StringWriter;

/**
 * Wrapper conveying internal PTM error details to remote client.
 * 
 * @author mhorst
 *
 */
public class ErrorDetails {

    private String message;
    
    private String stackTrace;
    
    public ErrorDetails() {
        // required by deserialization mechanism
        super();
    }

    public ErrorDetails(Throwable e) {
        this.message = e.getMessage();
        StringWriter strWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(strWriter);
        e.printStackTrace(printWriter);
        printWriter.flush();
        this.stackTrace = strWriter.toString();
    }
    
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStackTrace() {
        return stackTrace;
    }

    public void setStackTrace(String stackTrace) {
        this.stackTrace = stackTrace;
    }

}
