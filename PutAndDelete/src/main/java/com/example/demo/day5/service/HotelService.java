package com.example.demo.day5.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.day5.model.HotelModel;

import com.example.demo.day5.repository.HotelRepository;

@Service
public class HotelService {
	@Autowired
	public HotelRepository hp;
	//post the data
	public HotelModel saveDetails(HotelModel hm)
	{
		return hp.save(hm);
	}
	//get the data
	public List<HotelModel>getDetails()
	{
		return hp.findAll();
	}
	//update the data
	public HotelModel updateDetails(HotelModel hc)
	{
		return hp.saveAndFlush(hc);
	} 
	//delete if id is present
	public boolean deletehotelinfo(int hotelId)
	{
		if(hp.existsById(hotelId))
		{
			hp.deleteById(hotelId);
			return true;
		}
		return false;
	}
	//delete the data
	public void deleteDetails(int id)
	{
		System.out.println("DEleted");
		hp.deleteById(id);
	}
	//get the data
   public Optional<HotelModel> getUserId(int userId)
   {
	   Optional<HotelModel>hotel=hp.findById(userId);
	   if(hotel.isPresent())
	   {
		   return hotel;
	   }
	   return null;
   }
}