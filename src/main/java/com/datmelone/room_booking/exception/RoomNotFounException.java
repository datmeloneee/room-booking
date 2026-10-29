package com.datmelone.room_booking.exception;

public class RoomNotFounException extends RuntimeException{

    public RoomNotFounException(Long id){
        super("Room with id: " + id + "is not found");
    }

}
