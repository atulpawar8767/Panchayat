package com.panchayat.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class State {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int stateId;
	private String stateName;
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "countryId")
	private Country country;
}
