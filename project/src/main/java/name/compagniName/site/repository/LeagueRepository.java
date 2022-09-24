package name.compagniName.site.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import name.compagniName.site.model.League;

@Repository
public interface LeagueRepository extends JpaRepository<League, Integer>{

}
