package se.lexicon.springbootlecture2.Repository;

import org.springframework.data.repository.CrudRepository;
import se.lexicon.springbootlecture2.entity.Course;

public interface CourseRepository extends CrudRepository<Course, Long> {
}
