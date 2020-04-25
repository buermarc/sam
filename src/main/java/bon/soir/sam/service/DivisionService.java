package bon.soir.sam.service;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import bon.soir.sam.dto.TeamWin;
import bon.soir.sam.entity.Team;
import bon.soir.sam.entity.Division;
import bon.soir.sam.repo.TeamRepo;
import bon.soir.sam.repo.DivisionRepo;

@Service
public class DivisionService {
    @Autowired 
    private TeamRepo teamRepo;

    @Autowired 
    private DivisionRepo divisionRepo;
   
    public List<TeamWin> createLeaderboard(long divisionId) {
        Optional<Division> opt = divisionRepo.findById(divisionId);
        Division div;
        if (opt.isPresent()) {
            div = opt.get();
        } else {
            return new ArrayList<TeamWin>();
        }
        List<Team> teams =  div.getTeams();
        List<TeamWin> teamWins = new ArrayList<>();
        teams.forEach(team -> teamWins.add(new TeamWin(team.getId(), team.getWonGames().size())));
        return teamWins;
    }
}
