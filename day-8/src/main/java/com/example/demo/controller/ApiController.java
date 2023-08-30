package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Bike;
import com.example.demo.service.ApiService;

@RestController
public class ApiController {

	@Autowired
	ApiService asr;
	
	@PostMapping("addbike")
	public Bike add(@RequestBody Bike bb) {		
		return asr.saveinfo(bb);
	}
	
	@PostMapping("addnbike")
	public List<Bike> addndetails(@RequestBody List<Bike> bb)
	{
		return asr.savedetails(bb);
	}
	@GetMapping("showdetails")
	public List<Bike> show()
	{
		return asr.showinfo();
	}
	
	@GetMapping("showquery/{year}")
	public 	List<Bike> showstudetails(@PathVariable int year)
	{
		return asr.getbike(year);
	}

	
	@GetMapping("showquerybyname/{bikename}")
	public 	List<Bike> showstudetailsbyname(@PathVariable String bikename)
	{
		return asr.getbikename(bikename);
	}
	
	@GetMapping("year/{year}/bikename/{bikename}")
	public 	List<Bike> showstudetails(@PathVariable int year,@PathVariable String bikename)
	{
		return asr.getbiketypes(year, bikename);
	}
}
