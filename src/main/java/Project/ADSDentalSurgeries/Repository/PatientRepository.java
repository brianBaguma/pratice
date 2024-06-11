package Project.ADSDentalSurgeries.Repository;

import Project.ADSDentalSurgeries.Model.Patient;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface PatientRepository extends JpaRepository<Patient, Long> {
    Page<Patient> findByLastName(String lastName, Pageable pageable);
    List<Patient> findByLastName(String lastName);

}
