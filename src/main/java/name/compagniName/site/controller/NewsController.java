package name.compagniName.site.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import name.compagniName.site.DTO.NewsDTO;
import name.compagniName.site.exception.NewsNotFoundException;
import name.compagniName.site.service.NewsServiceInterface;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/news")

public class NewsController {
	
	NewsServiceInterface newsService;

	@Autowired
	public NewsController(NewsServiceInterface newsService) {
		this.newsService = newsService;
	}
	
	@GetMapping("")
	public ResponseEntity<Object> getAllNews(){
		
		List<NewsDTO> newsList = this.newsService.getAllNews();	
		return newsList != null ?  new ResponseEntity<>(newsList, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	
	@GetMapping("/id")
public ResponseEntity<Object> getNewsById(@PathVariable ("id") int id){
		try {
			NewsDTO news = this.newsService.getNewsById(id);	
			return new ResponseEntity<>(news , HttpStatus.OK);
		}catch (NewsNotFoundException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}


}
