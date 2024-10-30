package org.colivera.transaccionescrud.infraestructure.database.entities;


import jakarta.persistence.*;

import java.time.LocalDate;
import java.time.LocalDateTime;


@Entity(name = "transaccion")
@Table(name = "transaccion")
public class TransaccionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer codigo;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

    @Column
    private String idFactura;

    @Column
    private Double monto;

    @Column(name = "fechaTransaccion")
    private LocalDateTime fechaTransaccion;

    @Column
    private String metodopago;

    @Column
    private int estado;

    @Column
    private int idCliente;

    @Column
    private String descripcion;

    public TransaccionEntity() {
    }

    public TransaccionEntity(Integer codigo, String password, String email, String idFactura, Double monto, LocalDateTime fechaTransaccion, String metodopago, int estado, int idCliente, String descripcion) {
        this.codigo = codigo;
        this.password = password;
        this.email = email;
        this.idFactura = idFactura;
        this.monto = monto;
        this.fechaTransaccion = fechaTransaccion;
        this.metodopago = metodopago;
        this.estado = estado;
        this.idCliente = idCliente;
        this.descripcion = descripcion;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(String idFactura) {
        this.idFactura = idFactura;
    }

    public Double getMonto() {
        return monto;
    }

    public void setMonto(Double monto) {
        this.monto = monto;
    }

    public LocalDateTime getFechaTransaccion() {
        return fechaTransaccion;
    }

    public void setFechaTransaccion(LocalDateTime fechaTransaccion) {
        this.fechaTransaccion = fechaTransaccion;
    }

    public String getMetodopago() {
        return metodopago;
    }

    public void setMetodopago(String metodopago) {
        this.metodopago = metodopago;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
