package med.voll.api.dto;

import med.voll.api.models.Doctor;

public record DoctorRecoverDTO(
        Long id,
        String name,
        String email,
        String crm,
        SpeciallityDTO speciality
) {
    public DoctorRecoverDTO(Doctor doctor) {
        this(doctor.getId(), doctor.getName(), doctor.getEmail(), doctor.getCrm(), doctor.getSpeciality());
    }
}

