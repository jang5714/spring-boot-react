package shop.jarviis.app.Cloud.user.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import shop.jarviis.app.Cloud.board.repository.BoardRepository;
import shop.jarviis.app.Cloud.user.domain.UserDto;
import shop.jarviis.app.Cloud.user.service.UserService;

import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class UserController{
    private final UserService userService;

    @GetMapping("/users/{id}")
    public Optional<UserDto> findById(@PathVariable long id){
        return userService.findById(id);
    }
}
