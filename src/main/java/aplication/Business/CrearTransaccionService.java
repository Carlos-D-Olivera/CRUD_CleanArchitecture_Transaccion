package aplication.Business;

import aplication.contracts.repositories.ITransaccionRepository;
import aplication.contracts.services.ICrearTransaccionService;
import domain.model.TransaccionModel;

public class CrearTransaccionService implements ICrearTransaccionService {

    private ITransaccionRepository transaccionRepository;

    public CrearTransaccionService(ITransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository;
    }


    @Override
    public TransaccionModel crearTransaccion(TransaccionModel transaccion) {
        return transaccionRepository.crear(transaccion);
    }
}
