package com.mei.ergosurgeon.crud.webservice;

import com.mei.ergosurgeon.crud.client.ClientCrud;
import com.mei.ergosurgeon.crud.data.entities.Segment;
import com.mei.ergosurgeon.crud.data.repositories.SegmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segment")
public class SegmentWs implements ClientCrud<SegmentRepository, Segment> {

    @Autowired
    private SegmentRepository repository;

    @Override
    public SegmentRepository getRepository() {
        return repository;
    }
}
