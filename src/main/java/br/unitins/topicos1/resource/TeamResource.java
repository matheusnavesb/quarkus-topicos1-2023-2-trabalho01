package br.unitins.topicos1.resource;

import java.util.List;
import br.unitins.topicos1.model.Team;
import br.unitins.topicos1.repository.TeamRepository;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.DELETE;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.PathParam;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;


@Path("/teams")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TeamResource {

    @Inject
    TeamRepository repository;
    
    @POST
    @Transactional
    public Team createTeam(Team team) {
        Team novoTeam = new Team();
        novoTeam.setNome(team.getNome());
        novoTeam.setCidade(team.getCidade());

        repository.persist(novoTeam);

        return novoTeam;
    }


    @PUT
    @Path("/update")
    @Transactional
    public Team update(Team team) {
        Team t = repository.findById(team.getId());
        if(team.getNome() != null) t.setNome(team.getNome());
        if(team.getCidade()!= null) t.setCidade(team.getCidade());
        repository.persist(t);
        return t; // Equipe atualizada com sucesso
        }
    
    
    @DELETE
    @Path("/delete/{id}")
    @Transactional
    public Response delete(@PathParam("id") Long id) {
        if(repository.deleteById(id)){
            return Response.status(Response.Status.NO_CONTENT).build();
        }
        else{
            return Response.status(Response.Status.BAD_REQUEST).build();
        }
    }

    @GET
    public List<Team> findAll() {
        return repository.listAll();
    }

    @GET
    @Path("/{id}")
    public Team findById(@PathParam("id") Long id) {
        return repository.findById(id);
    }

    @GET
    @Path("/search/nome/{nome}")
    public List<Team> findByNome(@PathParam("nome") String nome) {
        return repository.findByNome(nome);
    }
}
