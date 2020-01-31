package com.mei.ergosurgeon.load.business.utils;

import org.apache.avro.Schema;
import org.apache.avro.reflect.ReflectData;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;


//Not used anymore, for debug proposes, or simply generate the avro schema from a Pojo, a java class.
@Service
@Scope("singleton")
public class AvroSchemaServiceImpl {
    public static Schema generateSchema(Class clazz) {
        return ReflectData.get().getSchema(clazz);
    }

    public String generateSchemaString(Class clazz) {
        return ReflectData.get().getSchema(clazz).toString(true);
    }
}
