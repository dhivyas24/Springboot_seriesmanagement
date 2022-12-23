package com.example.SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;





	@RestController
	@RequestMapping(path="/series/{id}")
	public class update {	
		@Autowired WebRepo ob;
		@PutMapping()
		    public String getAllNotes(@RequestBody Webseries log,@PathVariable("id") int cid)
		    {
			 //LogModel logs = ob.findbybookid(bookid);
			
			 int id =log.getId();
			 String name=log.getSname();
			 String season=log.getSeason();
			 String ep=log.getEp();
			 String rat=log.getRat();
				       
						
				ob.update(id,name,season,ep,rat,cid);
					 
					 //ob.save(log);
			// return"success";
			return "successfully updated";
	}
		
	}


		