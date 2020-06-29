package com.redhat.qiot.datahub.streamer.gas.rest;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;


import org.jboss.resteasy.annotations.jaxrs.QueryParam;
import org.slf4j.Logger;


import com.redhat.qiot.datahub.streamer.gas.service.GasStreamerService;

@Path("/gas")
@ApplicationScoped
public class GasResource {



    @Inject
    Logger LOGGER;
    
    @Inject
    GasStreamerService gasStreamerService;

    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public void nameAsync(@QueryParam String data) {
        gasStreamerService.streamGasData(data);
    }
}