package name.compagniName.site.DTO;

import java.util.List;

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
