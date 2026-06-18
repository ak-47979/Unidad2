package ec.edu.uce.domain.model;

import java.time.LocalDate;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name="pedido")
public class Pedido {

@Id 
@SequenceGenerator(name = "seq_pedido_generador", sequenceName = "seq_pedido", allocationSize = 1)
@GeneratedValue(strategy = GenerationType.SEQUENCE ,generator = "seq_pedido_generador")
@Column(name="ped_id")
private Integer id;

@Column(name="ped_total")
private Double total;

@Column(name="ped_fecha")
private LocalDate fecha;



@ManyToOne(cascade= CascadeType.ALL)
private Cliente cliente;

public Pedido(){

}
public Pedido(Double total, LocalDate fecha) {
    this.total = total;
    this.fecha = fecha;
}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Pedido [id=" + id + ", total=" + total + ", fecha=" + fecha + "]";
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }


}
