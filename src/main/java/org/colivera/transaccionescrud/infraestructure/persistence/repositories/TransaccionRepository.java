package org.colivera.transaccionescrud.infraestructure.persistence.repositories;

import org.colivera.transaccionescrud.aplication.contracts.repositories.ITransaccionRepository;
import org.colivera.transaccionescrud.common.mapper.TransaccionMapper;
import org.colivera.transaccionescrud.domain.model.TransaccionModel;
import org.colivera.transaccionescrud.infraestructure.persistence.jpa.JpaTransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransaccionRepository implements ITransaccionRepository {

    @Autowired
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
