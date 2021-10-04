package shop.jarviis.app.Cloud.board.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import shop.jarviis.app.Cloud.board.repository.BoardRepository;
import shop.jarviis.app.Cloud.board.service.BoardService;
import shop.jarviis.app.Cloud.board.service.BoardServiceImpl;

@RequiredArgsConstructor
@RestController
public class BoardController {
    private final BoardService boardService;

}
