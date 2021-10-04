package shop.jarviis.app.Cloud.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import shop.jarviis.app.Cloud.user.domain.UserDto;

@Repository
public interface UserRepository extends JpaRepository<UserDto, Long> {
}
