package sit.int221.TimeUpBackend.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import sit.int221.TimeUpBackend.Entity.Booking;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking , Integer> {

}
