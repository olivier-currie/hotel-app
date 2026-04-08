package com.hotel.hotel_app.repositories;

import com.hotel.hotel_app.models.Employee;
import org.springframework.data.jpa.respository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}