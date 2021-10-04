package shop.jarviis.app.Cloud.board.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.jarviis.app.Cloud.board.domain.Article;

@Repository
public interface BoardRepository extends JpaRepository <Article, Long> {
}
