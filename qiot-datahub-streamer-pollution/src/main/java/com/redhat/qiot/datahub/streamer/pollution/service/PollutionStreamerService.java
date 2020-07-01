/**
 * 
 */
package com.redhat.qiot.datahub.streamer.pollution.service;

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
class PollutionStreamerService {

    @Inject
    Logger LOGGER;

    @Incoming("pollution-queue")
    @Outgoing("pollution-stream")
    public String streamData(String data) {
	LOGGER.info("Streaming internal POLLUTION message to Kafka {}", data);
	return data;
    }

}
