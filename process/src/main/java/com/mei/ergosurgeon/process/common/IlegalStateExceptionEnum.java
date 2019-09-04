package com.mei.ergosurgeon.process.common;

public enum IlegalStateExceptionEnum {

    AVRO_INDEX_RECORD_GET("AVRO_INDEX_RECORD_GET"),
    AVRO_INDEX_RECORD_PUT("AVRO_INDEX_RECORD_PUT");

    private String value;

    IlegalStateExceptionEnum(String value) {
        this.value = value;
    }

    public static String obtain(int position) {
        return IlegalStateExceptionEnum.values()[position].getValue();
    }

    public String getValue() {
        return value;
    }
}
