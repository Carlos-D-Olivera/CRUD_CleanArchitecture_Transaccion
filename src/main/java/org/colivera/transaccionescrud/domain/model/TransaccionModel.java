package org.colivera.transaccionescrud.domain.model;

import java.time.LocalDateTime;

public class TransaccionModel {

    private Integer codigo;

    private String password;

    private String email;

    private String idFactura;

    private Double monto;

    private LocalDateTime fechaTransaccion;

    private String metodopago;

    private int estado;

    private int idCliente;

    private String descripcion;

    public TransaccionModel() {}

    public TransaccionModel(Integer codigo, String password, String email, String idFactura, Double monto, LocalDateTime fechaTransaccion, String metodopago, int estado, int idCliente, String descripcion){
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
