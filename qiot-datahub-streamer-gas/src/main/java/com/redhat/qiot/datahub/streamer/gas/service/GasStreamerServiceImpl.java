/**
 * 
 */
package com.redhat.qiot.datahub.streamer.gas.service;

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
class GasStreamerServiceImpl implements GasStreamerService {

    @Inject
    Logger LOGGER;

    @Inject
    @Channel("gas")
    Emitter<String> gasEmitter;
    
    @Override
    public void streamGasData(String data) {
        gasEmitter.send(data);
    }

}
