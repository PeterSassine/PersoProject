package name.compagniName.site.DTO;

import java.sql.Date;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor

public class NewsDTO {

	
	
	private int NewsId;
	private String title;
	private String description;
	private Date dateCreated;
	private byte[] imageNews;
}
