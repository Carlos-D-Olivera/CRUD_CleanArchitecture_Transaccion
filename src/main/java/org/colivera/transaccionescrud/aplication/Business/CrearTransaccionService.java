package org.colivera.transaccionescrud.aplication.Business;

import org.colivera.transaccionescrud.aplication.contracts.repositories.ITransaccionRepository;
import org.colivera.transaccionescrud.aplication.contracts.services.ICrearTransaccionService;
import org.colivera.transaccionescrud.domain.model.TransaccionModel;
import org.colivera.transaccionescrud.infraestructure.persistence.repositories.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class CrearTransaccionService implements ICrearTransaccionService {

    @Autowired
    private TransaccionRepository transaccionRepository;

    public CrearTransaccionService(TransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository;
    }


    @Override
    public TransaccionModel crearTransaccion(TransaccionModel transaccion) {
        transaccion.setFechaTransaccion(LocalDateTime.now());
        return transaccionRepository.crear(transaccion);
    }
}
