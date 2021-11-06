package shop.jarviis.app.Cloud.emp.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import shop.jarviis.app.Cloud.common.CommonController;
import shop.jarviis.app.Cloud.emp.domain.Emp;
import shop.jarviis.app.Cloud.emp.domain.EmpDto;


import java.util.List;
import java.util.Optional;

@RequiredArgsConstructor
@RestController
@RequestMapping("/emp")
public class EmpController<EmpRepository> implements CommonController<Emp, Long> {

    @Override
    public ResponseEntity<List<Emp>> findAll() {
        return null;
    }

    @Override
    public ResponseEntity<Emp> getById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<String> save(Emp entity) {
        return null;
    }

    @Override
    public ResponseEntity<Optional<Emp>> findById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Boolean> existsById(Long id) {
        return null;
    }

    @Override
    public ResponseEntity<Long> count() {
        return null;
    }

    @Override
    public ResponseEntity<String> deleteById(Long id) {
        return null;
    }
}
