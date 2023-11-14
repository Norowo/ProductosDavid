package aed.hibernate;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productos_observacion")

public class ProductoObservacion {
	
	@Id
	private int Codproducto;
	private String observacion;
	
	public int getCodproducto() {
		return Codproducto;
	}
	public void setCodproducto(int codproducto) {
		Codproducto = codproducto;
	}
	public String getObservacion() {
		return observacion;
	}
	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}
	
	

}
