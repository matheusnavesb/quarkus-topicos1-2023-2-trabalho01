package br.unitins.topicos1.dto;

import br.unitins.topicos1.model.Estado;
import br.unitins.topicos1.model.Team;

public record TeamResponseDTO(
    
    Long teamId,
    String nome,
    String cidade,
    Estado estado

){

    public static TeamResponseDTO valueOf(Team team){
        return new TeamResponseDTO(
            team.getId(),
            team.getNome(),
            team.getCidade(),
            team.getEstado());
        
        }
    }
        
    



