package infraestructure.persistence.jpa;

import domain.model.TransaccionModel;
import org.springframework.stereotype.Repository;

@Repository
public class JpaTransaccionRepository extends JpaRepository<TransaccionModel, Integer>{
}
