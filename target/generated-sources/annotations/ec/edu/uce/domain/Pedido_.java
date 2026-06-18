package ec.edu.uce.domain;

import java.time.LocalDate;

import ec.edu.uce.domain.model.Pedido;
import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link ec.edu.uce.domain.model.Pedido}
 **/
@StaticMetamodel(Pedido.class)
public abstract class Pedido_ {

	
	/**
	 * @see #id
	 **/
	public static final String ID = "id";
	
	/**
	 * @see #total
	 **/
	public static final String TOTAL = "total";
	
	/**
	 * @see #fecha
	 **/
	public static final String FECHA = "fecha";

	
	/**
	 * Static metamodel type for {@link ec.edu.uce.domain.model.Pedido}
	 **/
	public static volatile EntityType<Pedido> class_;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Pedido#id}
	 **/
	public static volatile SingularAttribute<Pedido, Integer> id;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Pedido#total}
	 **/
	public static volatile SingularAttribute<Pedido, Double> total;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Pedido#fecha}
	 **/
	public static volatile SingularAttribute<Pedido, LocalDate> fecha;

}

