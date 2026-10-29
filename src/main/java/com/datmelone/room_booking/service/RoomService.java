package com.datmelone.room_booking.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.datmelone.room_booking.dto.RoomRequest;
import com.datmelone.room_booking.dto.RoomResponse;
import com.datmelone.room_booking.exception.RoomAlreadyExistsException;
import com.datmelone.room_booking.mapper.RoomMapper;
import com.datmelone.room_booking.repository.RoomRepository;


@Service 
public class RoomService {

    private final RoomRepository repository;
    private final RoomMapper mapper;

    public RoomService(RoomRepository repository, RoomMapper mapper){
        this.repository = repository;
        this.mapper = mapper;
    }

    @Transactional 
    public RoomResponse create(RoomRequest roomRequest){
        if(repository.existsByName(roomRequest.name())){
            throw new RoomAlreadyExistsException(roomRequest.name());
        }
        return mapper.toResponse(repository.save(mapper.toEntity(roomRequest)));    
    }
}
