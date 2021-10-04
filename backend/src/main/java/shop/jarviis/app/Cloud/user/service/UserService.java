package shop.jarviis.app.Cloud.user.service;

import shop.jarviis.app.Cloud.user.domain.User;

import java.util.Optional;

public interface UserService {
   Optional<User> findById(long userId);
}
