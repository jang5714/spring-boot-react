package shop.jarviis.app.Cloud.item.domain;

import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.apachecommons.CommonsLog;
import org.springframework.stereotype.Component;
import shop.jarviis.app.Cloud.board.domain.Article;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;


@Entity
@Data @Component @Table(name = "items")
public class ItemDto {
    @Id
    @Column(name = "item_id")

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long itemId;

    @Column(name = "item_brand", length = 20)@NotNull private String itemBrand;
    @Column(name = "item_name", length = 50)@NotNull private String itemName;
    @Column(name = "item_color", length = 20)@NotNull private String itemColor;
    @Column(name = "released_date", length = 20)@NotNull private String releasedDate;
    @OneToMany(mappedBy = "item")
    private List<Article> articleList = new ArrayList<>();
}
