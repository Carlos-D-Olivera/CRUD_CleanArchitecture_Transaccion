package common.mapper;

import domain.model.TransaccionModel;
import infraestructure.database.entities.TransaccionEntity;

import java.time.LocalDateTime;

public class TransaccionMapper {

    public static TransaccionModel transaccionEntityToModel(TransaccionEntity transaccionEntity){
        TransaccionModel transaccionModel = new TransaccionModel();
        transaccionModel.setCodigo(transaccionEntity.getCodigo());
        transaccionModel.setPassword(transaccionEntity.getPassword());
        transaccionModel.setEmail(transaccionEntity.getEmail());
        transaccionModel.setIdFactura(transaccionEntity.getIdFactura());
        transaccionModel.setMonto(transaccionEntity.getMonto());
        transaccionModel.setFechaTransaccion(
                LocalDateTime.parse(transaccionEntity.getFechaTransaccion())
        );

        transaccionModel.setMetodopago(transaccionEntity.getMetodopago());
        transaccionModel.setEstado(transaccionEntity.getEstado());
        transaccionModel.setDescripcion(transaccionEntity.getDescripcion());
        transaccionModel.setIdCliente(transaccionEntity.getIdCliente());
        transaccionModel.setDescripcion(transaccionEntity.getDescripcion());

        return transaccionModel;
    }

    public static TransaccionEntity transaccionModelToEntity(TransaccionModel transaccionModel){
        TransaccionEntity transaccionEntity = new TransaccionEntity();
        transaccionEntity.setCodigo(transaccionModel.getCodigo());
        transaccionEntity.setPassword(transaccionModel.getPassword());
        transaccionEntity.setEmail(transaccionModel.getEmail());
        transaccionEntity.setIdFactura(transaccionModel.getIdFactura());
        transaccionEntity.setMonto(transaccionModel.getMonto());
        transaccionEntity.setFechaTransaccion(transaccionModel.getFechaTransaccion().toString());
        transaccionEntity.setMetodopago(transaccionModel.getMetodopago());
        transaccionEntity.setEstado(transaccionModel.getEstado());
        transaccionEntity.setDescripcion(transaccionModel.getDescripcion());
        return transaccionEntity;
    }
}
