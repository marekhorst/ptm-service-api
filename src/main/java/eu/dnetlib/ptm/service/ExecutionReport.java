package eu.dnetlib.ptm.service;

import java.util.Map;

/**
 * PTM execution report.
 * 
 * @author mhorst
 *
 */
public class ExecutionReport {

    /**
     * PTM job status.
     */
    private JobStatus status;
    
    /**
     * Set of input properties.
     */
    private Map<String,String> properties;
    
    /**
     * Error details, to be set only when status = 'failed'.
     */
    private ErrorDetails errorDetails;
    
    
    public ExecutionReport() {
        // required by deserialization mechanism
        super();
    }
    
    public ExecutionReport(Map<String,String> properties, JobStatus status, ErrorDetails errorDetails) {
        this.properties = properties;
        this.status = status;
        this.errorDetails = errorDetails;
    }

    public JobStatus getStatus() {
        return status;
    }

    public ErrorDetails getErrorDetails() {
        return errorDetails;
    }

    public Map<String, String> getProperties() {
        return properties;
    }

    public void setStatus(JobStatus status) {
        this.status = status;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }

    public void setErrorDetails(ErrorDetails errorDetails) {
        this.errorDetails = errorDetails;
    }
    
}
