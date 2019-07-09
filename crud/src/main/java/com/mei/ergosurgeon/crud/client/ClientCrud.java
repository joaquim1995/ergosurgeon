package com.mei.ergosurgeon.crud.client;

import com.mei.ergosurgeon.crud.business.BusinessUtils;
import com.mei.ergosurgeon.crud.data.entities.custom.Key;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

public interface ClientCrud<T extends CrudRepository, V extends Key> {

    T getRepository();

    @GetMapping("/")
    default ResponseEntity<List<V>> getAll() {
        return BusinessUtils.getAll(getRepository());
    }

    @GetMapping("/{id}")
    default ResponseEntity<V> getById(@Valid @PathVariable("id") Long id) {
        return BusinessUtils.getById(getRepository(), id);
    }

    @PostMapping("/")
    default ResponseEntity<V> insert(@Valid @RequestBody V object) {
        return BusinessUtils.insert(getRepository(), object);
    }

    @PutMapping("/{id}")
    default ResponseEntity<V> alter(@RequestBody V object, @Valid @PathVariable("id") Long id) {
        return BusinessUtils.alter(getRepository(), object, id);
    }

    @DeleteMapping("/{id}")
    default ResponseEntity<V> delete(@Valid @PathVariable("id") Long id) {
        return BusinessUtils.delete(getRepository(), id);
    }
}
