package com.example.SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/series/{id}")

public class delete {

		@Autowired WebRepo ob;
		@DeleteMapping()
		    public String deletebyid(@PathVariable("id") int id)
		    {
			 
			
			 
						ob.deleteAllByIdInBatch(id);
						
					 
				
			return "deleted updated";
	}
		
	}

