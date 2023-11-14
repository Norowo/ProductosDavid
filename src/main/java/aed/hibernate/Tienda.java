package aed.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="tienda")

public class Tienda {
	
	@Id
	private String Codtienda;
	private String Denotienda;
	private String CodigoPostal;
	public String getCodtienda() {
		return Codtienda;
	}
	public void setCodtienda(String codtienda) {
		Codtienda = codtienda;
	}
	public String getDenotienda() {
		return Denotienda;
	}
	public void setDenotienda(String denotienda) {
		Denotienda = denotienda;
	}
	public String getCodigoPostal() {
		return CodigoPostal;
	}
	public void setCodigoPostal(String codigoPostal) {
		CodigoPostal = codigoPostal;
	}
	
	
	
	

}
