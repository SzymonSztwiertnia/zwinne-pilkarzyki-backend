package pl.awsb.soccer.reservation.api.response;

import java.time.LocalDateTime;


public record Reservation(
        String name,
        String description,
        LocalDateTime startAt,
        LocalDateTime endAt
) {
}