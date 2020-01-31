package com.mei.ergosurgeon.load.business.transform;

import com.mei.ergosurgeon.load.data.entities.Mvnx;
import lombok.Getter;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;


@Getter
@Service
@Scope("singleton")
public class JaxbContext {

    private JAXBContext context;

    @PostConstruct
    private void init() {
        try {
            context = JAXBContext.newInstance(Mvnx.class);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
