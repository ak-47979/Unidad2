package ec.edu.uce;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

import ec.edu.uce.application.service.CiudadanoService;
import ec.edu.uce.application.service.EmpleadoService;
import ec.edu.uce.application.service.EstudianteService;
import ec.edu.uce.domain.model.Ciudadano;
import ec.edu.uce.domain.model.Empleado;
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
    @Inject
    private CiudadanoService ciudadanoService;
     @Inject
    private EmpleadoService empleadoService;
        @Override
        public int run(String... args) throws Exception {
            
            System.out.println("Conexion a la base de datos POSTGRES!");
           
            //primer
            /* Ciudadano ciudadano = new Ciudadano();
            ciudadano.setNombre("Alex");
            LocalDate date = LocalDate.of(2000, 5, 10);
            LocalTime time = LocalTime.of(8, 30);
            ciudadano.setFechaNacimiento(LocalDateTime.of(date, time));
          
            

            Empleado empleado = new Empleado();
            empleado.setSalario(1200.0);            
            empleado.setFechaIngreso(LocalDateTime.now());
            empleado.setCiudadano(ciudadano);
            empleadoService.insertar(empleado);*/
            //2 Crear un nuevo ciudadano con servide de ciudadano, y ahora le seteamos para crear el ciudadano con el service

            Ciudadano ciudadano2 = new Ciudadano();
            ciudadano2.setNombre("Andy Suquilandi");
            LocalDate date2 = LocalDate.of(2000, 5, 10);
            LocalTime time2 = LocalTime.of(8, 30);
            ciudadano2.setFechaNacimiento(LocalDateTime.of(date2, time2));
           
            

            Empleado empleado2 = new Empleado();
            empleado2.setSalario(null);            
            empleado2.setFechaIngreso(LocalDateTime.now());
            empleadoService.insertar(empleado2,ciudadano2);
          
            return 0;
        }

    }
}

