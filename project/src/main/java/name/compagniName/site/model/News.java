package name.compagniName.site.model;

import java.sql.Date;

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
@Table(name = "news")
@ToString
@AllArgsConstructor


public class News {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int NewsId;
	
	@Column(name = "title")
	private String title;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "dateCreated")
	private Date dateCreated;
	
	@Column(name = "imageNews", unique = false, nullable = false, length = 100000)
	private byte[] imageNews;
	
}
