package API;

import Services.RandomService;

import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

@Path("/speed")
@Produces("application/json")
@Consumes("application/json")
public class SpeedAPI {

    @Inject
    RandomService randomService;
    @GET
    public Response getRandomSpeed(){
        return Response.ok(randomService.getRandom()).build();
    }
}
