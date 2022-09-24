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

import name.compagniName.site.DTO.MatchDTO;
import name.compagniName.site.exception.MatchNotFoundException;
import name.compagniName.site.service.MatchServiceInterface;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/matches")

public class MatchController {
	
	
	MatchServiceInterface matchService;

	@Autowired
	public MatchController(MatchServiceInterface matchService) {
		this.matchService = matchService;
	}
	
	@GetMapping("")
	public ResponseEntity<Object> getAllMatch(){
		
		List<MatchDTO> matchList = this.matchService.getAllMatch();	
		return matchList != null ?  new ResponseEntity<>(matchList, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	
	@GetMapping("/id")
public ResponseEntity<Object> getMatchById(@PathVariable ("id") int id){
		try {
			MatchDTO match = this.matchService.getMatchById(id);	
			return new ResponseEntity<>(match , HttpStatus.OK);
		}catch (MatchNotFoundException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}


}
