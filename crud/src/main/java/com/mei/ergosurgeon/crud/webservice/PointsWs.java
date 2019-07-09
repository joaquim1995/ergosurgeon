package com.mei.ergosurgeon.crud.webservice;

import com.mei.ergosurgeon.crud.client.ClientCrud;
import com.mei.ergosurgeon.crud.data.entities.Points;
import com.mei.ergosurgeon.crud.data.repositories.PointsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/points")
public class PointsWs implements ClientCrud<PointsRepository, Points> {

    @Autowired
    private PointsRepository repository;

    @Override
    public PointsRepository getRepository() {
        return repository;
    }
}
