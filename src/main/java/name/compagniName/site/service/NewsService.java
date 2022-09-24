package name.compagniName.site.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import name.compagniName.site.DTO.NewsDTO;
import name.compagniName.site.exception.NewsNotFoundException;
import name.compagniName.site.model.News;
import name.compagniName.site.repository.NewsRepository;

public class NewsService implements NewsServiceInterface {

private NewsRepository newsRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	public List<NewsDTO> getAllNews() {
		List<News> newsList = this.newsRepository.findAll();
		List<NewsDTO> newsDTO = newsList
				  .stream()
				  .map(user -> modelMapper.map(newsList , NewsDTO.class))
				  .collect(Collectors.toList());
		return newsDTO;
	}

	@Override
	public NewsDTO getNewsById(int id) throws NewsNotFoundException {
		
		Optional<News> optionalNews = this.newsRepository.findById(id); 
		if(optionalNews.isPresent()) {
			
			NewsDTO newsDTO = modelMapper.map(optionalNews, NewsDTO.class);
			return newsDTO;
			
		}else {
			throw new NewsNotFoundException("news not found"); 
		}
		
	
}
}
