package bon.soir.sam.repo;


import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.PagingAndSortingRepository;

import bon.soir.sam.entity.Game;

/**
 * Erlaubt angepasste Export Mappings des Repositories
 */
@RepositoryRestResource(collectionResourceRel = "game", path = "game")
public interface GameRepo extends PagingAndSortingRepository<Game, Long>{
    
}
