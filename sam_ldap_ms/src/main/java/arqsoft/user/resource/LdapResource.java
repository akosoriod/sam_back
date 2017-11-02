package arqsoft.user.resource;

import arqsoft.user.model.User;
import arqsoft.user.service.LdapService;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;


@Path( "/ldap" )
public class LdapResource{

    @Context
    UriInfo uriInfo;

    @POST
    public Response validate(User user ){
       LdapService login = new LdapService();

       if (login.login(user.getEmail(), user.getPassword())){

        return Response.status(Response.Status.OK).entity("{ \"login\": \"True\" } ").build();

      }else{

        return Response.status(Response.Status.UNAUTHORIZED).entity("{ \"login\": \"False\" } ").build();

      }

    }


}
