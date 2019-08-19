package com.mei.ergosurgeon.load.business;

import com.mei.ergosurgeon.load.data.entities.Mvnx;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.InputStream;

import static org.apache.naming.ResourceRef.SINGLETON;

@Service
@Scope(SINGLETON)
public class UnmarshallerJaxb {

    private static Unmarshaller jaxbUnmarshaller;

    public static Mvnx unmarshal(InputStream inputStream) throws JAXBException {
        try {
            return (Mvnx) jaxbUnmarshaller.unmarshal(inputStream);
        } catch (JAXBException e) {
            e.printStackTrace();
            throw e;
        }
    }

    @PostConstruct
    void init() {
        try {
            jaxbUnmarshaller = JAXBContext.newInstance(Mvnx.class).createUnmarshaller();
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
