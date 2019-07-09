package com.mei.ergosurgeon.crud.webservice;

import com.mei.ergosurgeon.crud.client.ClientCrud;
import com.mei.ergosurgeon.crud.data.entities.Segments;
import com.mei.ergosurgeon.crud.data.repositories.SegmentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/segments")
public class SegmentsWs implements ClientCrud<SegmentsRepository, Segments> {

    @Autowired
    private SegmentsRepository repository;

    @Override
    public SegmentsRepository getRepository() {
        return repository;
    }
}
