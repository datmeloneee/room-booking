package com.datmelone.room_booking.repository;

import com.datmelone.room_booking.entity.Room;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomRepository extends JpaRepository<Room, Long> {
}
