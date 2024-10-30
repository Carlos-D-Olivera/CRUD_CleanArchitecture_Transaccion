package org.colivera.transaccionescrud.aplication.Business;

import org.colivera.transaccionescrud.aplication.contracts.repositories.ITransaccionRepository;
import org.colivera.transaccionescrud.aplication.contracts.services.IListarTransaccionService;
import org.colivera.transaccionescrud.domain.model.TransaccionModel;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListarTransaccionService implements IListarTransaccionService {

    private ITransaccionRepository transaccionRepository;

    public ListarTransaccionService(ITransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository;
    }


    @Override
    public List<TransaccionModel> listarTransacciones() {
        return this.transaccionRepository.listarTodos();
    }
}
