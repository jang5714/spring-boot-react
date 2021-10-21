package shop.jarviis.app.Cloud.item.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import shop.jarviis.app.Cloud.board.repository.BoardRepository;
import shop.jarviis.app.Cloud.common.CommonController;
import shop.jarviis.app.Cloud.item.domain.ItemDto;
import shop.jarviis.app.Cloud.item.repository.ItemRepository;
import shop.jarviis.app.Cloud.item.service.ItemService;
import shop.jarviis.app.Cloud.item.service.ItemServiceImpl;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class ItemController implements CommonController<ItemDto, Long> {
    private final ItemService itemService;
    private final ItemRepository itemRepository;


    @Override
    public ResponseEntity<List<ItemDto>> findAll() {
        return ResponseEntity.ok(itemRepository.findAll());
    }

    @Override
    public ResponseEntity<ItemDto> getById(Long id) {
        return ResponseEntity.ok(itemRepository.getById(id));
    }

    @Override
    public ResponseEntity<String> save(ItemDto item) {
        itemRepository.save(item);
        return ResponseEntity.ok("SUCCESS");
    }

    @Override
    public ResponseEntity<Optional<ItemDto>> findById(Long id) {
        return ResponseEntity.ok(itemRepository.findById(id));
    }

    @Override
    public ResponseEntity<Boolean> existsById(Long id) {
        return ResponseEntity.ok(itemRepository.existsById(id));
    }

    @Override
    public ResponseEntity<Long> count() {
        return ResponseEntity.ok(itemRepository.count());
    }

    @Override
    public ResponseEntity<String> deleteById(Long id) {
        itemRepository.deleteById(id);
        return ResponseEntity.ok("SUCCESS");
    }
}