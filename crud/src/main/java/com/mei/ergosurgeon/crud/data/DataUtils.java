package com.mei.ergosurgeon.crud.data;

import com.mei.ergosurgeon.crud.data.entities.custom.Key;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.StreamSupport;

public class DataUtils {

    public static <T extends CrudRepository, V extends Key> List<V> getAll(T repository) {
        return (List<V>) StreamSupport
                .stream(repository.findAll().spliterator(), true)
                .collect(Collectors.toList());
    }

    public static <T extends CrudRepository, V extends Key, K extends Key> Optional<V> getById(T repository, K id) {
        return repository.findById(id.getId());
    }

    public static <T extends CrudRepository, V extends Key, K extends Key> V insert(T repository, V value) {
        return (V) repository.save(value);
    }

    public static <T extends CrudRepository, V extends Key, K extends Key> Optional<V> alter(T repository, V value, K id) {
        Optional<V> aux = repository.findById(id);
        if (aux.isPresent())
            repository.save(aux.get());

        return aux;
    }

    public static <T extends CrudRepository, V extends Key, K extends Key> Optional<V> delete(T repository, K id) {
        Optional<V> aux = repository.findById(id);
        if (aux.isPresent())
            repository.delete(aux.get());

        return aux;
    }
}
