package br.unitins.topicos1.service;

import java.util.List;

import br.unitins.topicos1.dto.TeamDTO;
import br.unitins.topicos1.dto.TeamResponseDTO;
import br.unitins.topicos1.model.Estado;
//import br.unitins.topicos1.model.Team;
//import jakarta.enterprise.context.ApplicationScoped;

//@ApplicationScoped
public interface TeamService {
    
    public TeamResponseDTO insert(TeamDTO dto);
    
    public TeamResponseDTO update(TeamDTO dto, Long id);

    public void delete(Long id);

    public TeamResponseDTO findById(Long id);

    public List<TeamResponseDTO> findByNome(String nome);

    public List<TeamResponseDTO> findByAll();

    public void persist(Estado novoEstado);
}
