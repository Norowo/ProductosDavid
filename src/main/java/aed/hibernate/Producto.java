package aed.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="producto")

public class Producto {
	
	@Id
	private int Codproducto;
	private String Denoproducto;
	private double PrecioBase;
	private int Codfamilia;
	private boolean Congelado;
	
	public int getCodproducto() {
		return Codproducto;
	}
	public void setCodproducto(int codproducto) {
		Codproducto = codproducto;
	}
	public String getDenoproducto() {
		return Denoproducto;
	}
	public void setDenoproducto(String denoproducto) {
		Denoproducto = denoproducto;
	}
	public double getPrecioBase() {
		return PrecioBase;
	}
	public void setPrecioBase(double precioBase) {
		PrecioBase = precioBase;
	}
	public int getCodfamilia() {
		return Codfamilia;
	}
	public void setCodfamilia(int codfamilia) {
		Codfamilia = codfamilia;
	}
	public boolean isCongelado() {
		return Congelado;
	}
	public void setCongelado(boolean congelado) {
		Congelado = congelado;
	}
	
	

}
