package ec.edu.uce.domain.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDateTime;

/**
 * Static metamodel for {@link ec.edu.uce.domain.model.Ciudadano}
 **/
@StaticMetamodel(Ciudadano.class)
public abstract class Ciudadano_ {

	
	/**
	 * @see #id
	 **/
	public static final String ID = "id";
	
	/**
	 * @see #nombre
	 **/
	public static final String NOMBRE = "nombre";
	
	/**
	 * @see #fechaNacimiento
	 **/
	public static final String FECHA_NACIMIENTO = "fechaNacimiento";

	
	/**
	 * Static metamodel type for {@link ec.edu.uce.domain.model.Ciudadano}
	 **/
	public static volatile EntityType<Ciudadano> class_;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Ciudadano#id}
	 **/
	public static volatile SingularAttribute<Ciudadano, Integer> id;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Ciudadano#nombre}
	 **/
	public static volatile SingularAttribute<Ciudadano, String> nombre;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Ciudadano#fechaNacimiento}
	 **/
	public static volatile SingularAttribute<Ciudadano, LocalDateTime> fechaNacimiento;

}

