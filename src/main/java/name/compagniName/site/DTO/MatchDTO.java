package name.compagniName.site.DTO;

import java.sql.Date;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import name.compagniName.site.model.Team;

@Data
@NoArgsConstructor


public class MatchDTO {
	
	private int MatchId;
	private Date dateMatch;
	private String timeMatch;
	private String homeTeam;
	private String AwayTeam;
	
}
