package name.compagniName.site.service;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

import name.compagniName.site.DTO.LeagueDTO;
import name.compagniName.site.exception.LeagueNotFoundException;
import name.compagniName.site.model.League;
import name.compagniName.site.repository.LeagueRepository;
@Service

public class LeagueService implements LeagueServiceInterface{

	private LeagueRepository leagueRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	//get all league
	@Override
	public List<LeagueDTO> getAllLeague() {
		List<League> leagueList = this.leagueRepository.findAll();
		List<LeagueDTO> leagueDTO = leagueList
				  .stream()
				  .map(user -> modelMapper.map(leagueList , LeagueDTO.class))
				  .collect(Collectors.toList());
		return leagueDTO;
	}

	@Override
	public LeagueDTO getLeagueById(int id) throws LeagueNotFoundException {
		
		Optional<League> optionalLeague = this.leagueRepository.findById(id); 
		if(optionalLeague.isPresent()) {
			
			LeagueDTO leagueDTO = modelMapper.map(optionalLeague, LeagueDTO.class);
			return leagueDTO;
			
		}else {
			throw new LeagueNotFoundException("league not found"); 
		}
		
	}

}
