/**
 * 
 */
package com.redhat.qiot.datahub.streamer.gas.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.eclipse.microprofile.reactive.messaging.Incoming;
import org.eclipse.microprofile.reactive.messaging.Outgoing;
import org.slf4j.Logger;

/**
 * @author Andrea
 *
 */
@ApplicationScoped
public class GasStreamerService {

    @Inject
    Logger LOGGER;

    @Incoming("gas-queue")
    @Outgoing("gas-stream")
    public String streamData(String data) {
	LOGGER.info("Streaming internal GAS message to Kafka {}", data);
	return data;
    }

}
