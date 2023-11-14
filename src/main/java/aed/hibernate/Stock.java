package aed.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="stock")

public class Stock {
	
	@Id
	private String Codtienda;
	private int Codproducto;
	private int Unidades;
	
	public String getCodtienda() {
		return Codtienda;
	}
	public void setCodtienda(String codtienda) {
		Codtienda = codtienda;
	}
	public int getCodproducto() {
		return Codproducto;
	}
	public void setCodproducto(int codproducto) {
		Codproducto = codproducto;
	}
	public int getUnidades() {
		return Unidades;
	}
	public void setUnidades(int unidades) {
		Unidades = unidades;
	}
	
	

}
