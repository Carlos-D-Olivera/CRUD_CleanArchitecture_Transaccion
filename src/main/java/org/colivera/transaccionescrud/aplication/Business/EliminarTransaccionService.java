package org.colivera.transaccionescrud.aplication.Business;

import org.colivera.transaccionescrud.aplication.contracts.repositories.ITransaccionRepository;
import org.colivera.transaccionescrud.aplication.contracts.services.IEliminarTransaccionService;
import org.springframework.stereotype.Service;

@Service
public class EliminarTransaccionService implements IEliminarTransaccionService {

    private ITransaccionRepository transaccionRepository;

    public EliminarTransaccionService(ITransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository;
    }

    @Override
    public void eliminarTransaccion(Integer codigo) {
        this.transaccionRepository.borrar(codigo);
    }

}
