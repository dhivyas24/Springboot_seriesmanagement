package com.example.SpringBootApp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path="/series/{id}")
public class Findbysid {
	@Autowired WebRepo ob;
	@GetMapping()
	    public List<Webseries> getAllNotes(@PathVariable("id") int id)
	    {

	        return ob.findbytid(id);

	        
	    }
}