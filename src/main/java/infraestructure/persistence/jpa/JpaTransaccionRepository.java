package infraestructure.persistence.jpa;

import domain.model.TransaccionModel;
import infraestructure.database.entities.TransaccionEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JpaTransaccionRepository extends JpaRepository<TransaccionEntity, Integer> {
}
