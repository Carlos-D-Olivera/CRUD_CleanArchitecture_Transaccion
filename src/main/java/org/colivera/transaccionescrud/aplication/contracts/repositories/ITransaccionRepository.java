package org.colivera.transaccionescrud.aplication.contracts.repositories;

import org.colivera.transaccionescrud.domain.model.TransaccionModel;

import java.util.List;

public interface ITransaccionRepository {

    public TransaccionModel crear(TransaccionModel transaccion);

    public TransaccionModel buscar(Integer codigo);

    public TransaccionModel actualizar(TransaccionModel transaccion);

    public boolean borrar(Integer codigo);

    public List<TransaccionModel> listarTodos();

}
