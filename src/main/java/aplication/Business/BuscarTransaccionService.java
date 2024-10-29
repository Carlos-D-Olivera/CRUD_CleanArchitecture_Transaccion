package aplication.Business;

import aplication.contracts.repositories.ITransaccionRepository;
import aplication.contracts.services.IBuscarTransaccionService;
import domain.model.TransaccionModel;

public class BuscarTransaccionService implements IBuscarTransaccionService {

    private ITransaccionRepository transaccionRepository;

    @Override
    public TransaccionModel buscarTransaccion(Integer codigo) {
        return transaccionRepository.buscar(codigo);
    }

    public BuscarTransaccionService(ITransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository;
    }
}
