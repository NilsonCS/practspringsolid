package bo.edu.ucb.demo.Backend.dao;

import bo.edu.ucb.demo.Backend.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface IStudentDao extends CrudRepository<Student, Long> {
}
