package ec.edu.uce.domain.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link ec.edu.uce.domain.model.Alumno}
 **/
@StaticMetamodel(Alumno.class)
public abstract class Alumno_ {

	
	/**
	 * @see #id
	 **/
	public static final String ID = "id";
	
	/**
	 * @see #nombre
	 **/
	public static final String NOMBRE = "nombre";
	
	/**
	 * @see #materia
	 **/
	public static final String MATERIA = "materia";

	
	/**
	 * Static metamodel type for {@link ec.edu.uce.domain.model.Alumno}
	 **/
	public static volatile EntityType<Alumno> class_;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Alumno#id}
	 **/
	public static volatile SingularAttribute<Alumno, Integer> id;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Alumno#nombre}
	 **/
	public static volatile SingularAttribute<Alumno, String> nombre;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Alumno#materia}
	 **/
	public static volatile ListAttribute<Alumno, Materia> materia;

}

