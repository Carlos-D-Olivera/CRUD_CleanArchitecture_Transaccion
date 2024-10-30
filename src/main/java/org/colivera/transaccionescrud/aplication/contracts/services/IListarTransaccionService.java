package org.colivera.transaccionescrud.aplication.contracts.services;

import org.colivera.transaccionescrud.domain.model.TransaccionModel;

import java.util.List;

public interface IListarTransaccionService {
    public List<TransaccionModel> listarTransacciones();
}
