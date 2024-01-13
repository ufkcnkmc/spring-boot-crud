package com.ufkcnkmc.springboot.cruddemo.service;

import com.ufkcnkmc.springboot.cruddemo.dao.EmployeeRepository;
import com.ufkcnkmc.springboot.cruddemo.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;


@Service
public class EmployeeServiceImpl implements EmployeeService{


    private EmployeeRepository employeeRepository;


    @Autowired
    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository){
        employeeRepository=theEmployeeRepository;
    }//BURASI CONSTRUCTOR ENJEKSİYON KISMI TAM ANLAMADIM AMA ÖĞRENİCEM



    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> result = employeeRepository.findById(theId);

        Employee theEmployee=null;

        if(result.isPresent()){
            theEmployee=result.get();
        }
        else{
            throw new RuntimeException("Kullanici bulunamadi id'si"+theId);
        }

        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        return employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);

    }
}
