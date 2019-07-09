package com.mei.ergosurgeon.crud.webservice;

import com.mei.ergosurgeon.crud.client.ClientCrud;
import com.mei.ergosurgeon.crud.data.entities.Subject;
import com.mei.ergosurgeon.crud.data.repositories.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/subject")
public class SubjectWs implements ClientCrud<SubjectRepository, Subject> {


    @Autowired
    private SubjectRepository repository;

    @Override
    public SubjectRepository getRepository() {
        return repository;
    }
}
