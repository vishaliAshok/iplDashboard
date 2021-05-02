package io.javabrains.ipldashboard.reopository;

import java.util.List;

import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import io.javabrains.ipldashboard.Model.Match;

@Repository
public interface MatchRepository extends CrudRepository<Match , Long>{
    
    List<Match> getByTeam1OrTeam2OrderByDateDesc(String teamName1, String teamName2, Pageable pageable);
    

    default List<Match> findLatestMatchesbyTeam(String teamName, int count) {
        Pageable page = PageRequest.of(0, count);
        return getByTeam1OrTeam2OrderByDateDesc(teamName, teamName, page);
    }

}
