package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.Alumno;
import ec.edu.uce.domain.repository.AlumnoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.transaction.Transactional;
@Transactional
@ApplicationScoped
public class AlumnoRepositoryImpl implements AlumnoRepository{


    @Override
    public void insertar(Alumno alumno) {
    }

}
