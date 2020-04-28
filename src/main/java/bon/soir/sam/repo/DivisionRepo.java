package bon.soir.sam.repo;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.hateoas.CollectionModel;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.PagingAndSortingRepository;

import bon.soir.sam.entity.Division;
import bon.soir.sam.entity.Team;
import bon.soir.sam.dto.TeamWin;
import bon.soir.sam.service.DivisionService;

@RepositoryRestResource(exported=true, collectionResourceRel = "division", path = "division")
public interface DivisionRepo extends PagingAndSortingRepository<Division, Long>{
    
/*    @RequestMapping(value = "/api/division/{divisionId}/leaderboard", produces = { "application/hal+json" })
    public CollectionModel<TeamWin> getLeaderboard(
            @PathVariable long divisionId){
            List<TeamWin> teamWins = divisionService.createLeaderboard(divisionId);
            for (TeamWin teamWin : teamWins) {
                Link selfLink = linkTo(methodOn(DivisionController.class).getDivisionById(divisionId)).withSelfRel();
                teamWin.add(selfLink);
            }

            Link link = linkTo(methodOn(DivisionController.class).getLeaderboard(divisionId)).withSelfRel();
            return new CollectionModel<TeamWin>(teamWins, link);
            }*/
//    @Autowired
//    private LigaService ligaService;
}
