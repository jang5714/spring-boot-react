package shop.jarviis.app.Cloud.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import shop.jarviis.app.Cloud.user.domain.User;
import shop.jarviis.app.Cloud.user.domain.UserDto;
import shop.jarviis.app.Cloud.user.repository.UserRepository;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{
    private final UserRepository userRepository;

    @Override
    public Optional<User> findById(long userId) {
        return userRepository.findById(userId);
    }

    @Override
    public String login(String username, String password) {
        return userRepository.login(username, password);
    }
}
