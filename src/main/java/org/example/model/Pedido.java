package org.example.model;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name = "pedidos")
public class Pedido implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String numeroPedido;
    @Temporal(TemporalType.DATE)
    private Date inicioPedido ;
    @Temporal(TemporalType.DATE)
    private Date finPedido;
    @ManyToOne
    private Cliente cliente;
    @OneToOne
    private Deposito depositoOrigen;
    @OneToOne
    private Deposito depositoDestino;
    @Embedded
    private Seguimiento seguimiento;
    private boolean enTransito;
    @ManyToOne
    private Transportista transportista;
    @OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<LineaPedido> lineasPedidos;
    private String estadoPedido;
    @ManyToOne
    private Empleado empleado;
    @OneToOne
    private Remito remito;

    public Pedido(String numeroPedido, Cliente cliente, Deposito depositoOrigen, Deposito depositoDestino, Transportista transportista, String estadoPedido, Seguimiento seguimiento) {
        this.numeroPedido = numeroPedido;
        this.cliente = cliente;
        this.depositoOrigen = depositoOrigen;
        this.depositoDestino = depositoDestino;
        this.transportista = transportista;
        this.lineasPedidos = new ArrayList<>();
        this.estadoPedido = estadoPedido;
        this.seguimiento = seguimiento;

    }

    public Pedido() {
        this.lineasPedidos = new ArrayList<>();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(String numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    public Date getInicioPedido() {
        return inicioPedido;
    }

    public void setInicioPedido(Date inicioPedido) {
        this.inicioPedido = inicioPedido;
    }

    public Date getFinPedido() {
        return finPedido;
    }

    public void setFinPedido(Date finPedido) {
        this.finPedido = finPedido;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Deposito getDepositoOrigen() {
        return depositoOrigen;
    }

    public void setDepositoOrigen(Deposito depositoOrigen) {
        this.depositoOrigen = depositoOrigen;
    }

    public Deposito getDepositoDestino() {
        return depositoDestino;
    }

    public void setDepositoDestino(Deposito depositoDestino) {
        this.depositoDestino = depositoDestino;
    }

    public Seguimiento getSeguimiento() {
        return seguimiento;
    }

    public void setSeguimiento(Seguimiento seguimiento) {
        this.seguimiento = seguimiento;
    }

    public boolean isEnTransito() {
        return enTransito;
    }

    public void setEnTransito(boolean enTransito) {
        this.enTransito = enTransito;
    }

    public Transportista getTransportista() {
        return transportista;
    }

    public void setTransportista(Transportista transportista) {
        this.transportista = transportista;
    }

    public List<LineaPedido> getLineasPedidos() {
        return lineasPedidos;
    }

    public void setLineasPedidos(List<LineaPedido> lineasPedidos) {
        this.lineasPedidos = lineasPedidos;
    }

    public String getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(String estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    public Remito getRemito() {
        return remito;
    }

    public void setRemito(Remito remito) {
        this.remito = remito;
    }
    
    


    @Override
    public String toString() {
        return "Pedido{" +
                "numeroPedido='" + numeroPedido + '\'' +
                ", inicioPedido=" + inicioPedido +
                ", finPedido=" + finPedido +
                ", cliente=" + cliente +
                ", depositoOrigen=" + depositoOrigen +
                ", depositoDestino=" + depositoDestino +
                ", seguimiento=" + seguimiento +
                ", enTransito=" + enTransito +
                ", transportista=" + transportista +
                ", lineasPedidos=" + lineasPedidos +
                ", estadoPedido='" + estadoPedido + '\'' +
                ", empleado=" + empleado +
                '}';
    }
}
