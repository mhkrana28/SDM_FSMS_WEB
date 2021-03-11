package com.peopleslabbd.webapps.sdmfsms.model.entities;

import java.time.LocalDateTime;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import lombok.AccessLevel;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * POJO (Entity) to represent user entity.
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
@Accessors(chain = true, fluent = false)
public class Customer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@NonNull
	@Column
	private String fullName;
	
	@NonNull
	@Column
	private String phoneNumber;
	
	@Column
	private String nId;
	@Column
	private String address;
	@Column
	private String photoUrl;
	
	@Column
	@Getter(value = AccessLevel.PRIVATE)
	private Boolean active;
	
	@Column
	private LocalDateTime addedAtTime;
	
	@OneToOne
	@JoinColumn
	private Admin addedByAdmin;
	
	@OneToOne
	@JoinColumn
	private Admin lastModByAdmin;
	
	@Column
	@Setter(value = AccessLevel.PRIVATE)
	private LocalDateTime lastModAtTime;
	
	@Column
	private int vipCode;
	
	public Boolean isActive() {
		return this.active;
	}
	
	@PrePersist
	private void doBeforeInsert() {
		LocalDateTime now = LocalDateTime.now();
		
		this.lastModAtTime = now;
		this.addedAtTime = now;
	}
	
	@PreUpdate
	private void doBeforeUpdate() {
		this.lastModAtTime = LocalDateTime.now();
	}
}
