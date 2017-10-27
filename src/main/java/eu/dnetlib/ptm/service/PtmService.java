package eu.dnetlib.ptm.service;

import java.util.Set;

/**
 * Probabilistic Topic Modeling service interface.
 * 
 * @author mhorst
 *
 */
public interface PtmService {

    /**
     * Performs annotation phase.
     * @param command map of input parameters
     * @return job identifier
     */
    String annotate(Command command);
    
    /**
     * Performs topic modeling phase.
     * @param command map of input parameters
     * @return job identifier
     */
    String topicModeling(Command command);
    
    /**
     * Obtains job report.
     * @param jobId job identifier
     * @return job report
     * @throws PtmException
     */
    ExecutionReport getReport(String jobId) throws PtmException;
    
    /**
     * Cancels job.
     * @param jobId job identifier
     * @return true when successfully canceled, false otherwise
     * @throws PtmException when unknown job identifier
     */
    boolean cancel(String jobId) throws PtmException;
    
    /**
     * @return list of all the jobs including ongoing and finished.
     */
    Set<String> listJobs();
    
}
