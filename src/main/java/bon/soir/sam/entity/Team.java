package bon.soir.sam.entity;

import java.util.List;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

import org.springframework.hateoas.RepresentationModel;

@Entity
@Data
@NoArgsConstructor	
@AllArgsConstructor
public class Team extends RepresentationModel<Team> implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message = "ID can not be null")
	private long id;

	@NotNull
	private String name;

	private String website="";

    @ManyToMany(mappedBy = "teams")
    private List<Game> games;

    @ManyToOne
    private Division division;
}
