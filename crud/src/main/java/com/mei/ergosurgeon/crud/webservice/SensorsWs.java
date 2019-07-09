package com.mei.ergosurgeon.crud.webservice;

import com.mei.ergosurgeon.crud.client.ClientCrud;
import com.mei.ergosurgeon.crud.data.entities.Sensors;
import com.mei.ergosurgeon.crud.data.repositories.SensorsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sensors")
public class SensorsWs implements ClientCrud<SensorsRepository, Sensors> {

    @Autowired
    private SensorsRepository repository;

    @Override
    public SensorsRepository getRepository() {
        return repository;
    }
}
