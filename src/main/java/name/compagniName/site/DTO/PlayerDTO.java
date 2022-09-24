package name.compagniName.site.DTO;


import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor

public class PlayerDTO {
	
	private int playerId;
	private String namePlayer;
	private byte[] imagePlayer;	
	private String playerHeight;
	private String playerBirthDay;
	private String playerNationality;
	private String playerPosition;
	private String playerNumber;
	private String playerTeam;
}
