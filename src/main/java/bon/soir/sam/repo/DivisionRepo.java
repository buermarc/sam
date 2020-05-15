package bon.soir.sam.repo;

import static org.springframework.hateoas.server.mvc.WebMvcLinkBuilder.*;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.hateoas.CollectionModel;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.PagingAndSortingRepository;

import bon.soir.sam.entity.Division;

/**
 * Erlaubt angepasste Export Mappings des Repositories
 */
@RepositoryRestResource(exported=true, collectionResourceRel = "division", path = "division")
public interface DivisionRepo extends PagingAndSortingRepository<Division, Long>{
    
}
