package name.compagniName.site.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
@Table(name = "match")
@ToString
@AllArgsConstructor

public class Match {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "MatchId")
	private int MatchId;
	
	@Column(name = "dateMatch")
	private Date dateMatch;
	
	@Column(name = "timeMatch")
	private String timeMatch;
	
	@Column(name = "homeTeam")
	private String homeTeam;
	
	@Column(name = "AwayTeam")
	private String AwayTeam;
	

}
