package Se.lexicon.SPRING_BOOT_LECTURE_1.repository;

import Se.lexicon.SPRING_BOOT_LECTURE_1.entity.Student;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {
}
