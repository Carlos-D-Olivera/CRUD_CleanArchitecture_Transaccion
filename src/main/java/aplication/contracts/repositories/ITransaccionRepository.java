package aplication.contracts.repositories;

import domain.model.TransaccionModel;

import java.util.List;

public interface ITransaccionRepository {

    public TransaccionModel crear(TransaccionModel transaccion);

    public TransaccionModel buscar(Integer codigo);

    public TransaccionModel actualizar(TransaccionModel transaccion);

    public boolean borrar(Integer codigo);

    public List<TransaccionModel> listarTodos();

}
