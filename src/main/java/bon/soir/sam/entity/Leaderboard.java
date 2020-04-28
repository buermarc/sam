package bon.soir.sam.entity;

import java.util.List;
import java.util.ArrayList;
import java.io.Serializable;
import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
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
public class Leaderboard extends RepresentationModel<Leaderboard> implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @NotNull
    private long id;
}
