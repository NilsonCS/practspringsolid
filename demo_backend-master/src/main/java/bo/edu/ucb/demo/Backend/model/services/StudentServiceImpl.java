package bo.edu.ucb.demo.Backend.model.services;

import bo.edu.ucb.demo.Backend.dao.IStudentDao;
import bo.edu.ucb.demo.Backend.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private IStudentDao studentDao;

    @Override
    public List<Student> findAll() {
        return (List<Student>) studentDao.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentDao.findById(id).orElse(null);
    }

    @Override
    public Student save(Student student) {
        return studentDao.save(student);
    }

    @Override
    public void delete(Long id) {

        studentDao.deleteById(id);
    }
}
