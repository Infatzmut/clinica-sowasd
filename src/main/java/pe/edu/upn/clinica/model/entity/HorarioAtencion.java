package pe.edu.upn.clinica.model.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "horarioatencion")
public class HorarioAtencion {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private String id;
		
		@Column(name= "dia")
		private Integer dia;
		
		@Column(name= "Hora")
		private Integer hora;
		
		@OneToOne(mappedBy = "horarios")
		private Clinica clinica;

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public Integer getDia() {
			return dia;
		}

		public void setDia(Integer dia) {
			this.dia = dia;
		}

		public Integer getHora() {
			return hora;
		}

		public void setHora(Integer hora) {
			this.hora = hora;
		}

		public Clinica getClinica() {
			return clinica;
		}

		public void setClinica(Clinica clinica) {
			this.clinica = clinica;
		}

	
		
		
		
}
