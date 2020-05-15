package bon.soir.sam.repo;


import java.util.List;

import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.repository.PagingAndSortingRepository;

import bon.soir.sam.entity.Team;

/**
 * Erlaubt angepasste Export Mappings des Repositories
 */
@RepositoryRestResource(collectionResourceRel = "team", path = "team")
public interface TeamRepo extends PagingAndSortingRepository<Team, Long>{

    List<Team> findByDivisionId(long divisionId);
}
