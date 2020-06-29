/**
 * 
 */
package com.redhat.qiot.datahub.streamer.pollution.service;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;


import org.eclipse.microprofile.reactive.messaging.Channel;
import org.eclipse.microprofile.reactive.messaging.Emitter;
import org.slf4j.Logger;

/**
 * @author Andrea
 *
 */
@ApplicationScoped
class PollutionStreamerServiceImpl implements PollutionStreamerService {

    @Inject
    Logger LOGGER;

    @Inject
    @Channel("pollution")
    Emitter<String> pollutionEmitter;
    
    @Override
    public void streamPollutionData(String data) {
        pollutionEmitter.send(data);
    }

}
