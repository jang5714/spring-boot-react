package shop.jarviis.app.Cloud.user.service;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import shop.jarviis.app.Cloud.user.domain.UserDto;

import java.util.Optional;

public interface UserService {
   Optional<UserDto> findById(long userId);
}
