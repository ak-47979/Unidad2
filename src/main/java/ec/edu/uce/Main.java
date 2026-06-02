package ec.edu.uce;

import java.time.LocalDate;
import java.util.List;

import ec.edu.uce.application.service.EstudianteService;
import ec.edu.uce.domain.model.Estudiante;
import io.quarkus.runtime.Quarkus;
import io.quarkus.runtime.QuarkusApplication;
import io.quarkus.runtime.annotations.QuarkusMain;
import jakarta.inject.Inject;

@QuarkusMain
public class Main {
    public static void main(String[] args) {
        Quarkus.run(App.class, args);
    }

    public static class App implements QuarkusApplication   {

    @Inject
    private EstudianteService estudianteService;

        @Override
        public int run(String... args) throws Exception {
            
            System.out.println("Conexion a la base de datos POSTGRES!");
            
            //Creacion de un nuevo Estudiante
            Estudiante estudiante = new Estudiante();
            estudiante.setNombre("Alex");
            estudiante.setApellido("Cordova");
            estudiante.setFechaNacimiento(LocalDate.of(2005, 7, 12));
            estudiante.setGenero("M");
       /*      
            //Guardar un nuevo estudiante
            System.out.println("Guardando un nuevo Estudiante...");
            estudianteService.guardar(estudiante);

            //Eliminar un estudiante por ID
            System.out.println("Eliminamos al Estudiante por ID");
            estudianteService.eliminar(1);
            
            //Metodo Actualizar
            System.out.println("Actualizar los Datos por ID...");
            Estudiante estudiante2 = this.estudianteService.buscarPorId(3);
            estudiante2.setNombre("Paul");
            estudiante2.setApellido("Gomez");
            this.estudianteService.actualizar(estudiante2);

            //Buscar al Estudiante por ID
            System.out.println("Buscando Estudiante por ID...");
            System.out.println(estudianteService.buscarPorId(2).toString());

            //Seleccionar todos los estudiantes
            System.out.println("Seleccionar todos los estudiantes...");
            estudianteService.buscarTodos().forEach(e -> System.out.println(e.toString()));

            //Seleccionar por nombre
            System.out.println("Seleccionar por nombre...");
            List<Estudiante> estudiantesporNombre = estudianteService.buscarPorNombre("Alex");
            for (Estudiante e : estudiantesporNombre) {
                System.out.println(e);
            }
*/
/*
            //seleccionar por cedula
            System.out.println("Seleccionar por cedula...");
            Estudiante estudianteporCedula = estudianteService.buscarPorCedula("1752364148");
            System.out.println(estudianteporCedula);
            //1.2 NamedQuery--------------------------------------------------------------------------------------------------------------
            //Seleccionar por genero
            System.out.println("Seleccionar por genero...");
            List<Estudiante> estudiantesporGenero = estudianteService.buscarPorGenero("M");
            for (Estudiante e : estudiantesporGenero) {
                System.out.println(e);
            }

            //Seleccionar por genero usando NamedQuery
            System.out.println("Seleccionar por genero usando NamedQuery...");  
            List<Estudiante> estudiantesporGeneroTyped = estudianteService.buscarPorGeneroTyped("M");
            for (Estudiante e : estudiantesporGeneroTyped) {
                System.out.println(e);
            }
            //Seleccionar por rango de fecha usando NamedQuery
            System.out.println("Seleccionar por rango de fecha usando NamedQuery...");  
            List<Estudiante> estudiantesporRangoFecha = estudianteService.buscarPorRangoFecha(LocalDate.of(2004, 1, 1), LocalDate.of(2007, 12, 31));
            for (Estudiante e : estudiantesporRangoFecha) {
                System.out.println(e);
            }
            //Contar el numero de estudiantes usando NamedQuery
            System.out.println("Contar el numero de estudiantes usando NamedQuery...");
            Long totalEstudiantes = estudianteService.contar();
            System.out.println("Total de estudiantes: " + totalEstudiantes);
            
            
            //Seleccionar todos los estudiantes usando Native Query
            System.out.println("Seleccionar todos los estudiantes usando Native Query...");
            List<Estudiante> estudiantesTodosNative = estudianteService.buscarTodosNative();
            for (Estudiante e : estudiantesTodosNative) {
                System.out.println(e);
            }*/
            /*
            System.out.println("Seleccionar todos los estudiantes usando Criteria API...");
            List<Estudiante> estudiantesTodosCriteria = estudianteService.buscarTodosCriteria();
            for (Estudiante e : estudiantesTodosCriteria) {
                System.out.println(e);
            }

            System.out.println("Seleccionar por nombre usando Criteria API...");
            List<Estudiante> estudiantesPorNombreCriteria = estudianteService.buscarPorNombreCriteria("Alex");
            for(Estudiante e: estudiantesPorNombreCriteria){
                System.out.println(e);
            } 
            */
            //Query que se consulte por nombre o apellido a menos que uno de los dos sea nulo
            //metodo dinamico, nombre apellido, se construye la condicion no sea nulo,
            // si es nulo se crea la condicion con el valor que no es nulo, si ambos son nulos se lanza una excepcion o se devuelve una lista vacia
            System.out.println("Seleccionar por nombre o apellido usando Criteria API...");
            List<Estudiante> estudiantesDinamica1 = estudianteService.buscarDinamica("Alex", "Cordova");
            for(Estudiante e: estudiantesDinamica1){
                System.out.println(e);
            }
            System.out.println("Seleccionar por nombre o apellido usando Criteria API, apellido nulo...");
            List<Estudiante> estudiantesDinamica2 = estudianteService.buscarDinamica(null, "Cordova");
            for(Estudiante e: estudiantesDinamica2){
                System.out.println(e);
            }
             System.out.println("Seleccionar por nombre o apellido usando Criteria API, nombre nulo...");
            List<Estudiante> estudiantesDinamica3 = estudianteService.buscarDinamica("Alex", null);
            for(Estudiante e: estudiantesDinamica3){
                System.out.println(e);
            }
            System.out.println("Seleccionar por nombre o apellido usando Criteria API, ambos nulos...");
            List<Estudiante> estudiantesDinamica4 = estudianteService.buscarDinamica(null, null);
            for(Estudiante e: estudiantesDinamica4){
                System.out.println(e);
            }
            return 0;
        }

    }
}

