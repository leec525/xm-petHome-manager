package com.example.common.enums;

public enum FosterStatusEnum {
    FOSTER_OK("寄养中"),
    FOSTER_NO("待确认"),
    FOSTER_RETURN("已领回"),
    ;
    public String status;

    FosterStatusEnum(String status) {
        this.status = status;
    }
}
