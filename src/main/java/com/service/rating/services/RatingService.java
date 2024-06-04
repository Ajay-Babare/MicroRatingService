package com.service.rating.services;

import java.util.List;

import com.service.rating.entities.Rating;

public interface RatingService {
	
	//create
	Rating createRating(Rating rating);
	
	//get all ratings
	List<Rating> getAllRating();
	
	//get all by userId
	List<Rating> getRatingByUserId(String userId);
	
	//get all by hotelId
	List<Rating> getRatingByHotelId(String hotelId);
	
}
