package Business.contracts.repositories;

import domain.model.TransaccionModel;

import java.util.List;

public interface ITransaccionRepository {

    public TransaccionModel create(TransaccionModel transaccion);

    public TransaccionModel find(int id);

    public TransaccionModel update(TransaccionModel transaccion);

    public boolean delete(Integer codigo);

    public List<TransaccionModel> listAll();

}
