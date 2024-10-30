package org.colivera.transaccionescrud.aplication.contracts.services;

import org.colivera.transaccionescrud.domain.model.TransaccionModel;

public interface IBuscarTransaccionService {
    public TransaccionModel buscarTransaccion(Integer codigo);
}
