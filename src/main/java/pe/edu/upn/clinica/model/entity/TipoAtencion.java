package pe.edu.upn.clinica.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;

@Entity
@Table(name = "tipoatencion")
public class TipoAtencion {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
	
	
	@Column(name= "descripcion")
	private String descripcion;
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "programacion")
	private ProgramacionCita programacionCita;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public ProgramacionCita getProgramacionCita() {
		return programacionCita;
	}

	public void setProgramacionCita(ProgramacionCita programacionCita) {
		this.programacionCita = programacionCita;
	}




	
	

}
