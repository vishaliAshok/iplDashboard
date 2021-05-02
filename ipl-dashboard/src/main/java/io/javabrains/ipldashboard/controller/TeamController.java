package io.javabrains.ipldashboard.controller;

// import java.util.List;

// import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

// import io.javabrains.ipldashboard.Model.Match;
import io.javabrains.ipldashboard.Model.Team;
import io.javabrains.ipldashboard.reopository.MatchRepository;
import io.javabrains.ipldashboard.reopository.TeamRepository;

@RestController
public class TeamController {

   @Autowired
   private TeamRepository teamRepository;


   @Autowired
   private MatchRepository matchRepository;

@GetMapping("/team/{teamName}")
    public Team getTeam(@PathVariable String teamName) {
        Team team = this.teamRepository.findByTeamName(teamName);
        team.setMatch(matchRepository.findLatestMatchesbyTeam(teamName,4));
            
        return team;
    }
    
}
