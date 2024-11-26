package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {

	@Id
	private int empid;
	private String empname;
	private double empsal;
}
