package name.compagniName.site.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import name.compagniName.site.model.Match;

@Repository
public interface MatchRepository extends JpaRepository<Match, Integer>{

}
