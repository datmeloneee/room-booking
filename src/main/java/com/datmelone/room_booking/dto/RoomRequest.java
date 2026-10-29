package com.datmelone.room_booking.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;

public record RoomRequest(
    @NotBlank(message = "Name cannot be null, empty or consist of whitespace")
    @Size(max = 100)
    String name,
    @NotNull(message = "Capacity cannot be null")
    @Positive(message = "Capacity must be positive")
    @Max(value = 40, message = "Capacity must be less than 40 person")
    int capacity,
    @Size(max = 500, message = "Description must be less than 500 symbols")
    String description
) {}
