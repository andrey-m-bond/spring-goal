package carshop.db.repositories;

import carshop.db.models.TaskTableModel;
import org.springframework.data.repository.CrudRepository;

public interface TaskTableRepository extends CrudRepository<TaskTableModel, Integer> {
}
