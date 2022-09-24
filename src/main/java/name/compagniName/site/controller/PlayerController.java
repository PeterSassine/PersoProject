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

import name.compagniName.site.DTO.PlayerDTO;
import name.compagniName.site.exception.PlayerNotFoundException;
import name.compagniName.site.service.PlayerServiceInterface;

@CrossOrigin
@RestController
@RequestMapping("/api/v1/players")

public class PlayerController {

	PlayerServiceInterface playerService;

	@Autowired
	public PlayerController(PlayerServiceInterface playerService) {
		this.playerService = playerService;
	}
	
	@GetMapping("")
	public ResponseEntity<Object> getAllPlayer(){
		
		List<PlayerDTO> playerList = this.playerService.getAllPlayer();	
		return playerList != null ?  new ResponseEntity<>(playerList, HttpStatus.OK) : new ResponseEntity<>(HttpStatus.NOT_FOUND);
		
	}
	
	
	@GetMapping("/id")
public ResponseEntity<Object> getPlayerById(@PathVariable ("id") int id){
		try {
			PlayerDTO player = this.playerService.getPlayerById(id);	
			return new ResponseEntity<>(player , HttpStatus.OK);
		}catch (PlayerNotFoundException e) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}
	
}
