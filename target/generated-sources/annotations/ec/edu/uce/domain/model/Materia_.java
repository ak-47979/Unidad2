package ec.edu.uce.domain.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link ec.edu.uce.domain.model.Materia}
 **/
@StaticMetamodel(Materia.class)
public abstract class Materia_ {

	
	/**
	 * @see #id
	 **/
	public static final String ID = "id";
	
	/**
	 * @see #nombre
	 **/
	public static final String NOMBRE = "nombre";
	
	/**
	 * @see #numeroCreditos
	 **/
	public static final String NUMERO_CREDITOS = "numeroCreditos";
	
	/**
	 * @see #alumnos
	 **/
	public static final String ALUMNOS = "alumnos";

	
	/**
	 * Static metamodel type for {@link ec.edu.uce.domain.model.Materia}
	 **/
	public static volatile EntityType<Materia> class_;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Materia#id}
	 **/
	public static volatile SingularAttribute<Materia, Integer> id;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Materia#nombre}
	 **/
	public static volatile SingularAttribute<Materia, String> nombre;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Materia#numeroCreditos}
	 **/
	public static volatile SingularAttribute<Materia, Integer> numeroCreditos;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Materia#alumnos}
	 **/
	public static volatile ListAttribute<Materia, Alumno> alumnos;

}

