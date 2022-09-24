package name.compagniName.site.DTO;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor


public class MatchDTO {
	
	private int MatchId;
	private Date dateMatch;
	private String timeMatch;
	private String homeTeam;
	private String AwayTeam;
	
}
