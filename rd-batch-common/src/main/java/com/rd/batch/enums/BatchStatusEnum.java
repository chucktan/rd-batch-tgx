package com.rd.batch.enums;

/**
 * @DESC :是否 枚举
 */
public enum BatchStatusEnum {

    INIT(0,"未执行"),
    SUCCESS(1,"执行成功"),
    FAIL(2,"执行失败"),
    EXECUTING(3,"执行中"),
    PAUSE(4,"暂停");

    public  final  Integer type;
    public  final  String value;

    BatchStatusEnum(Integer type, String value) {
        this.type = type;
        this.value = value;
    }
}
