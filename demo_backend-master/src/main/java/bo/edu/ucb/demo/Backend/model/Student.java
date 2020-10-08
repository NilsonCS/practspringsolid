package bo.edu.ucb.demo.Backend.model;


import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name="students")
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY )
    private Long id;

    @Column(name="")
    private String name;
    private String firstname;
    private String email;

    @Column(name="create_at")
    @Temporal(TemporalType.DATE)
    private Date createAt;



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

        private static final long serialVersionUID = 1L;

}
