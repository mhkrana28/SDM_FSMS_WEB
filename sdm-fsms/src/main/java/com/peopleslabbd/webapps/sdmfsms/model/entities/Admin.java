package com.peopleslabbd.webapps.sdmfsms.model.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * POJO (Entity) to represent admin model.
 * 
 * @author MAHMUD HASAN
 * @since 2020-09-11
 * @version 1.0.1-SNAPSHOT
 */
@Entity
@Table
@Data
@NoArgsConstructor
@RequiredArgsConstructor
@Accessors(chain = true)
public class Admin {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NonNull
	@Column
	private String fullName;
	
	@NonNull
	@Column(unique = true)
	private String userName;
	
	@NonNull
	@Column
	private String password;
	
	@NonNull
	@Column
	private String phoneNumber;
	
	@Column
	@Temporal(TemporalType.TIMESTAMP)
	@Setter(value = AccessLevel.PRIVATE)
	private Date addedTime;
	
	@Column
	private int roleCode;
	
	@Column
	@Getter(value = AccessLevel.PRIVATE)
	private Boolean active;
	
	@PrePersist
	private void preInsert() {
		this.setAddedTime(new Date());	// Setting current value while inserting new object to DB
	}
	
	public Boolean isActive() {
		return this.getActive();
	}
}
