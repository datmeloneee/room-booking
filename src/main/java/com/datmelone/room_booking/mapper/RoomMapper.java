package com.datmelone.room_booking.mapper;

import org.springframework.stereotype.Component;

import com.datmelone.room_booking.dto.RoomRequest;
import com.datmelone.room_booking.dto.RoomResponse;
import com.datmelone.room_booking.entity.Room;

@Component 
public class RoomMapper {

    public RoomResponse toResponse(Room room){
        return new RoomResponse(room.getId(), room.getName(), room.getCapacity(),
    room.getDescription(), room.getCreatedAt());
    }

    public Room toEntity(RoomRequest roomRequest){
        return new Room(roomRequest.name(), roomRequest.capacity(), roomRequest.description());
    } 
}
