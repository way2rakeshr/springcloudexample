package com.example.orderpoc.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "ORDERS")
public class Order {
	@Id
	@GeneratedValue
	Long id;
	String projectName;
	String projectDisplayName;
	String projectDescription;
	String projectAdminUser;
	String projectRequestingUser;
	String environment;
	String businessUnit;
	String costCode;

}