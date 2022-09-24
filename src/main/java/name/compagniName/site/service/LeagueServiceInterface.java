package name.compagniName.site.service;

import java.util.List;

import name.compagniName.site.DTO.LeagueDTO;
import name.compagniName.site.exception.LeagueNotFoundException;




public interface LeagueServiceInterface {

	
	List<LeagueDTO> getAllLeague();
	LeagueDTO getLeagueById(int id) throws LeagueNotFoundException;
	
	
	
	
}
