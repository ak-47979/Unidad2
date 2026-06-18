package ec.edu.uce.application.service;

import ec.edu.uce.domain.model.Ciudadano;
import ec.edu.uce.domain.model.Empleado;
import ec.edu.uce.domain.repository.CiudadanoRepository;
import ec.edu.uce.domain.repository.EmpleadoRepository;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.transaction.Transactional;

@ApplicationScoped

public class EmpleadoService {
  @Inject
  private EmpleadoRepository empleadoRepository;
 @Inject
  private CiudadanoRepository ciudadanoRepository;


  @Transactional
  public  void insertar(Empleado  empleado ,Ciudadano ciudadano2){
   
            ciudadanoRepository.insertar(ciudadano2);
            empleado.setCiudadano(ciudadano2);
            this.empleadoRepository.insertar(empleado);
  }
}
