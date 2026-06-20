package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.Alumno;
import ec.edu.uce.domain.repository.AlumnoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Transactional
@ApplicationScoped
public class AlumnoRepositoryImpl implements AlumnoRepository{
    @Inject
    private EntityManager em;

    @Override
    public void insertar(Alumno alumno) {
        this.em.persist(alumno);
    }

    @Override
    public Alumno buscarId(Integer id) {
        Alumno a =this.em.find(Alumno.class, id);
        return a;
    }

}
