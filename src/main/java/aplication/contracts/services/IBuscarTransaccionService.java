package aplication.contracts.services;

import domain.model.TransaccionModel;

public interface IBuscarTransaccionService {
    public TransaccionModel buscarTransaccion(Integer codigo);
}
