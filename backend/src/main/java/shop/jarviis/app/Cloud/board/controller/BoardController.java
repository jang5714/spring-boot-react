package shop.jarviis.app.Cloud.board.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import shop.jarviis.app.Cloud.board.domain.Article;
import shop.jarviis.app.Cloud.board.repository.BoardRepository;
import shop.jarviis.app.Cloud.board.service.BoardService;
import shop.jarviis.app.Cloud.board.service.BoardServiceImpl;
import shop.jarviis.app.Cloud.common.CommonController;

import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
public class BoardController implements CommonController<Article, Long> {
    private final BoardService boardService;
    private final BoardRepository boardRepository;

    @Override
    public ResponseEntity<List<Article>> findAll() {
        return ResponseEntity.ok(boardRepository.findAll());
    }

    @Override
    public ResponseEntity<Article> getById(Long id) {
        return ResponseEntity.ok(boardRepository.getById(id));
    }

    @Override
    public ResponseEntity<String> save(Article article) {
        boardRepository.save(article);
        return ResponseEntity.ok("SUCCESS");
    }

    @Override
    public ResponseEntity<Optional<Article>> findById(Long id) {
        return ResponseEntity.ok(boardRepository.findById(id));
    }

    @Override
    public ResponseEntity<Boolean> existsById(Long id) {
        return ResponseEntity.ok(boardRepository.existsById(id));
    }

    @Override
    public ResponseEntity<Long> count() {
        return ResponseEntity.ok(boardRepository.count());
    }

    @Override
    public ResponseEntity<String> deleteById(Long id) {
        boardRepository.deleteById(id);
        return ResponseEntity.ok("SUCCESS");
    }
}
