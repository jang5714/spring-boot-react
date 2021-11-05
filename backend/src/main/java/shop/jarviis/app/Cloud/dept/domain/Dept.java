package shop.jarviis.app.Cloud.dept.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.stereotype.Component;
import shop.jarviis.app.Cloud.board.domain.Article;
import shop.jarviis.app.Cloud.emp.domain.Emp;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data @Entity
@Component @Table(name = "dept")
public class Dept {
    @Id
    private long deptNo;

    @Column(length = 14)@NotNull
    private String dname;
    @Column(length = 13)@NotNull private String loc;

    @OneToMany(mappedBy = "dept", fetch = FetchType.EAGER)
    private List<Emp> empList = new ArrayList<>();

}
