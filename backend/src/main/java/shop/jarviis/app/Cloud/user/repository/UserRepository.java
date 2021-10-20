package shop.jarviis.app.Cloud.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import shop.jarviis.app.Cloud.user.domain.User;
import shop.jarviis.app.Cloud.user.domain.UserDto;

import javax.transaction.Transactional;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

    @Transactional
//    @Query(value = "select username,password from users where users.username=:username and users.password=:password",
    @Query(value = "select u.username, u.user_id userID , u.name, u.email, u.reg_date regDate, u.password "
            +"from users u where u.username = :username and u.password = :password",
    nativeQuery = true)
    Optional<User> login(@Param("username") String username, @Param("password") String password);
}
