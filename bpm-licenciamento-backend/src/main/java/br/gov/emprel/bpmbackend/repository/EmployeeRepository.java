package br.gov.emprel.bpmbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.gov.emprel.bpmbackend.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}