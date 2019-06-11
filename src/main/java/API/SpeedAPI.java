package API;

import Services.RandomService;

import javax.inject.Inject;
import javax.ws.rs.*;
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
    @POST
    public Response doSomething(String a){
        return Response.ok(a).build();
    }
}
