package shop.jarviis.app.Cloud.user.controller;

import lombok.RequiredArgsConstructor;
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
    private final UserService userService;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody User user){

        String returnUser = userService.login(user.getUsername(), user.getPassword());
        System.out.println("마리아DB에서 넘어온 정보: "+returnUser.toString());
        return new ResponseEntity<>(HttpStatus.OK);
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
