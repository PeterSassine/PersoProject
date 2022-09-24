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
@Entity
@NoArgsConstructor

@Getter
@Setter
@Table(name = "league")
@ToString
@AllArgsConstructor

public class League {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int LeagueId;
	
	@Column(name = "nameLeague")
	private String nameLeague;
	
	@Column(name = "imageLeague", unique = false, nullable = false, length = 100000)
	private byte[] imageLeague;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "teamId")
	private List<Team> team;
	
}