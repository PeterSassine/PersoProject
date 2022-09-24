package name.compagniName.site.DTO;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.Id;

import lombok.Data;
import lombok.NoArgsConstructor;
import name.compagniName.site.model.Team;

@Data
@NoArgsConstructor

public class LeagueDTO {

	
	private int LeagueId;
	
	private String nameLeague;
	
	private List<Team> team;
	
	
	
}
