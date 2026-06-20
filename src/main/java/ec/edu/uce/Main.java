package ec.edu.uce;

import ec.edu.uce.application.service.AlumnoService;
import ec.edu.uce.application.service.ClienteService;
import ec.edu.uce.application.service.MateriaService;
import ec.edu.uce.domain.model.Alumno;
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
    private MateriaService materiaService;
    @Inject
    private AlumnoService alumnoService;

     @Inject
    private ClienteService clienteService;
        @Override
        public int run(String... args) throws Exception {
            
            System.out.println("Conexion a la base de datos POSTGRES!");
           
           
/* 
           Alumno alumno = new Alumno();
           alumno.setNombre("Andy");

           Materia m1 = new Materia();
           m1.setNombre("avanzada");
           m1.setNumeroCreditos(4);
           
            Materia m2 = new Materia();
           m2.setNombre("P WEB");
           m2.setNumeroCreditos(6);

           List<Materia> materias = new ArrayList<>();
           materias.add(m1);
           materias.add(m2);

           //insert service de alumno
           alumno.setMateria(materias);
           alumnoService.insertar(alumno);*/

            //2 Ejemplo
            /*
            Materia m2 = new Materia();
            m2.setNombre("Programacion Avananzada II");
            m2.setNumeroCreditos(4);
 
            Alumno a1 = new Alumno();
            a1.setNombre("Jhon");
            a1.setMateria(List.of(m2));
            Alumno a2 = new Alumno();
            a2.setMateria(List.of(m2));
            a2.setNombre("Andy");

            m2.setAlumnos(List.of(a1,a2));
            materiaService.insertar(m2);*/

            //crear una consulta por id e materia en el service de materia
           /* Materia a =materiaService.findId(1);
            System.out.println(a.toString());
            var alumno = a.getAlumnos();
            for (Object elem : alumno) {
                System.out.println(elem.toString());
            }
            */
            Alumno alum = alumnoService.buscarId(1);    
            System.out.println(alum.toString());

            var mate = alum.getMateria();
            for (Object elem1 : mate) {
                System.out.println(elem1.toString());
            }
            return 0;
        }

    }
}

