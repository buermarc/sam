package bon.soir.sam.dto;

import org.springframework.hateoas.RepresentationModel;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import bon.soir.sam.entity.Team;
/**
 * Klasse TeamWin zum Übertragen der teamId und winCount 
 * bei Anfragen des Leadboards einer Division
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class TeamWin extends RepresentationModel<TeamWin>{
    private long teamId;
    private long winCount;
}
