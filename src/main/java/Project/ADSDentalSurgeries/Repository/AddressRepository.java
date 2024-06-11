package Project.ADSDentalSurgeries.Repository;

import Project.ADSDentalSurgeries.Model.Address;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;

import java.awt.print.Pageable;
import java.util.List;

public interface AddressRepository extends JpaRepository<Address, Long> {
    Page<Address> findByCity(String city, Pageable pageable);
    List<Address> findByCityContaining(String city);

}
