package ec.edu.uce.infraestructure.repository;

import ec.edu.uce.domain.model.Materia;
import ec.edu.uce.domain.repository.MateriaRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;
@Transactional
@ApplicationScoped
public class MateriaRepositoryImpl implements MateriaRepository {

    @Inject
    private EntityManager em;
    @Override
    public void insertar(Materia materia) {
       this.em.persist(materia);
    }

    @Override
    public Materia findId(Integer id) {
        Materia materia= this.em.find(Materia.class, id);
         materia.getAlumnos().size();
        return materia;
    }

}
