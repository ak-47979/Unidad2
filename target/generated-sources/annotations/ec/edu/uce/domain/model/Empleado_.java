package ec.edu.uce.domain.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

/**
 * Static metamodel for {@link ec.edu.uce.domain.model.Empleado}
 **/
@StaticMetamodel(Empleado.class)
public abstract class Empleado_ {

	
	/**
	 * @see #id
	 **/
	public static final String ID = "id";
	
	/**
	 * @see #salario
	 **/
	public static final String SALARIO = "salario";
	
	/**
	 * @see #fechaIngreso
	 **/
	public static final String FECHA_INGRESO = "fechaIngreso";
	
	/**
	 * @see #ciudadano
	 **/
	public static final String CIUDADANO = "ciudadano";

	
	/**
	 * Static metamodel type for {@link ec.edu.uce.domain.model.Empleado}
	 **/
	public static volatile EntityType<Empleado> class_;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Empleado#id}
	 **/
	public static volatile SingularAttribute<Empleado, Integer> id;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Empleado#salario}
	 **/
	public static volatile SingularAttribute<Empleado, Double> salario;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Empleado#fechaIngreso}
	 **/
	public static volatile SingularAttribute<Empleado, LocalDateTime> fechaIngreso;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Empleado#ciudadano}
	 **/
	public static volatile SingularAttribute<Empleado, Ciudadano> ciudadano;

}

