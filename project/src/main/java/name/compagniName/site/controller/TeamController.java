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

import name.compagniName.site.DTO.TeamDTO;
import name.compagniName.site.exception.TeamNotFoundException;
import name.compagniName.site.service.TeamServiceInterface;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/teams")

public class TeamController {
	TeamServiceInterface teamService;

	@Autowired
	public TeamController(TeamServiceInterface teamService) {
		this.teamService = teamService;
	}
	
	@GetMapping("")
	public ResponseEntity<Object> getAllTeam(){
		
		List<TeamDTO> teamList = this.teamService.getAllTeam();	
		return teamList != null ?  new ResponseEntity<>(teamList, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	
	@GetMapping("/id")
public ResponseEntity<Object> getTeamById(@PathVariable ("id") int id){
		try {
			TeamDTO team = this.teamService.getTeamById(id);	
			return new ResponseEntity<>(team , HttpStatus.OK);
		}catch (TeamNotFoundException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
}
