package bon.soir.sam.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import org.springframework.hateoas.RepresentationModel;

/**
 * Representative Entitätsklasse für eine Division
 */
@Entity
@Data
@NoArgsConstructor	
@AllArgsConstructor
public class Division extends RepresentationModel<Division> implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message = "ID can not be null")
	private long id;

	@NotNull
	private String name;

    @OneToMany(mappedBy="division")
    @Getter
    private List<Team> teams = new ArrayList<>();
    
    @OneToMany(mappedBy="division")
    private List<Game> games = new ArrayList<>();

    @ManyToOne
    private Liga liga;

    public List<Team> getTeams() {
        return this.teams;
    }

}
