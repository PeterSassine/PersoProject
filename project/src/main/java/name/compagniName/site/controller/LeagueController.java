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

import name.compagniName.site.DTO.LeagueDTO;
import name.compagniName.site.exception.LeagueNotFoundException;
import name.compagniName.site.model.League;
import name.compagniName.site.service.LeagueServiceInterface;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/documents")

public class LeagueController {
	
	LeagueServiceInterface leagueService;

	@Autowired
	public LeagueController(LeagueServiceInterface leagueService) {
		this.leagueService = leagueService;
	}
	
	@GetMapping("")
	public ResponseEntity<Object> getAllLeague(){
		
		List<LeagueDTO> leagueList = this.leagueService.getAllLeague();	
		return leagueList != null ?  new ResponseEntity<>(leagueList, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	
	@GetMapping("/id")
public ResponseEntity<Object> getLeagueById(@PathVariable ("id") int id){
		try {
			LeagueDTO league = this.leagueService.getLeagueById(id);	
			return new ResponseEntity<>(league , HttpStatus.OK);
		}catch (LeagueNotFoundException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

	
}
