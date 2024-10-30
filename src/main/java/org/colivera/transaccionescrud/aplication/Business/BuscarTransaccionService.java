package org.colivera.transaccionescrud.aplication.Business;

import org.colivera.transaccionescrud.aplication.contracts.services.IBuscarTransaccionService;
import org.colivera.transaccionescrud.domain.model.TransaccionModel;
import org.colivera.transaccionescrud.infraestructure.persistence.repositories.TransaccionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BuscarTransaccionService implements IBuscarTransaccionService {

    @Autowired
    private TransaccionRepository transaccionRepository;

    @Override
    public TransaccionModel buscarTransaccion(Integer codigo) {
        return transaccionRepository.buscar(codigo);
    }

    public BuscarTransaccionService(TransaccionRepository transaccionRepository) {
        this.transaccionRepository = transaccionRepository;
    }
}
