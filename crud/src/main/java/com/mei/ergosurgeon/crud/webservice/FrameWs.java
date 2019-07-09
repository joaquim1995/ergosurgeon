package com.mei.ergosurgeon.crud.webservice;

import com.mei.ergosurgeon.crud.client.ClientCrud;
import com.mei.ergosurgeon.crud.data.entities.Frame;
import com.mei.ergosurgeon.crud.data.repositories.FrameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frame")
public class FrameWs implements ClientCrud<FrameRepository, Frame> {

    @Autowired
    private FrameRepository repository;

    @Override
    public FrameRepository getRepository() {
        return repository;
    }
}
