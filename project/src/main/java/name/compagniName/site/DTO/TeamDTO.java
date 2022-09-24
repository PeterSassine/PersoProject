package name.compagniName.site.DTO;

import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import name.compagniName.site.model.Player;

@Data
@NoArgsConstructor

public class TeamDTO {

	

	private int teamId;
	private String nameTeam;
	private byte[] imageTeam;	
	private List<Player> players;
	
}
