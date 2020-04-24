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

import bon.soir.sam.entity.Game;
import bon.soir.sam.service.GameService;

@RepositoryRestResource(collectionResourceRel = "game", path = "game")
public interface GameRepo extends PagingAndSortingRepository<Game, Long>{
    
//    @Autowired
//    private LigaService ligaService;
}
