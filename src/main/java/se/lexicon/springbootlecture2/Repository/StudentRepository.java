package se.lexicon.springbootlecture2.Repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import se.lexicon.springbootlecture2.entity.Student;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface StudentRepository extends CrudRepository<Student, Long> {

    //1.
    // select * from student where first_name = ?;
    List<Student> findByFirstName(String firstName);

    //2.
    @Query("select s from Student s where s.firstName = :firstName")
    List<Student> findStudentByFullName(@Param("firstName") String name);


    //find students by their name containing a certain name
    //select * from student where first_name like '%name%';
    List<Student> findByFirstNameContaining(String name);

    //find student by creation date after a certain date
    List<Student> findByCreateDateAfter(LocalDateTime createDate);

    //find students by status true
    //select * from student where status = true;
    List<Student> findByStatusTrue();

    //find student by email (case-sensitive)
    Optional<Student> findByEmailIgnoreCase(String email);

    @Modifying
    //update the student status to true by student id
    @Query("update Student st set st.status = true where st.id = :studentId")
    void updateStudentStatusToTrue(@Param("studentId") String id);

    //find students by course id
    List<Student> findByCourse_Id(Long courseId);

    //find students by the course name
    List<Student> findByCourse_CourseName(String courseName);
}
