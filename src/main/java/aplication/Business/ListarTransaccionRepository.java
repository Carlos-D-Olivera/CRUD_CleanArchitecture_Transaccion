package aplication.Business;

import aplication.contracts.repositories.ITransaccionRepository;
import aplication.contracts.services.IListarTransaccionService;
import domain.model.TransaccionModel;

import java.util.List;

public class ListarTransaccionRepository implements IListarTransaccionService {

    private ITransaccionRepository transaccionRepository;

    public ListarTransaccionRepository(ITransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository;
    }


    @Override
    public List<TransaccionModel> listarTransacciones() {
        return this.transaccionRepository.listarTodos();
    }
}
