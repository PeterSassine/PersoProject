package name.compagniName.site.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import name.compagniName.site.DTO.LeagueDTO;
import name.compagniName.site.DTO.MatchDTO;
import name.compagniName.site.exception.MatchNotFoundException;
import name.compagniName.site.model.League;
import name.compagniName.site.model.Match;
import name.compagniName.site.repository.MatchRepository;
@Service

public class MatchService  implements MatchServiceInterface{

	
	private MatchRepository matchRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	
	public List<MatchDTO> getAllMatch() {
		List<Match> matchList = this.matchRepository.findAll();
		List<MatchDTO> matchDTO = matchList
				  .stream()
				  .map(user -> modelMapper.map(matchList , MatchDTO.class))
				  .collect(Collectors.toList());
		return matchDTO;
	}

	@Override
	public MatchDTO getMatchById(int id) throws MatchNotFoundException {
		
		Optional<Match> optionalMatch = this.matchRepository.findById(id); 
		if(optionalMatch.isPresent()) {
			
			MatchDTO matchDTO = modelMapper.map(optionalMatch, MatchDTO.class);
			return matchDTO;
			
		}else {
			throw new MatchNotFoundException("match not found"); 
		}
		
	}
}
