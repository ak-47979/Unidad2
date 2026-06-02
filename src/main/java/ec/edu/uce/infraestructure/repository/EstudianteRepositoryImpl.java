package ec.edu.uce.infraestructure.repository;


import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ec.edu.uce.domain.model.Estudiante;
import ec.edu.uce.domain.repository.EstudianteRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
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
    //1.2 NamedQuery
    //se define en la clase entidad, es decir, en la clase que representa 
    // a la tabla de la base de datos, en este caso en la clase Estudiante
    @Override
    public List<Estudiante> seleccionarPorGenero(String genero) {
        Query miQuery = this.em.createNamedQuery("Estudiante.buscarPorGenero");
        miQuery.setParameter("genero", genero);
        //No se garantiza que sea una lista de Estudiantes
        return miQuery.getResultList();
    }

    @Override
    //mejor version evitando warnings, es decir, usando el tipo de dato correcto
    public List<Estudiante> seleccionarPorGeneroTyped(String genero) {
        TypedQuery<Estudiante> miQuery = this.em.createNamedQuery("Estudiante.buscarPorGenero", Estudiante.class);
        miQuery.setParameter("genero", genero);
        return miQuery.getResultList();
    }

    @Override
    public List<Estudiante> seleccionarPorRangoFecha(LocalDate fechaInicio, LocalDate fechaFin) {
        TypedQuery<Estudiante> miQuery = this.em.createNamedQuery("Estudiante.buscarPorRangoFecha", Estudiante.class);
        miQuery.setParameter("fechaInicio", fechaInicio);
        miQuery.setParameter("fechaFin", fechaFin);
        return miQuery.getResultList();
    }

    @Override
    public Long contar() {
       TypedQuery<Long> contar = this.em.createNamedQuery("Estudiante.contar", Long.class);
       return contar.getSingleResult();
    }

    @Override
    //para suprimir los warnings, es decir,
    // como segundo parametro del metodo createNativeQuery
    @SuppressWarnings("unchecked")
    public List<Estudiante> seleccionarTodosNative() {
      Query query = this.em.createNativeQuery("SELECT * FROM estudiante", Estudiante.class);
      return query.getResultList();
    }

    @Override
    public List<Estudiante> seleccionarTodosCriteria() {
        //Primero se crea una instancia de la clase que va a ser encargada de la 
        //esta construccion
        CriteriaBuilder cb = this.em.getCriteriaBuilder();

        //Se define el tipo de de objeto que va a retornar la consulta, 
        // es decir, el tipo de dato que se va a manejar
        CriteriaQuery<Estudiante> myQuery = cb.createQuery(Estudiante.class);
        //Se define las entidades del FROM, es decir, la clase que representa la tabla de la base de datos
        Root<Estudiante> root = myQuery.from(Estudiante.class);
        //Defino con que tipo de SQL se va a trabajar, es decir, el tipo de consulta, en este caso un SELECT
        myQuery.select(root);
        //SE TERMINA DE CONSTRUIR MI QUERY
        //myQuery lo transformo a un query ejecutable
        TypedQuery<Estudiante> query = this.em.createQuery(myQuery);
        //retornamos el resultado de la consulta, es decir, la lista de estudiantes
        return query.getResultList();    
    }

    @Override
    public List<Estudiante> seleccionarPorNombreCriteria(String nombre) {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<Estudiante> myQuery = cb.createQuery(Estudiante.class);
        Root<Estudiante> root = myQuery.from(Estudiante.class);
        
        //equal 1. que voya comparar, 2. el valor que voy a comparar, es decir, el valor que se va a buscar
        Predicate p1 = cb.equal(root.get("apellido"), nombre);

        //predicados, condiciones que van dentro del where
        myQuery.where(p1);
        
        TypedQuery<Estudiante> query = this.em.createQuery(myQuery);

        return query.getResultList();    
    }

    @Override
    public List<Estudiante> seleccionarDinamica(String nombre, String apellido) {
        CriteriaBuilder cb = this.em.getCriteriaBuilder();
        CriteriaQuery<Estudiante> myQuery = cb.createQuery(Estudiante.class);
        Root<Estudiante> root = myQuery.from(Estudiante.class);
        
        List<Predicate> condiciones = new ArrayList<>();
        

        if(nombre != null){
             Predicate p1 = cb.equal(root.get("nombre"), nombre);
            condiciones.add(p1);
             //p1 = cb.equal(root.get("nombre"), nombre);   
        }
        if(apellido != null){
              Predicate p2 = cb.equal(root.get("apellido"), apellido);
            condiciones.add(p2);
        }

        myQuery.select(root).where(condiciones);
        
        TypedQuery<Estudiante> query = this.em.createQuery(myQuery);

        return query.getResultList();
    }

    
}
      
