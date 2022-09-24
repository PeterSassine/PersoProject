package name.compagniName.site.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import name.compagniName.site.DTO.PlayerDTO;
import name.compagniName.site.exception.PlayerNotFoundException;
import name.compagniName.site.model.Player;
import name.compagniName.site.repository.PlayerRepository;

@Service
public class PlayerService implements PlayerServiceInterface{

	
	private PlayerRepository playerRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<PlayerDTO> getAllPlayer() {
		List<Player> playerList = this.playerRepository.findAll();
		List<PlayerDTO> playerDTO = playerList
				  .stream()
				  .map(user -> modelMapper.map(playerList , PlayerDTO.class))
				  .collect(Collectors.toList());
		return playerDTO;
	}

	@Override
	public PlayerDTO getPlayerById(int id) throws PlayerNotFoundException {
		Optional<Player> optionalPlayer = this.playerRepository.findById(id); 
		if(optionalPlayer.isPresent()) {
			
			PlayerDTO playerDTO = modelMapper.map(optionalPlayer, PlayerDTO.class);
			return playerDTO;
			
		}else {
			throw new PlayerNotFoundException("player not found"); 
		}
	}
	
	

}
