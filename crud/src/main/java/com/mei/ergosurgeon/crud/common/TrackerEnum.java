package com.mei.ergosurgeon.crud.common;

public enum TrackerEnum {

    Pelvis("Pelvis"),
    T8("T8"),
    Head("Head"),
    RightShoulder("RightShoulder"),
    RightUpperArm("RightUpperArm"),
    RightForeArm("RightForeArm"),
    RightHand("RightHand"),
    LeftShoulder("LeftShoulder"),
    LeftUpperArm("LeftUpperArm"),
    LeftForeArm("LeftForeArm"),
    LeftHand("LeftHand"),
    RightUpperLeg("RightUpperLeg"),
    RightLowerLeg("RightLowerLeg"),
    RightFoot("RightFoot"),
    LeftUpperLeg("LeftUpperLeg"),
    LeftLowerLeg("LeftLowerLeg"),
    LeftFoot("LeftFoot");

    private String value;

    TrackerEnum(String value) {
        this.value = value;
    }

    public static String obtain(int position) {
        return TrackerEnum.values()[position].getValue();
    }

    public String getValue() {
        return value;
    }
}
