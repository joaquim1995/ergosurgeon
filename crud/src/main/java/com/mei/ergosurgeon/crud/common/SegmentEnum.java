package com.mei.ergosurgeon.crud.common;

public enum SegmentEnum {

    Pelvis("Pelvis"),
    L5("L5"),
    L3("L3"),
    T12("T12"),
    T8("T8"),
    Neck("Neck"),
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
    RightToe("RightToe"),
    LeftUpperLeg("LeftUpperLeg"),
    LeftLowerLeg("LeftLowerLeg"),
    LeftFoot("LeftFoot"),
    LeftToe("LeftToe");

    private String value;

    SegmentEnum(String value) {
        this.value = value;
    }

    public static String obtain(int position) {
        return SegmentEnum.values()[position].getValue();
    }

    public String getValue() {
        return value;
    }
}
