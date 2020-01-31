package com.mei.ergosurgeon.load.data.rules;

public interface Topic {

    /***
     * Set a incremental id. Upper hierarchy objects need to send,
     * while what we send needs a key so we can create a ML model based on SQL query.
     * Use it with send, or on process of other objects.
     * @param id
     */
    <T extends AbstractKafkaTopic> T setId(Integer id);

    String getTopic();

    default String getInternalTopic() {
        return "raw_" + getTopic();
    }
}
