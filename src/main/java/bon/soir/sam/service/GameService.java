package bon.soir.sam.service;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import bon.soir.sam.repo.*;
import bon.soir.sam.entity.Game;
import bon.soir.sam.entity.Team;

@Service
public class GameService { 

    @Autowired
    private GameRepo gameRepo;

    @Autowired
    private TeamRepo teamRepo;

    @Autowired
    private DivisionRepo divisionRepo; 

    public Game createNewGame(Game gameRequest) throws Exception {
        List<Team> teams = gameRequest.getTeams();
        System.out.println(teams.toString());
        return gameRequest;
    }
}
