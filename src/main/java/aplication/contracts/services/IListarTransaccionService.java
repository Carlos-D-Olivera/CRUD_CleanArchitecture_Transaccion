package aplication.contracts.services;

import domain.model.TransaccionModel;

import java.util.List;

public interface IListarTransaccionService {
    public List<TransaccionModel> listarTransacciones();
}
