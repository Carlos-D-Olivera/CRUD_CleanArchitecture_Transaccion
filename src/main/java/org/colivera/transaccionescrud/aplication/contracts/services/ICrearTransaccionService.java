package org.colivera.transaccionescrud.aplication.contracts.services;

import org.colivera.transaccionescrud.domain.model.TransaccionModel;

public interface ICrearTransaccionService {
    public TransaccionModel crearTransaccion(TransaccionModel transaccion);
}
