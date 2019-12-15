package com.mei.ergosurgeon.evaluate.transformers;

import com.mei.ergosurgeon.schema.entities.Client;

public class StreamProcessorUtils {
    public static Client processClient(Client item) {

        //To 0 is given the meaning of start. The first position.
        //item.setPosition(new Vaector(0L, aux[0], aux[1], aux[2], item.getLabel()));
        return item;
    }
}
