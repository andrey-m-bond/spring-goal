package carshop.db.services;


import carshop.db.models.TaskTableModel;
import carshop.db.repositories.TaskTableRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskTableService {

    @Autowired
    private TaskTableRepository taskTableRepository;

    public Iterable<TaskTableModel> getAllDescriptions() {
        var s = taskTableRepository.findAll();
        return s;
    }
}