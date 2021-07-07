package carshop.services;


import carshop.db.models.TaskTableModel;
import carshop.db.repositories.TaskTableRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class TaskTableService {

    private final TaskTableRepository taskTableRepository;

    public Iterable<TaskTableModel> getAllDescriptions() {
        return taskTableRepository.findAll();
    }
}