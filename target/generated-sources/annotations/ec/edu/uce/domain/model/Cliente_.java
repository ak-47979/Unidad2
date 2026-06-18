package ec.edu.uce.domain.model;

import jakarta.persistence.metamodel.EntityType;
import jakarta.persistence.metamodel.ListAttribute;
import jakarta.persistence.metamodel.SingularAttribute;
import jakarta.persistence.metamodel.StaticMetamodel;

/**
 * Static metamodel for {@link ec.edu.uce.domain.model.Cliente}
 **/
@StaticMetamodel(Cliente.class)
public abstract class Cliente_ {

	
	/**
	 * @see #id
	 **/
	public static final String ID = "id";
	
	/**
	 * @see #cedula
	 **/
	public static final String CEDULA = "cedula";
	
	/**
	 * @see #nombre
	 **/
	public static final String NOMBRE = "nombre";
	
	/**
	 * @see #pedidos
	 **/
	public static final String PEDIDOS = "pedidos";

	
	/**
	 * Static metamodel type for {@link ec.edu.uce.domain.model.Cliente}
	 **/
	public static volatile EntityType<Cliente> class_;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Cliente#id}
	 **/
	public static volatile SingularAttribute<Cliente, Integer> id;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Cliente#cedula}
	 **/
	public static volatile SingularAttribute<Cliente, String> cedula;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Cliente#nombre}
	 **/
	public static volatile SingularAttribute<Cliente, String> nombre;
	
	/**
	 * Static metamodel for attribute {@link ec.edu.uce.domain.model.Cliente#pedidos}
	 **/
	public static volatile ListAttribute<Cliente, Pedido> pedidos;

}

