package name.compagniName.site.service;

import java.util.List;

import name.compagniName.site.DTO.MatchDTO;
import name.compagniName.site.exception.MatchNotFoundException;


public interface MatchServiceInterface {

	
	List<MatchDTO> getAllMatch();
	MatchDTO getMatchById(int id) throws MatchNotFoundException;
}
