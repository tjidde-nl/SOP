package api;


import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/test")
@Produces("application/json")
@Consumes("application/json")
public class testApi {

    @GET
    public Response getTest(){
        List<String> list = new ArrayList<>();
        list.add("This works!!");
        list.add("Yaay");
        list.add("Test works!!");
        return Response.ok(list).build();
    }
    @POST
    public Response doSomething(String a){
        return Response.ok(a).build();
    }
}
