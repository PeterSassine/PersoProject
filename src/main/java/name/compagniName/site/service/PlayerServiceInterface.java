package name.compagniName.site.service;

import java.util.List;

import name.compagniName.site.DTO.PlayerDTO;

import name.compagniName.site.exception.PlayerNotFoundException;

public interface PlayerServiceInterface {

	List<PlayerDTO> getAllPlayer();
	PlayerDTO getPlayerById(int id) throws PlayerNotFoundException;
	
}
