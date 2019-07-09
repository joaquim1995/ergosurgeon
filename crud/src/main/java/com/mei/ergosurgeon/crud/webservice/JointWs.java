package com.mei.ergosurgeon.crud.webservice;

import com.mei.ergosurgeon.crud.client.ClientCrud;
import com.mei.ergosurgeon.crud.data.entities.Joint;
import com.mei.ergosurgeon.crud.data.repositories.JointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/joint")
public class JointWs implements ClientCrud<JointRepository, Joint> {

    @Autowired
    private JointRepository repository;

    @Override
    public JointRepository getRepository() {
        return repository;
    }
}
