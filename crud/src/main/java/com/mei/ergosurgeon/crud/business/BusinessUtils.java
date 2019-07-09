package com.mei.ergosurgeon.crud.business;

import com.mei.ergosurgeon.crud.data.DataUtils;
import com.mei.ergosurgeon.crud.data.entities.custom.Key;
import com.mei.ergosurgeon.crud.webservice.validations.ValidationUtils;
import org.springframework.data.repository.CrudRepository;
import org.springframework.http.ResponseEntity;
import org.springframework.util.CollectionUtils;

import java.util.List;
import java.util.Optional;
import java.util.Set;

public interface BusinessUtils {

    static <T extends CrudRepository, V extends Key> ResponseEntity<List<V>> getAll(T repository) {
        List<V> aux = DataUtils.getAll(repository);
        if (CollectionUtils.isEmpty(aux))
            return ResponseEntity.noContent().build();
        else
            return ResponseEntity.ok(aux);
    }

    static <T extends CrudRepository, V extends Key, K> ResponseEntity<V> getById(T repository, Long id) {

        Key auxId = new Key().setId(id);
        Set validation = ValidationUtils.validation(auxId);

        if (CollectionUtils.isEmpty(validation)) {
            Optional<V> aux = DataUtils.getById(repository, auxId);
            if (aux.isPresent())
                return ResponseEntity.ok(aux.get());
            else
                return ResponseEntity.noContent().build();
        } else
            return ResponseEntity.badRequest().build();
    }

    static <T extends CrudRepository, V extends Key, K> ResponseEntity<V> insert(T repository, V value) {
        return ResponseEntity.ok(DataUtils.insert(repository, value));
    }

    static <T extends CrudRepository, V extends Key, K> ResponseEntity<V> alter(T repository, V value, Long id) {
        Key auxId = new Key().setId(id);
        Set validation = ValidationUtils.validation(auxId);

        if (CollectionUtils.isEmpty(validation)) {
            Optional<V> aux = DataUtils.alter(repository, value, auxId);
            if (aux.isPresent())
                return ResponseEntity.ok(aux.get());
            else
                return ResponseEntity.noContent().build();
        } else
            return ResponseEntity.badRequest().build();
    }

    static <T extends CrudRepository, V extends Key, K extends Key> ResponseEntity<V> delete(T repository, Long id) {
        Key auxId = new Key().setId(id);
        Set validation = ValidationUtils.validation(auxId);

        if (CollectionUtils.isEmpty(validation)) {
            Optional<V> aux = DataUtils.delete(repository, auxId);
            if (aux.isPresent())
                return ResponseEntity.ok(aux.get());
            else
                return ResponseEntity.noContent().build();
        } else
            return ResponseEntity.badRequest().build();
    }
}
