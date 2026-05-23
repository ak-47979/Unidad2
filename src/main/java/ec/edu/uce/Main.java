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
            //seleccionar por cedula
            System.out.println("Seleccionar por cedula...");
            Estudiante estudianteporCedula = estudianteService.buscarPorCedula("1752364148");
            System.out.println(estudianteporCedula);

            return 0;
        }

    }
}

