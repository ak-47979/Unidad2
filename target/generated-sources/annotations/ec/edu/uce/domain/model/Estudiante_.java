package ec.edu.uce.domain.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;
import java.time.LocalDate;

/**
 * Static metamodel for {@link ec.edu.uce.domain.model.Estudiante}
 **/
@StaticMetamodel(Estudiante.class)
public abstract class Estudiante_ {

	
	/**
	 * @see #id
	 **/
	public static final String ID = "id";
	
	/**
	 * @see #nombre
	 **/
	public static final String NOMBRE = "nombre";
	
	/**
	 * @see #apellido
	 **/
	public static final String APELLIDO = "apellido";
	
	/**
	 * @see #fechaNacimiento
	 **/
	public static final String FECHA_NACIMIENTO = "fechaNacimiento";
	
	/**
	 * @see #genero
	 **/
	public static final String GENERO = "genero";

	
	/**
	 * Static metamodel type for {@link ec.edu.uce.domain.model.Estudiante}
	 **/
	public static volatile EntityType<Estudiante> class_;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Estudiante#id}
	 **/
	public static volatile SingularAttribute<Estudiante, Integer> id;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Estudiante#nombre}
	 **/
	public static volatile SingularAttribute<Estudiante, String> nombre;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Estudiante#apellido}
	 **/
	public static volatile SingularAttribute<Estudiante, String> apellido;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Estudiante#fechaNacimiento}
	 **/
	public static volatile SingularAttribute<Estudiante, LocalDate> fechaNacimiento;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Estudiante#genero}
	 **/
	public static volatile SingularAttribute<Estudiante, String> genero;

}

