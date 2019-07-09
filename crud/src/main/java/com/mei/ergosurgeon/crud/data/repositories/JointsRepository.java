package com.mei.ergosurgeon.crud.data.repositories;

import com.mei.ergosurgeon.crud.data.entities.Joints;
import com.mei.ergosurgeon.crud.data.entities.custom.Key;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JointsRepository extends CrudRepository<Joints, Key> {


}
