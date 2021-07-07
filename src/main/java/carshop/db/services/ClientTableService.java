package carshop.db.services;

import carshop.db.models.ClientModel;
import carshop.db.repositories.ClientsTableRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClientTableService {

    private final ClientsTableRepository tableRepository;

    public Iterable<ClientModel> getList() {
        return tableRepository.findAll();
    }
}