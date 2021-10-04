package shop.jarviis.app.Cloud.item.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import shop.jarviis.app.Cloud.board.repository.BoardRepository;
import shop.jarviis.app.Cloud.item.service.ItemServiceImpl;

@RequiredArgsConstructor
@RestController
public class ItemController {
    private final ItemServiceImpl itemService;


}
