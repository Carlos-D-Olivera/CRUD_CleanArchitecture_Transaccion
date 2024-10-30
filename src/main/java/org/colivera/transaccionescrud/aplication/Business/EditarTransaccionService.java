package org.colivera.transaccionescrud.aplication.Business;

import org.colivera.transaccionescrud.aplication.contracts.repositories.ITransaccionRepository;
import org.colivera.transaccionescrud.aplication.contracts.services.IEditarTransaccionService;
import org.colivera.transaccionescrud.domain.model.TransaccionModel;
import org.springframework.stereotype.Service;

@Service
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
