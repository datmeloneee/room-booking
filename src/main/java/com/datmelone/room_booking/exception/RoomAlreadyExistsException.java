package com.datmelone.room_booking.exception;

public class RoomAlreadyExistsException extends RuntimeException{
    
    public RoomAlreadyExistsException(String name){
        super("Room with name: " + name + " already exists");
    }
}
