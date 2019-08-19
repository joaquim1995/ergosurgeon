package com.mei.ergosurgeon.load.business;

import org.apache.avro.Schema;
import org.apache.avro.reflect.ReflectData;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

import static org.apache.naming.ResourceRef.SINGLETON;

@Service
@Scope(SINGLETON)
public class AvroSchemaServiceImpl {
    public static Schema generateSchema(Class clazz) {
        return ReflectData.get().getSchema(clazz);
    }

    @PostConstruct
    private void init() {

    }

    public String generateSchemaString(Class clazz) {
        return ReflectData.get().getSchema(clazz).toString(true);
    }
}
