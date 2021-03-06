package shop.jarviis.app.Cloud.user.service;

import shop.jarviis.app.Cloud.user.domain.User;
import shop.jarviis.app.Cloud.user.domain.UserDto;

import java.util.List;
import java.util.Optional;


public interface UserService {
   Optional<User> findById(long userId);
   Optional<User> login(String username, String password);

}
