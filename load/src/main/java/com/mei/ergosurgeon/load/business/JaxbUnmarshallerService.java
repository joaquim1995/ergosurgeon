package com.mei.ergosurgeon.load.business;

import com.mei.ergosurgeon.load.data.entities.Mvnx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.context.annotation.RequestScope;

import javax.xml.bind.JAXBException;
import java.io.InputStream;


@Service
@RequestScope
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
