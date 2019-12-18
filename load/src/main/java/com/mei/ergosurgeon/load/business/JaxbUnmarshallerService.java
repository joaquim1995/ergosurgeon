package com.mei.ergosurgeon.load.business;

import com.mei.ergosurgeon.load.data.entities.Mvnx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.xml.bind.JAXBException;
import java.io.InputStream;


@Service
@Scope("request")
public class JaxbUnmarshallerService {

    @Autowired
    private JaxbContext context;

    public Mvnx unmarshal(InputStream inputStream) throws JAXBException {
        try {
            return (Mvnx) context.getContext().createUnmarshaller().unmarshal(inputStream);
        } catch (JAXBException e) {
            e.printStackTrace();
            throw e;
        }
    }
}
