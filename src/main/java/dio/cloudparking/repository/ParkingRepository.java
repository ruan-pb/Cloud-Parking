package dio.cloudparking.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import dio.cloudparking.entity.Parking;

public interface ParkingRepository extends JpaRepository<Parking, String>{

}
