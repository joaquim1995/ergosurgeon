package com.mei.ergosurgeon.crud.webservice;

import com.mei.ergosurgeon.crud.client.ClientCrud;
import com.mei.ergosurgeon.crud.data.entities.Joints;
import com.mei.ergosurgeon.crud.data.repositories.JointsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/joints")
public class JointsWs implements ClientCrud<JointsRepository, Joints> {

    @Autowired
    private JointsRepository repository;

    @Override
    public JointsRepository getRepository() {
        return repository;
    }
}
