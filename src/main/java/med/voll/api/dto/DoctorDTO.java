package med.voll.api.dto;

import jakarta.validation.Valid;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record DoctorDTO(
        @NotBlank String name,
        @NotBlank @Email String email,
        @NotBlank String cellphone,
        @NotBlank @Pattern(regexp = "\\d{4,6}") String crm,
        @NotNull SpeciallityDTO speciality,
        @NotNull @Valid PersonalAddressDTO personalAddress
) {}
