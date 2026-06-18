package ec.edu.uce.application.service;

import ec.edu.uce.domain.model.Alumno;
import jakarta.inject.Inject;

public class AlumnoRepository {
    @Inject    
    private AlumnoRepository alumnoRepository;
    
    public void insertar(Alumno alumno){
        this.alumnoRepository.insertar(alumno);
    }
}
