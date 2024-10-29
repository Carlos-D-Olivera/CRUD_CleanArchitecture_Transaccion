package infraestructure.persistence.repositories;

import Business.contracts.repositories.ITransaccionRepository;
import domain.model.TransaccionModel;
import infraestructure.persistence.jpa.JpaTransaccionRepository;

import java.util.List;

public class TransaccionRepository implements ITransaccionRepository {


    private JpaTransaccionRepository jpaTransaccionRepository;

    @Override
    public TransaccionModel create(TransaccionModel transaccion) {
        try{
            jpaTransaccionRepository.save(transaccion);
        }catch (Exception e){

        }
    }

    @Override
    public TransaccionModel find(int id) {
        return null;
    }

    @Override
    public TransaccionModel update(TransaccionModel transaccion) {
        return null;
    }

    @Override
    public boolean delete(Integer codigo) {
        return false;
    }

    @Override
    public List<TransaccionModel> listAll() {
        return List.of();
    }
}
