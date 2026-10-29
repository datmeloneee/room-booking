package com.datmelone.room_booking.dto;

import java.time.Instant;

public record RoomResponse(
    Long id,
    String name,
    int capacity,
    String description,
    Instant created_at
) {}
