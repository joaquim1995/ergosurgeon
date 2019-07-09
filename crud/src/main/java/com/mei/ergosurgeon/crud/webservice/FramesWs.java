package com.mei.ergosurgeon.crud.webservice;

import com.mei.ergosurgeon.crud.client.ClientCrud;
import com.mei.ergosurgeon.crud.data.entities.Frames;
import com.mei.ergosurgeon.crud.data.repositories.FramesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/frames")
public class FramesWs implements ClientCrud<FramesRepository, Frames> {

    @Autowired
    private FramesRepository repository;

    @Override
    public FramesRepository getRepository() {
        return repository;
    }


}
