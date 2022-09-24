package name.compagniName.site.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import name.compagniName.site.model.Team;

@Repository
public interface TeamRepository extends JpaRepository<Team, Integer>{

}
