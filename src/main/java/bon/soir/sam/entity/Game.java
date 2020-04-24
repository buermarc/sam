package bon.soir.sam.entity;

import java.io.Serializable;
import java.util.List;
//import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.validation.constraints.NotNull;
//import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import org.springframework.hateoas.RepresentationModel;

@Entity
@Data
@NoArgsConstructor	
@AllArgsConstructor
public class Game extends RepresentationModel<Game> implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message = "ID can not be null")
	private long id;
    
	@NotNull
	private String name;

    @ManyToMany
    @JoinTable(
        name="team_game",
        joinColumns = @JoinColumn(name = "game_id"),
        inverseJoinColumns = @JoinColumn(name = "team_id"))
    private List<Team> teams;

    private Team winnerTeam;

    @NotNull
    @ManyToOne 
    private Division division;
}
