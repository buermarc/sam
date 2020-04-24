package bon.soir.sam.repo;

//import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
//import org.springframework.http.HttpEntity;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestParam;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.PagingAndSortingRepository;

import bon.soir.sam.entity.Team;
import bon.soir.sam.service.TeamService;

@RepositoryRestResource(collectionResourceRel = "team", path = "team")
public interface TeamRepo extends PagingAndSortingRepository<Team, Long>{
    
//    @Autowired
//    private LigaService ligaService;
}
