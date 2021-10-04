package shop.jarviis.app.Cloud.user.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.stereotype.Component;
import shop.jarviis.app.Cloud.board.domain.Article;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data @Entity
@Component @Table(name ="users")
public class UserDto {
    @Id
    @Column(name = "user_id")
    @GeneratedValue
    private long userId;

    @Column(length = 50)@NotNull private String username;
    @Column(length = 10)@NotNull private String password;
    @Column(length = 50)@NotNull private String name;
    @Column(length = 50)@NotNull private String email;
    @Column(name="reg_date", length = 20)@NotNull private String regDate;
    @OneToMany(mappedBy = "user")
    private List<Article> articlelist = new ArrayList<>();

}
