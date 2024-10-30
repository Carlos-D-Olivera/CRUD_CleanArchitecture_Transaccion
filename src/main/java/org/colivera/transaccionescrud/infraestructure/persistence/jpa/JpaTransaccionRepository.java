package org.colivera.transaccionescrud.infraestructure.persistence.jpa;

import org.colivera.transaccionescrud.infraestructure.database.entities.TransaccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTransaccionRepository extends JpaRepository<TransaccionEntity, Integer> {

}
