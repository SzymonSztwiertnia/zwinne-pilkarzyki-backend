package pl.awsb.soccer.auth.api.request;

import jakarta.validation.constraints.NotBlank;

public record AuthRegisterRequest(
        @NotBlank(message = "Podanie e-mail jest wymagane.") String email,
        @NotBlank(message = "Podanie hasła jest wymagane.") String password
) {
}
