package name.compagniName.site.DTO;

import java.sql.Date;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;
import name.compagniName.site.model.Team;
@Data
@NoArgsConstructor

public class NewsDTO {

	
	
	private int NewsId;
	private String title;
	private String description;
	private Date dateCreated;
	private byte[] imageNews;
}
