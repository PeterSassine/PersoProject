package name.compagniName.site.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import name.compagniName.site.model.Player;

@Repository
public interface PlayerRepository extends JpaRepository<Player, Integer>{

}
