package name.compagniName.site.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import name.compagniName.site.DTO.TeamDTO;
import name.compagniName.site.DTO.TeamDTO;
import name.compagniName.site.exception.TeamNotFoundException;
import name.compagniName.site.exception.TeamNotFoundException;
import name.compagniName.site.model.Team;
import name.compagniName.site.repository.TeamRepository;

@Service

public class TeamService implements TeamServiceInterface{

	

	private TeamRepository teamRepository;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public List<TeamDTO> getAllTeam() {
		List<Team> teamList = this.teamRepository.findAll();
		List<TeamDTO> teamDTO = teamList
				  .stream()
				  .map(user -> modelMapper.map(teamList , TeamDTO.class))
				  .collect(Collectors.toList());
		return teamDTO;
	}

	@Override
	public TeamDTO getTeamById(int id) throws TeamNotFoundException {
		Optional<Team> optionalTeam = this.teamRepository.findById(id); 
		if(optionalTeam.isPresent()) {
			
			TeamDTO teamDTO = modelMapper.map(optionalTeam, TeamDTO.class);
			return teamDTO;
			
		}else {
			throw new TeamNotFoundException("team not found"); 
		}

	
	
}
	
}
