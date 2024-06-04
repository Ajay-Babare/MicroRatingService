package com.service.rating.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="Ratings")
//@ToString
public class Rating {
	
	@Override
	public String toString() {
		return "Rating [ratingId=" + ratingId + ", userId=" + userId + ", hotelId=" + hotelId + ", ratings=" + ratings
				+ ", feedback=" + feedback + "]";
	}
	@Id
	private String ratingId;
	private String userId;
	private String hotelId;
	private int ratings;
	private String feedback;
}
