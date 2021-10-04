package shop.jarviis.app.Cloud.item.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.jarviis.app.Cloud.item.domain.ItemDto;

@Repository // Repository라는 어노테이션을 하면 여기는  Mapper의 역할을 한다.//Jpa는 Mybatis의 역할을 한다.
public interface ItemRepository extends JpaRepository<ItemDto, Long> {
}
