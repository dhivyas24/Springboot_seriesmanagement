package com.example.SpringBootApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/addseries")
public class save {

@Autowired WebRepo ob;

@PostMapping()
	public <S> String savebook(@RequestBody Webseries log)
	{
	Webseries a= new Webseries();
	int id=log.getId();
	String name =log.getSname();
     String  ep =log.getEp();
	String rat = log.getRat();
	String seasons = log.getSeason();
a.setId(id);
a.setEp(ep);
a.setRat(rat);
a.setSeason(seasons);	
a.setSname(name);
 Webseries first = new Webseries(id,name,ep,seasons,rat);
	ob.save(first);
	
return "saved successfully";
//return "saved successfully";
	
}
}
  