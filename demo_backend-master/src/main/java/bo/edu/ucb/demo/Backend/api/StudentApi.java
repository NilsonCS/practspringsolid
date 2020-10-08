package bo.edu.ucb.demo.Backend.api;

import bo.edu.ucb.demo.Backend.model.Student;
import bo.edu.ucb.demo.Backend.model.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentApi {

    @Autowired
    private IStudentService studentService;

    @GetMapping("/students")
    public List<Student> index() {
        return studentService.findAll();
    }
}
