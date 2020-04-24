package bon.soir.sam.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
//import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.ManyToOne;
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
public class Division extends RepresentationModel<Division> implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull(message = "ID can not be null")
	private long id;

	@NotNull
	private String name;

    @OneToMany(mappedBy="division")
    private List<Team> teams = new ArrayList<>();
    
    @OneToMany(mappedBy="division")
    private List<Game> games = new ArrayList<>();

    @ManyToOne
    private Liga liga;
}
