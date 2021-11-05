package shop.jarviis.app.Cloud.emp.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.stereotype.Component;
import shop.jarviis.app.Cloud.dept.domain.Dept;
import shop.jarviis.app.Cloud.user.domain.User;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Component
@Table(name = "emp")
public class Emp {
    @Id
    @Column(name = "emp_no")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long empNo;

    @Column(length = 10) @NotNull private String ename;
    @Column(length = 9) @NotNull private String job;
    @Column(length = 4) @NotNull private Long mgr;
    @Column(name = "hire_date", length = 20) @NotNull private String hireDate;
    @Column(length = 7) @NotNull private Long sal;
    @Column(length = 7) private Long comm;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "dept_no")
    private Dept dept;
}
