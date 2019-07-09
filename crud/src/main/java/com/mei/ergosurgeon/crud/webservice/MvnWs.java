package com.mei.ergosurgeon.crud.webservice;

import com.mei.ergosurgeon.crud.client.ClientCrud;
import com.mei.ergosurgeon.crud.data.entities.Mvn;
import com.mei.ergosurgeon.crud.data.repositories.MvnRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mvn")
public class MvnWs implements ClientCrud<MvnRepository, Mvn> {

    @Autowired
    private MvnRepository repository;

    @Override
    public MvnRepository getRepository() {
        return repository;
    }
}
