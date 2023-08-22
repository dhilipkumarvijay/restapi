package com.example.demo.day5.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.day5.model.HotelModel;

public interface HotelRepository extends JpaRepository<HotelModel, Integer> {

}