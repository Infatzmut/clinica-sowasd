package pe.edu.upn.clinica.model.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import pe.edu.upn.clinica.model.entity.HorarioAtencion;



public interface HorarioAtencionRepository extends JpaRepository<HorarioAtencion, String> {

}
