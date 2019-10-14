package pe.edu.upn.clinica.model.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "programacioncita")
public class ProgramacionCita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
    
	@Column(name= "Fecha_cita")
	 private Integer fechacita;
	 
	 @OneToOne(mappedBy = "programacion")
	 @JoinColumn(name= "id_tipoatencion")
		private TipoAtencion tipoatencion;
	 
	 @OneToOne(mappedBy = "progra_cita")
		private Cita cita;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getFechacita() {
		return fechacita;
	}

	public void setFechacita(Integer fechacita) {
		this.fechacita = fechacita;
	}

	public TipoAtencion getTipoatencion() {
		return tipoatencion;
	}

	public void setTipoatencion(TipoAtencion tipoatencion) {
		this.tipoatencion = tipoatencion;
	}

	public Cita getCita() {
		return cita;
	}

	public void setCita(Cita cita) {
		this.cita = cita;
	}

	

}
