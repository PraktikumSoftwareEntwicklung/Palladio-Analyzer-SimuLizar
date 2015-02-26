package org.palladiosimulator.simulizar.launcher.partitions;

import java.util.List;

import org.apache.log4j.Logger;
import org.palladiosimulator.simulizar.pms.MonitorRepository;
import org.palladiosimulator.simulizar.pms.PmsPackage;

import de.uka.ipd.sdq.workflow.mdsd.blackboard.ResourceSetPartition;
import de.uka.ipd.sdq.workflow.pcm.blackboard.PCMResourceSetPartition;

/**
 * Special ResourceSetPartition for the PMS, with the functionality to resolve cross references from
 * the PRM to PCM.
 * 
 * @author Joachim Meyer
 * 
 */
public class PMSResourceSetPartition extends ResourceSetPartition {

    private static final Logger LOGGER = Logger.getLogger(PMSResourceSetPartition.class);
    private MonitorRepository monitorRepositoryModel;

    /**
     * Constructor
     * 
     * @param pcmResourceSetPartition
     *            the pcm resource set partition to resolve cross references from prm to pcm.
     */
    public PMSResourceSetPartition(final PCMResourceSetPartition pcmResourceSetPartition) {
        super();
        this.monitorRepositoryModel = null;
    }

    public MonitorRepository getMonitorRepositoryModel() {
        if (this.monitorRepositoryModel == null) {
            this.monitorRepositoryModel = loadMonitorRepositoryModel();
        }
        return this.monitorRepositoryModel;
    }

    /**
     * @return return the PMSModel element
     */
    private MonitorRepository loadMonitorRepositoryModel() {
        try {
            LOGGER.debug("Retrieving Monitor Repository Model from blackboard partition");
            List<MonitorRepository> result = getElement(PmsPackage.eINSTANCE.getMonitorRepository());
            return result.get(0);
        } catch (Exception e) {
            LOGGER.warn("No Monitor Repository found, no requests will be measured.");
            return null;
        }
    }

}