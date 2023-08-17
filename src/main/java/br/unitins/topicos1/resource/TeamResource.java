package br.unitins.topicos1.resource;

import java.util.List;
import br.unitins.topicos1.model.Team;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;


@Path("/teams")
public class TeamResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Team> allTeams() {
        return Team.listAll();
    }
}
