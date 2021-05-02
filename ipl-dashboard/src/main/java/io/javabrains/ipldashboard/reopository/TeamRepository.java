package io.javabrains.ipldashboard.reopository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.javabrains.ipldashboard.Model.Team;

@Repository
public interface TeamRepository extends CrudRepository<Team , Long>{
    
    Team findByTeamName(String teamName);

    
}
