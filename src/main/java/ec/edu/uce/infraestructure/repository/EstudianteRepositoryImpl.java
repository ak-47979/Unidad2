package ec.edu.uce.infraestructure.repository;


import java.util.List;

import ec.edu.uce.domain.model.Estudiante;
import ec.edu.uce.domain.repository.EstudianteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@ApplicationScoped
@Transactional
public class EstudianteRepositoryImpl implements EstudianteRepository {


    //la clase emtityManagerhace es el principal que gestiona e implementa ORM gestionar todos los accesos de datos (CRUD)
    @Inject
    private EntityManager em;

    //persist es guardar en la base de datos, 
    @Override
    public void crear(Estudiante estudiante) {
        this.em.persist(estudiante);
    }   

    //debe tener un dato primaria en la base de datos para el uso del merge 
    @Override
    public void actualizar(Estudiante estudiante) {
        this.em.merge(estudiante);

    }

    //para el metodo eliminar usamos el metodo seleccionar por id
    @Override
    public void eliminar(Integer id) {        
        this.em.remove(this.seleccionarPorId(id));
    }

    @Override
    public Estudiante seleccionarPorId(Integer id) {
        return this.em.find(Estudiante.class, id);
    }

    @Override
    public List<Estudiante> seleccionarTodos() {
        //JPQL es el lenguaje de consultas orientada a objetos,
        //no se trabaj con columnas ni tablas, se trabaja
        // con esto trabajamos clases y atributos
        TypedQuery<Estudiante> query = this.em.createQuery("SELECT e FROM Estudiante e", Estudiante.class);
        return query.getResultList();
    }
    @Override
     public List<Estudiante> seleccionarPorNombre(String nombre) {
        TypedQuery<Estudiante> miQuery = this.em.createQuery("SELECT e FROM Estudiante e WHERE e.nombre = :nombre1 ", Estudiante.class);
        miQuery.setParameter("nombre1", nombre);
        return miQuery.getResultList();
    }

    @Override
    public Estudiante seleccionarPorCedula(String cedula) {
        TypedQuery<Estudiante> miQuery = this.em.createQuery("SELECT e FROM Estudiante e WHERE e.cedula = :cedula1 ", Estudiante.class);
        miQuery.setParameter("cedula1", cedula);
        //return miQuery.getSingleResult();
        //return miQuery.getResultList().get(0);
        //return miQuery.getResultList().getFirst();
        return miQuery.getResultList().getLast();
    }
}