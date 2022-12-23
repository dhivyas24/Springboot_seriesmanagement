package com.example.SpringBootApp;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;
 

public interface WebRepo extends JpaRepository<Webseries,Integer> {

	
	    List<Webseries> findAll();
	    
	    @Query(value = "SELECT * FROM webseries u where u.id = ?1", nativeQuery = true)
	    List<Webseries> findbytid(int id);
	    

@Transactional
@Modifying
@Query(value = "Update series u set u.id = ?1 , u.sname =?2 , u.season = ?3  ,u.ep=?4,u.rat=?5 where u.id = ?6 ", nativeQuery = true)
void update(int id,String sname,String season,String ep,String rat,int cid);

@Modifying
@Transactional 
@Query(value = "DELETE FROM webseries t WHERE t.id= ?1 ", nativeQuery = true)
void deleteAllByIdInBatch(int tid);

}