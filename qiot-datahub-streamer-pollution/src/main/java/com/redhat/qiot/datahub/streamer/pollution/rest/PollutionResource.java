package com.redhat.qiot.datahub.streamer.pollution.rest;


import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;


import org.jboss.resteasy.annotations.jaxrs.QueryParam;
import org.slf4j.Logger;


import com.redhat.qiot.datahub.streamer.pollution.service.PollutionStreamerService;


@Path("/pollution")
@ApplicationScoped
public class PollutionResource {

    @Inject
    Logger LOGGER;

    @Inject
    PollutionStreamerService gasStreamerService;

    @PUT
    @Consumes(MediaType.TEXT_PLAIN)
    public void nameAsync(@QueryParam String data) {
        gasStreamerService.streamPollutionData(data);
    }
}