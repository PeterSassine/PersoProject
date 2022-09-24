package name.compagniName.site.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "player")
@ToString
@AllArgsConstructor

public class Player {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int playerId;
	
	@Column(name = "namePlayer")
	private String namePlayer;
	
	@Column(name = "imagePlayer", unique = false, nullable = false, length = 100000)
	private byte[] imagePlayer;	
	
	@Column(name = "nameHeight")
	private String playerHeight;
	
	@Column(name = "playerBirthDay")
	private String playerBirthDay;
	
	@Column(name = "playerNationality")
	private String playerNationality;
	
	@Column(name = "playerPosition")
	private String playerPosition;
	
	@Column(name = "playerNumber")
	private String playerNumber;
	
	@Column(name = "playerTeam")
	private String playerTeam;

	

}