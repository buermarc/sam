package bon.soir.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import bon.soir.sam.dto.TeamWin;
import bon.soir.sam.service.DivisionService;

@RestController
public class DivisionController {
    @Autowired
    private DivisionService divisionService;
    
    @RequestMapping("/api/division/{divisionId}/leaderboard")
    public List<TeamWin> getLeaderboard(
            @PathVariable long divisionId){
            return divisionService.createLeaderboard(divisionId);
            }
}

