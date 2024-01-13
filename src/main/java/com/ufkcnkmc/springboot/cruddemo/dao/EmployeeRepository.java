package com.ufkcnkmc.springboot.cruddemo.dao;

import com.ufkcnkmc.springboot.cruddemo.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {
    //bir şey tanımlamamıza gerek yok service paketinin içindeki impla classını düzeltcez
}
