package com.mei.ergosurgeon.crud.data.repositories;

import com.mei.ergosurgeon.crud.data.entities.Mvn;
import com.mei.ergosurgeon.crud.data.entities.custom.Key;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MvnRepository extends CrudRepository<Mvn, Key> {


}
