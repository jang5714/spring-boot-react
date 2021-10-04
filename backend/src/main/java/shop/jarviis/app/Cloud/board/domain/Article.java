package shop.jarviis.app.Cloud.board.domain;

import com.sun.istack.NotNull;
import lombok.Data;
import org.springframework.stereotype.Component;
import shop.jarviis.app.Cloud.user.domain.UserDto;

import javax.persistence.*;

@Entity // entity로 인식하게 만든다
@Data @Component @Table(name = "board") //Table 이름 결정
public class Article {
    @Id //primary key
    @Column(name = "article_id") //primary key 설정
    @GeneratedValue // 자동으로 시리얼 넘버 생성
    private long articleId;
    @Column(length = 50)@NotNull private String title;
    @Column(length = 200)@NotNull private String content;
    @Column(name = "written_date", length = 20)@NotNull private String writtenDate;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", insertable = false, updatable = false) //불변 바꿀수 없게 한다.
    private UserDto user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "item_id", insertable = false, updatable = false)
    private UserDto item;
}
