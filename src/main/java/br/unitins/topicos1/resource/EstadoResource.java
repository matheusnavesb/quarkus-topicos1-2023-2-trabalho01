package br.unitins.topicos1.resource;

/*

import java.util.List;

import br.unitins.topicos1.dto.EstadoDTO;
import br.unitins.topicos1.model.Estado;
import br.unitins.topicos1.model.Team;
import br.unitins.topicos1.repository.TeamRepository;
import br.unitins.topicos1.service.EstadoService;
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


@Path("/estados")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class EstadoResource {
    

    @Inject
    EstadoService service;
    

    @POST
    @Transactional
    public Estado insert(EstadoDTO dto) {
        //Estado novoEstado = new Estado();
        //novoEstado.setNome(dto.getNome());
        //novoEstado.setSigla(dto.getSigla());

        //repository.persist(novoEstado);

        return service.insert(dto); 
    }

    @GET
    public List<Estado> findAll(){
        //return repository.listAll().stream().map(e -> EstadoResponseDTO.valueOf(e)).toList();
        // return repository.ListAll();
        return service.findByAll();
    }

    @PUT
    @Transactional
    @Path("/{id}")
    public EstadoResponseDTO update(EstadoDTO dto, @PathParam("id") Long id){

        Estado estado = repository.findById(id);
        if(estado != null){
        estado.setNome(dto.getNome());
        estado.setSigla(dto.getSigla());
        }
        else{
            throw new NotFoundException();

        return EstadoResponseDTO.valueOf(estado);
    }
    
    @DELETE
    @Transactional
    @Path("/{id}")
    public void delete(@PathParam("id") Long id) {
        if(repository.deleteById(id))
        throw new NotFoundException();
    }

    @GET
    @Path("/{id}")
    public EstadoResponseDTO findById(@PathParam("id") Long id) {
        return EstadoResponseDTO.valueOf(repository.findById(id));
    }

    @GET
    @Path("/search/nome/{nome}")
    public List<Estado> findByNome(@PathParam("nome") String nome) {
        return repository.findByNome(nome).stream().map(e -> EstadoResponseDTO.valueOf(e).toList();
    }
}*/
