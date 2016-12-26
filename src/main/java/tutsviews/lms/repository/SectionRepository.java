package tutsviews.lms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import tutsviews.lms.domain.Section;

@Repository
public interface SectionRepository extends JpaRepository<Section,Long>{

}
