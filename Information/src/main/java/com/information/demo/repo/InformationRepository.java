package com.information.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.information.demo.model.InformationModel;

public interface InformationRepository extends JpaRepository<InformationModel, Integer> {
	@Query(value="select * from info1 where name LIKE %:name%", nativeQuery=true) 
	public List<InformationModel> getByName(@Param("name") String name);
	
	@Query(value="select branch from info1", nativeQuery=true)
	public List<String> getAllBranchList();
	
	@Query(value="select id,name, branch from info1", nativeQuery=true)
	public List<Object> getInfo();
	
	@Query(value="select * from info1 order by id desc",nativeQuery = true)
	public List<InformationModel> getOrderName();
  
}
