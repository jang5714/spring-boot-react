package shop.jarviis.app.Cloud.user.controller;
import org.modelmapper.ModelMapper;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shop.jarviis.app.Cloud.common.CommonController;
import shop.jarviis.app.Cloud.user.domain.User;
import shop.jarviis.app.Cloud.user.domain.UserDto;
import shop.jarviis.app.Cloud.user.repository.UserRepository;
import shop.jarviis.app.Cloud.user.service.UserService;

import java.util.List;
import java.util.Optional;

@CrossOrigin("*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController implements CommonController<User, Long> {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final UserService userService;
    private final UserRepository userRepository;


    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody UserDto user){
        return ResponseEntity.ok(userService.login(user.getUsername(), user.getPassword()).get());
    }

    @Override
    @GetMapping("/{id}")
    public ResponseEntity<User> getById(@PathVariable Long id){
        System.out.println("getById 컨트롤러");
        System.out.println("임시로 뽑은 유저 객체: "+userRepository.getById(id).toString());
        return ResponseEntity.ok(userRepository.getById(id));
    }

    @Override
    public ResponseEntity<List<User>> findAll() {
        return ResponseEntity.ok(userRepository.findAll());
    }

    @PostMapping()
    @Override
    public ResponseEntity<String> save(@RequestBody User user) {
        logger.info(String.format("회원가입 정조: %s", user.toString()));
        userRepository.save(user);
        return ResponseEntity.ok("SUCCESS");
    }

    @Override
    public ResponseEntity<Optional<User>> findById(Long id) {
        return ResponseEntity.ok(userRepository.findById(id));
    }

    @Override
    public ResponseEntity<Boolean> existsById(Long id) {
        return ResponseEntity.ok(userRepository.existsById(id));
    }

    @Override
    public ResponseEntity<Long> count() {
        return ResponseEntity.ok(userRepository.count());
    }

    @Override
    public ResponseEntity<String> deleteById(Long id) {
        userRepository.deleteById(id);
        return ResponseEntity.ok("SUCCESS");
    }
}
