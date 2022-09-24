package name.compagniName.site.service;

import java.util.List;

import name.compagniName.site.DTO.TeamDTO;
import name.compagniName.site.exception.TeamNotFoundException;

public interface TeamServiceInterface {

	List<TeamDTO> getAllTeam();
	TeamDTO getTeamById(int id) throws TeamNotFoundException;
	
}
