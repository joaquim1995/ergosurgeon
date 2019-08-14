package com.mei.ergosurgeon.load.common;

public enum JointEnum {

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

    JointEnum(String value) {
        this.value = value;
    }

    public static String obtain(int position) {
        return JointEnum.values()[position].getValue();
    }

    public String getValue() {
        return value;
    }
}
