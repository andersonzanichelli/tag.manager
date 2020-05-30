package br.com.zanichelli;

import javax.persistence.Entity;
import javax.validation.constraints.NotEmpty;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
public class Tag extends PanacheEntity {

	@NotEmpty
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
