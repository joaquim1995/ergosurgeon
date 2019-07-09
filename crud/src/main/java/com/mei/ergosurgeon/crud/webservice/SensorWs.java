package com.mei.ergosurgeon.crud.webservice;

import com.mei.ergosurgeon.crud.client.ClientCrud;
import com.mei.ergosurgeon.crud.data.entities.Sensor;
import com.mei.ergosurgeon.crud.data.repositories.SensorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sensor")
public class SensorWs implements ClientCrud<SensorRepository, Sensor> {

    @Autowired
    private SensorRepository repository;

    @Override
    public SensorRepository getRepository() {
        return repository;
    }
}
