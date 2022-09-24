package name.compagniName.site.service;

import java.util.List;

import name.compagniName.site.DTO.NewsDTO;
import name.compagniName.site.exception.NewsNotFoundException;

public interface NewsServiceInterface {
	
	
	List<NewsDTO> getAllNews();
	NewsDTO getNewsById (int id) throws NewsNotFoundException;

}
