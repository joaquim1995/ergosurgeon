package com.mei.ergosurgeon.crud.data.repositories;

import com.mei.ergosurgeon.crud.data.entities.Segment;
import com.mei.ergosurgeon.crud.data.entities.custom.Key;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SegmentRepository extends CrudRepository<Segment, Key> {


}
