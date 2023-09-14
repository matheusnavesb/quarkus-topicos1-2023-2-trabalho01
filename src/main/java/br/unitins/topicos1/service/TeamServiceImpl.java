package br.unitins.topicos1.service;


import java.util.List;

import br.unitins.topicos1.dto.TeamDTO;
import br.unitins.topicos1.dto.TeamResponseDTO;
import br.unitins.topicos1.model.Estado;
import br.unitins.topicos1.model.Team;
import br.unitins.topicos1.repository.TeamRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.NotFoundException;


@ApplicationScoped
public class TeamServiceImpl implements TeamService{

    @Inject
    TeamRepository repository;

    @Override
    @Transactional
    public TeamResponseDTO insert(TeamDTO dto) {

            Team newTeam = new Team();
            
            newTeam.setNome(dto.getNome());;
            newTeam.setCidade(dto.getCidade());
            newTeam.setEstado(dto.getEstado());
    
            repository.persist(newTeam);
    
            return TeamResponseDTO.valueOf(newTeam);
        }
    

    @Override
    public TeamResponseDTO update(TeamDTO dto, Long id) {

        Team team = repository.findById(id);
        if (team != null){
            team.setNome(dto.getNome());
            team.setCidade(dto.getCidade());
            team.setEstado(dto.getEstado());

        }else {
            throw new NotFoundException();
        }
        return TeamResponseDTO.valueOf(team);
    }

    @Override
    public void delete(Long id) {
        if(!repository.deleteById(id)){
            throw new NotFoundException();
        }
    }

    @Override
    public TeamResponseDTO findById(Long id) {
        return TeamResponseDTO.valueOf(repository.findById(id));
    }

    @Override
    public List<TeamResponseDTO> findByNome(String nome) {

        return repository.findByNome(nome).stream()
                .map(c -> TeamResponseDTO.valueOf(c)).toList();
    }


    @Override
    public List<TeamResponseDTO> findByAll() {
        
        return repository.listAll().stream().map(c -> TeamResponseDTO.valueOf(c)).toList();
        
    }

    @Override
    public void persist(Estado novoEstado) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'persist'");
    }
    
}
