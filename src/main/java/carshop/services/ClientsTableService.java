package carshop.services;

import carshop.db.models.ClientModel;
import carshop.db.repositories.ClientsTableRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ClientsTableService extends BasicTableService<ClientModel> {

    public ClientsTableService(CrudRepository<ClientModel, Integer> crudRepository) {
        super(crudRepository);
    }
}