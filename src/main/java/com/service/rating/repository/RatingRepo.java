package com.service.rating.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.service.rating.entities.Rating;

@Repository
public interface RatingRepo extends JpaRepository<Rating, String> {
	//custom finder method
	public List<Rating> findByUserId(String userId);
	public List<Rating> findByHotelId(String hotelId);
	
}
