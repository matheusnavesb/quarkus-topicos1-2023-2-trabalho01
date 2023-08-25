package br.unitins.topicos1.repository;

import java.util.List;

import br.unitins.topicos1.model.Team;
// import io.quarkus.hibernate.orm.panache.PanacheRepository;
import io.quarkus.hibernate.orm.panache.PanacheRepositoryBase;
//import io.quarkus.hibernate.orm.panache.common.runtime.AbstractJpaOperations;
import jakarta.enterprise.context.ApplicationScoped;
//import jakarta.inject.Inject;

@ApplicationScoped
public class TeamRepository implements PanacheRepositoryBase<Team, Long>{

    public List<Team> findByNome(String nome){
        return find("UPPER(nome) LIKE UPPER(?1)", "%"+nome+"%").list();
    }

    public Team updateTeam(Long id, Team updatedTeam) {
        Team team = findById(id);
        if (team != null) {
            team.setNome(updatedTeam.getNome());
            team.setCidade(updatedTeam.getCidade());
            return team;
        }
        return null; // Equipe não encontrada
    }

    public boolean deleteTeam(Long id) {
        Team team = findById(id);
        if (team != null) {
            delete(team);
            return true; // Equipe deletada com sucesso
        }
        return false; // Equipe não encontrada
    }

}