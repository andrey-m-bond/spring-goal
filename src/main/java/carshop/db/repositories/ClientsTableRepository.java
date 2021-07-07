package carshop.db.repositories;

import carshop.db.models.ClientModel;
import org.springframework.data.repository.CrudRepository;

public interface ClientsTableRepository extends CrudRepository<ClientModel, Integer> {
}