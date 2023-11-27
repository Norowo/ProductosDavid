package aed.hibernate;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="familia")

public class Familia {
	
	@Id
	private int Codfamilia;
	private String Denofamilia;
	
	@OneToMany(mappedBy = "familia")
	private List<Producto> productos;
	
	public List<Producto> getProductos() {
		return productos;
	}
	public void setProductos(List<Producto> productos) {
		this.productos = productos;
	}
	public int getCodfamilia() {
		return Codfamilia;
	}
	public void setCodfamilia(int codfamilia) {
		Codfamilia = codfamilia;
	}
	public String getDenofamilia() {
		return Denofamilia;
	}
	public void setDenofamilia(String denofamilia) {
		Denofamilia = denofamilia;
	}
	
	
	

}
