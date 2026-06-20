package ec.edu.uce.domain.model;

import jakarta.persistence.TypedQueryReference;
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
	 * @see #cedula
	 **/
	public static final String CEDULA = "cedula";
	
	/**
	 * @see #_Estudiante_buscarPorGenero_
	 **/
	public static final String QUERY_ESTUDIANTE_BUSCAR_POR_GENERO = "Estudiante.buscarPorGenero";
	
	/**
	 * @see #_Estudiante_buscarPorApellido_
	 **/
	public static final String QUERY_ESTUDIANTE_BUSCAR_POR_APELLIDO = "Estudiante.buscarPorApellido";
	
	/**
	 * @see #_Estudiante_buscarPorRangoFecha_
	 **/
	public static final String QUERY_ESTUDIANTE_BUSCAR_POR_RANGO_FECHA = "Estudiante.buscarPorRangoFecha";
	
	/**
	 * @see #_Estudiante_contar_
	 **/
	public static final String QUERY_ESTUDIANTE_CONTAR = "Estudiante.contar";

	
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
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Estudiante#cedula}
	 **/
	public static volatile SingularAttribute<Estudiante, String> cedula;
	
	/**
	 * The query named {@value QUERY_ESTUDIANTE_BUSCAR_POR_GENERO}
	 *
	 * @see ec.edu.uce.domain.model.Estudiante
	 **/
	public static volatile TypedQueryReference<Object> _Estudiante_buscarPorGenero_;
	
	/**
	 * The query named {@value QUERY_ESTUDIANTE_BUSCAR_POR_APELLIDO}
	 *
	 * @see ec.edu.uce.domain.model.Estudiante
	 **/
	public static volatile TypedQueryReference<Object> _Estudiante_buscarPorApellido_;
	
	/**
	 * The query named {@value QUERY_ESTUDIANTE_BUSCAR_POR_RANGO_FECHA}
	 * <pre>
	 * SELECT e FROM Estudiante e WHERE e.fechaNacimiento BETWEEN :fechaInicio AND :fechaFin
	 * </pre>
	 *
	 * @see ec.edu.uce.domain.model.Estudiante
	 **/
	public static volatile TypedQueryReference<Estudiante> _Estudiante_buscarPorRangoFecha_;
	
	/**
	 * The query named {@value QUERY_ESTUDIANTE_CONTAR}
	 * <pre>
	 * SELECT COUNT(e) FROM Estudiante e
	 * </pre>
	 *
	 * @see ec.edu.uce.domain.model.Estudiante
	 **/
	public static volatile TypedQueryReference<Long> _Estudiante_contar_;

}

