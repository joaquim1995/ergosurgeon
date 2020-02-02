package com.mei.ergosurgeon.load.data.rules;

import lombok.Getter;

@Getter
public abstract class AbstractTopic implements Topic {
    private Integer id;

    public <T extends AbstractKafkaTopic> T setId(Integer id) {
        this.id = id;
        return (T) this;
    }

    /***
     * Implement bussines rules that lead to a exception.
     */
    public void validateRules(Object... args) {
        return;
    }

    /***
     * Clean up data.
     */
    public void cleanUp(Object... args) {
        return;
    }

    public abstract String getTopic();

    public String getInternalTopic() {
        return "raw_" + getTopic();
    }
}
