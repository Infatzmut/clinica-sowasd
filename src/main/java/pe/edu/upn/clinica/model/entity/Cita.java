package pe.edu.upn.clinica.model.entity;

import java.util.ArrayList;
import java.util.List;


import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "citas")
public class Cita {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;
    
    @OneToMany(mappedBy = "citaas", fetch = FetchType.LAZY)
    @JoinColumn(name= "id_paciente")
	private List<Paciente> pacientes;
    
	public Cita() {
		pacientes=new ArrayList<>();
	}
	public void addPacientes(Paciente paciente) {
		paciente.setCita(this);
		pacientes.add(paciente);
	}
    
    @OneToOne(mappedBy = "cit")
    @JoinColumn(name= "Id_programacionCita")
	private ProgramacionCita programacioncita;

	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public List<Paciente> getPacientes() {
		return pacientes;
	}
	public void setPacientes(List<Paciente> pacientes) {
		this.pacientes = pacientes;
	}
	public ProgramacionCita getProgramacioncita() {
		return programacioncita;
	}
	public void setProgramacioncita(ProgramacionCita programacioncita) {
		this.programacioncita = programacioncita;
	}


    
    
}

