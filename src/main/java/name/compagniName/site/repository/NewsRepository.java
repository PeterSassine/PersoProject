package name.compagniName.site.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import name.compagniName.site.model.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer> {

}
