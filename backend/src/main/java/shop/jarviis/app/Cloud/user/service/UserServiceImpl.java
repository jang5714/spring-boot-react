package shop.jarviis.app.Cloud.user.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import shop.jarviis.app.Cloud.user.domain.UserDto;
import shop.jarviis.app.Cloud.user.repository.UserRepository;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService{
    public final UserRepository userRepository;

    @Override
    public Optional<UserDto> findById(long userId) {
        return userRepository.findById(userId);
    }
}
