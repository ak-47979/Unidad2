package ec.edu.uce.domain.repository;

import java.time.LocalDate;
import java.util.List;

import ec.edu.uce.domain.model.Estudiante;

//Se crea una por cada entidad, es decir, una por cada clase que representa una tabla en la base de datos
public interface EstudianteRepository {
    //implemento los metodos que voy a necesitar para realizar EL CRUD
    //1. Query o JPQL Query
    public void crear(Estudiante estudiante);
    public Estudiante seleccionarPorId(Integer id);
    public void actualizar(Estudiante estudiante);
    public void eliminar(Integer id);
    public List<Estudiante> seleccionarTodos();
    public List<Estudiante> seleccionarPorNombre(String nombre);
    public Estudiante seleccionarPorCedula(String cedula);
    //1.2 NamedQuery
    public List<Estudiante> seleccionarPorGenero(String genero);
    public List<Estudiante> seleccionarPorGeneroTyped(String genero);
    public List<Estudiante> seleccionarPorRangoFecha(LocalDate fechaInicio, LocalDate fechaFin);
    public Long contar();

    //2.Native QUERY
    public List<Estudiante> seleccionarTodosNative();

    //3. Criteria API
    //permite construir metodos dinamicos a partir de 
    //Apis a provistas e api QueryDSL, es decir, no se necesita 
    //escribir la consulta, sino que se construye a partir de 
    //metodos y clases proporcionadas por el framework
    public List<Estudiante> seleccionarTodosCriteria();
    
    public List<Estudiante> seleccionarPorNombreCriteria(String nombre);


    public List<Estudiante> seleccionarDinamica(String nombre, String apellido);
    
}
