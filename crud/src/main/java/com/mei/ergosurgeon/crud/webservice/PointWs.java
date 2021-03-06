package com.mei.ergosurgeon.crud.webservice;

import com.mei.ergosurgeon.crud.client.ClientCrud;
import com.mei.ergosurgeon.crud.data.entities.Point;
import com.mei.ergosurgeon.crud.data.repositories.PointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/point")
public class PointWs implements ClientCrud<PointRepository, Point> {

    @Autowired
    private PointRepository repository;

    @Override
    public PointRepository getRepository() {
        return repository;
    }
}
