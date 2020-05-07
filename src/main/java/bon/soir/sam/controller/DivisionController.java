package bon.soir.sam.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.data.rest.webmvc.BasePathAwareController;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.hateoas.CollectionModel;
import org.springframework.hateoas.Link;
import org.springframework.transaction.annotation.Transactional;
import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;

import bon.soir.sam.dto.TeamWin;
import bon.soir.sam.service.DivisionService;
import bon.soir.sam.repo.DivisionRepo;
import bon.soir.sam.entity.Division;

//@RestController
@BasePathAwareController
@Transactional
public class DivisionController {

    private final DivisionRepo repo;

    @Autowired
    public DivisionController(DivisionRepo repo){
        this.repo = repo;
    }

    @Autowired
    private DivisionService divisionService;

    
    @RequestMapping(value = "division/{divisionId}/leaderboard", produces = { "application/hal+json" })
    public HttpEntity<CollectionModel<TeamWin>> getLeaderboard(
            @PathVariable long divisionId){
            List<TeamWin> teamWins = divisionService.createLeaderboard(divisionId);
            /*for (TeamWin teamWin : teamWins) {
                Link selfLink = linkTo(teamWin).withSelfRel();
                teamWin.add(selfLink);
            }*/

            Link link = linkTo(methodOn(DivisionController.class).getLeaderboard(divisionId)).withSelfRel();
            return new ResponseEntity<>(new CollectionModel<TeamWin>(teamWins, link), HttpStatus.OK);
            }
}
