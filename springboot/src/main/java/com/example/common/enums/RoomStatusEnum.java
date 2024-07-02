package com.example.common.enums;

public enum RoomStatusEnum {
    ROOM_EMPTY("空闲"),
    ROOM_OCCUPIED("已占用"),
    ;
    public String status;

    RoomStatusEnum(String status) {
        this.status = status;
    }
}
