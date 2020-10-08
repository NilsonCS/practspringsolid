package bo.edu.ucb.demo.Backend.api;

import bo.edu.ucb.demo.Backend.model.Student;
import bo.edu.ucb.demo.Backend.model.services.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
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

    @GetMapping("/students/{id}")
    public Student show(@PathVariable Long id){
        return studentService.findById(id);
    }

    @PostMapping("/students")
    @ResponseStatus(HttpStatus.CREATED)
    public Student create(@RequestBody Student student){
        student.setCreateAt(new Date());
        return  studentService.save(student);
    }

}
