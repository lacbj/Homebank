package com.ar.cac.models;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
@Entity
@Table(name = "accounts")
public class Account {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Long id;
	public String name;
	public Double ammount;
	public String cbu;
	
	public Account () {}

	public Account(Long id, String name, Double ammount, String cbu) {
		super();
		this.id = id;
		this.name = name;
		this.ammount = ammount;
		this.cbu = cbu;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ammount, cbu, id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return Objects.equals(ammount, other.ammount) && Objects.equals(cbu, other.cbu) && Objects.equals(id, other.id)
				&& Objects.equals(name, other.name);
	}

	
	
}