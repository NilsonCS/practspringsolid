package bo.edu.ucb.demo.Backend.model.services;

import bo.edu.ucb.demo.Backend.model.Student;

import java.util.List;

public interface IStudentService {

    public List<Student> findAll();

    public Student findById(Long id);


    public Student save(Student student);

    public void delete (Long id);
}
