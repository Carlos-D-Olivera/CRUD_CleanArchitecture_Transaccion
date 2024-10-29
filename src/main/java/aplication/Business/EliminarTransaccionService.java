package aplication.Business;

import aplication.contracts.repositories.ITransaccionRepository;
import aplication.contracts.services.IEliminarTransaccionService;

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
