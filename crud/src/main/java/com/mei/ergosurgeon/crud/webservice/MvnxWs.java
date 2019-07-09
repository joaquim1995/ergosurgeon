package com.mei.ergosurgeon.crud.webservice;

import com.mei.ergosurgeon.crud.business.BusinessUtils;
import com.mei.ergosurgeon.crud.client.ClientCrud;
import com.mei.ergosurgeon.crud.data.entities.Mvnx;
import com.mei.ergosurgeon.crud.data.repositories.MvnxRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import java.io.File;

@RestController
@RequestMapping("/mvnx")
public class MvnxWs implements ClientCrud<MvnxRepository, Mvnx> {

    @Autowired
    private MvnxRepository repository;

    @Override
    public MvnxRepository getRepository() {
        return repository;
    }

    @Override
    public ResponseEntity<Mvnx> insert(Mvnx object) {
        try {
            File file = new File("src/main/resources/teste.mvnx");
            JAXBContext jaxbContext = JAXBContext.newInstance(Mvnx.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();
            Mvnx mvnxFile = (Mvnx) jaxbUnmarshaller.unmarshal(file);

            return BusinessUtils.insert(repository, mvnxFile.process());

        } catch (Exception e) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}
