package com.mei.ergosurgeon.load.data.rules;

import com.mei.ergosurgeon.load.business.api.KafkaLoadService;
import com.mei.ergosurgeon.load.data.entities.id.Client;

import java.util.List;
import java.util.stream.Collectors;

/***
 * Topic father is the imaginative behaviour of a father on a good environment.
 * Is like be a father in the world, you have to work hard, you are human.
 * Is espected while a father that you work for other people.
 * You are part of a central process. You do the heavy load.
 * You give the birth of a son.
 */
public interface TopicFather {
    /***
     * Force a implementation that call, set ids
     * @param proxy
     * @param client
     * @throws Exception
     */
    void process(KafkaLoadService proxy, Client client) throws Exception;

    default void process(KafkaLoadService proxy, Client client, List<?>... lists) throws Exception {
        for (List<?> messages : lists)
            for (AbstractKafkaTopic message : setIds(messages))
                message.send(proxy, client);
    }

    /***
     * Set a incremental id. Upper hierarchy objects need to send,
     * while what we send needs a key so we can create a ML model based on SQL query.
     * Use it with send, or on process of other objects.
     */
    default List<AbstractKafkaTopic> setIds(List<?> messages) {
        int i = 1;

        List<AbstractKafkaTopic> aux = messages.stream().map(item -> (AbstractKafkaTopic) item).collect(Collectors.toList());
        for (AbstractKafkaTopic message : aux)
            message.setId(i++);

        return aux;
    }
}
