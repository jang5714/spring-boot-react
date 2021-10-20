package shop.jarviis.app.Cloud.user.controller;
import org.modelmapper.ModelMapper;
import lombok.RequiredArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import shop.jarviis.app.Cloud.user.domain.User;
import shop.jarviis.app.Cloud.user.domain.UserDto;
import shop.jarviis.app.Cloud.user.service.UserService;

import java.util.Optional;

@CrossOrigin("*")
@RequiredArgsConstructor
@RestController
@RequestMapping("/users")
public class UserController{
    private final Logger logger = LoggerFactory.getLogger(this.getClass());
    private final UserService userService;

    @PostMapping()
    public ResponseEntity<Optional<User>> join(@RequestBody User user){
        logger.info(String.format("User Join Info is %s", user.toString()));
        return null;
    }

    @PostMapping("/login")
    public ResponseEntity<User> login(@RequestBody UserDto user){
        return ResponseEntity.ok(userService.login(user.getUsername(), user.getPassword()).get());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserDto> getById(@PathVariable long id){
        System.out.println("------------------");
        User user = userService.findById(id).get();
        UserDto userSerializer = UserDto.builder()
                .userId(user.getUserId())
                .username(user.getUsername())
                .password(user.getPassword())
                .name(user.getName())
                .email(user.getEmail())
                .regDate(user.getRegDate())
                .build();
        return new ResponseEntity<>(userSerializer, HttpStatus.OK);
    }
}
