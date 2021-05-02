package io.javabrains.ipldashboard.Model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Transient;

@Entity
public class Team {
    
    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long teamId;
    private String teamName;
    private long totalMatches;
    private long totalWins;

    @Transient
    private List<Match> match;

    
    public long getTeamId() {
        return teamId;
    }
    public void setTeamId(long teamId) {
        this.teamId = teamId;
    }
    public String getTeamName() {
        return teamName;
    }
    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }
    public long getTotalMatches() {
        return totalMatches;
    }
    public void setTotalMatches(long totalMatches) {
        this.totalMatches = totalMatches;
    }
    public long getTotalWins() {
        return totalWins;
    }
    public void setTotalWins(long totalWins) {
        this.totalWins = totalWins;
    }
    public Team(String teamName, long totalMatches) {
        this.teamName = teamName;
        this.totalMatches = totalMatches;
    }
    @Override
    public String toString() {
        return "Team [teamName=" + teamName + ", totalMatches=" + totalMatches + ", totalWins=" + totalWins + "]";
    }
    public Team() {
    }
    public List<Match> getMatch() {
        return match;
    }
    public void setMatch(List<Match> match) {
        this.match = match;
    }


    
    
}
