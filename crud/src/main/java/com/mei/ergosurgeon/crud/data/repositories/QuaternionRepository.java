package com.mei.ergosurgeon.crud.data.repositories;

import com.mei.ergosurgeon.crud.data.entities.custom.Key;
import com.mei.ergosurgeon.crud.data.entities.custom.Quaternion;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuaternionRepository extends CrudRepository<Quaternion, Key> {


}
