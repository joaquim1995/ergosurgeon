package com.mei.ergosurgeon.crud.data.repositories;

import com.mei.ergosurgeon.crud.data.entities.Sensors;
import com.mei.ergosurgeon.crud.data.entities.custom.Key;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SensorsRepository extends CrudRepository<Sensors, Key> {


}
