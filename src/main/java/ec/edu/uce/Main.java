package ec.edu.uce;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import ec.edu.uce.application.service.CiudadanoService;
import ec.edu.uce.application.service.ClienteService;
import ec.edu.uce.application.service.EmpleadoService;
import ec.edu.uce.application.service.EstudianteService;
import ec.edu.uce.domain.model.Cliente;
import ec.edu.uce.domain.model.Pedido;
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

     @Inject
    private ClienteService clienteService;
        @Override
        public int run(String... args) throws Exception {
            
            System.out.println("Conexion a la base de datos POSTGRES!");
           
           //One to Many

           Cliente cliente = new Cliente();
           cliente.setCedula("1753025939");
           cliente.setNombre("Andy Suquilandi"); 

            Pedido pedido = new Pedido();
            pedido.setTotal(10.0);
            pedido.setFecha(LocalDate.of(2000, 11, 10));
            pedido.setCliente(cliente);
            pedido.setCliente(cliente);

            Pedido pedido2 = new Pedido();
            pedido2.setTotal(100.0);
            pedido2.setFecha(LocalDate.of(2001, 10, 5));
            pedido2.setCliente(cliente);

            List<Pedido> pedidos = new ArrayList<>();
            pedidos.add(pedido);
            pedidos.add(pedido2);

            cliente.setPedidos(pedidos);
            ///ter
            clienteService.insertar(cliente);
            return 0;
        }

    }
}

