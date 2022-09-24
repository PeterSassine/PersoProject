package name.compagniName.site.model;

import java.sql.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.annotation.Id;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Entity
@Getter
@Setter
@Table(name = "league")
@ToString
@AllArgsConstructor

public class League {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "LeagueId")
	private int LeagueId;
	
	@Column(name = "nameLeague")
	private String nameLeague;
	
	@Column(name = "imageLeague", unique = false, nullable = false, length = 100000)
	private byte[] imageLeague;
	
	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "teamId")
	private List<Team> team;
	
}
