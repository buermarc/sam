package bon.soir.sam.repo;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.PagingAndSortingRepository;

import bon.soir.sam.entity.Liga;

/**
 * Erlaubt angepasste Export Mappings des Repositories
 */
@RepositoryRestResource(collectionResourceRel = "liga", path = "liga")
public interface LigaRepo extends PagingAndSortingRepository<Liga, Long>{
}
