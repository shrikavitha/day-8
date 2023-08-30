package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Bike;
import com.example.demo.repository.BikeRepo;

@Service
public class ApiService {

	@Autowired
	BikeRepo br;
	public Bike saveinfo(Bike bb)
	{
		return br.save(bb);
	}
	
	public List<Bike> savedetails(List<Bike> bb){
		
		return (List<Bike>)br.saveAll(bb);
	}
	public List<Bike> showinfo()
	{
	      return br.findAll();
	}
	public List<Bike> getbike(int s)
	{
		return br.getBikeInfo(s);
	}
	
	public List<Bike> getbikename(String bikename)
	{
		return br.getBikeInfoname(bikename);
	}
	public List<Bike> getbiketypes(int i,String s)
	{
		return br.getBikeInfobytypes(i, s);
	}
}
