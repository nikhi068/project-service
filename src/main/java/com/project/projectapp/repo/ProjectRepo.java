package com.project.projectapp.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.project.projectapp.entity.Project;



public interface ProjectRepo extends JpaRepository<Project, Integer> {

	@Query(nativeQuery = true, value="SELECT ea.id,ea.domain,ea.name FROM emplyeedb.project ea join emplyeedb.employee e on e.id=ea.employee_id where ea.employee_id=:employeeId")
	Project findProjectDetailsByEmployeeId(@Param("employeeId") int employeeId);
}
