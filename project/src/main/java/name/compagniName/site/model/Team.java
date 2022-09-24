package name.compagniName.site.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name = "team")
@ToString
@AllArgsConstructor


public class Team {
	

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int teamId;
	
	@Column(name = "nameTeam")
	private String nameTeam;
	
	@Column(name = "imageTeam", unique = false, nullable = false, length = 100000)
	private byte[] imageTeam;	

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "playerId")
	private List<Player> players;
}
