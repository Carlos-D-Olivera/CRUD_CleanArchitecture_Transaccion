package aplication.Business;

import aplication.contracts.repositories.ITransaccionRepository;
import aplication.contracts.services.IEditarTransaccionService;
import domain.model.TransaccionModel;

public class EditarTransaccionService implements IEditarTransaccionService {

    private ITransaccionRepository transaccionRepository;

    public EditarTransaccionService(ITransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository;
    }

    @Override
    public void editarTransaccion(TransaccionModel transaccion) {
        this.transaccionRepository.actualizar(transaccion);
    }
}
