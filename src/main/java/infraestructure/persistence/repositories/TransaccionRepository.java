package infraestructure.persistence.repositories;

import aplication.contracts.repositories.ITransaccionRepository;
import common.mapper.TransaccionMapper;
import domain.model.TransaccionModel;
import infraestructure.persistence.jpa.JpaTransaccionRepository;
import java.util.List;

public class TransaccionRepository implements ITransaccionRepository {


    private JpaTransaccionRepository jpaTransaccionRepository;

    @Override
    public TransaccionModel crear(TransaccionModel transaccion) {
        try{
            jpaTransaccionRepository.save(TransaccionMapper.transaccionModelToEntity(transaccion));
            return transaccion;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public TransaccionModel buscar(Integer codigo) {
        try {

            return TransaccionMapper.transaccionEntityToModel(jpaTransaccionRepository.findById(codigo).get());
        }catch(Exception e){
            e.printStackTrace();
            return null;
        }
    }

    @Override
    public TransaccionModel actualizar(TransaccionModel transaccion) {
        try{
            jpaTransaccionRepository.save(TransaccionMapper.transaccionModelToEntity(transaccion));
            return transaccion;
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean borrar(Integer codigo) {
        try{
            jpaTransaccionRepository.deleteById(codigo);
            return !(jpaTransaccionRepository.existsById(codigo));
        }catch(Exception e){
            e.printStackTrace();
            return false;
        }

    }

    @Override
    public List<TransaccionModel> listarTodos() {
        List<TransaccionModel> transacciones = null;
        try{
            transacciones = jpaTransaccionRepository.findAll().stream().map(
                    TransaccionMapper::transaccionEntityToModel
            ).toList();
        }catch(Exception e){
            e.printStackTrace();
        }
        return transacciones;
    }
}
