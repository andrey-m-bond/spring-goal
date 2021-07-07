package carshop.db.repositories;

import carshop.db.models.GoodModel;
import org.springframework.data.repository.CrudRepository;

public interface GoodsTableRepository extends CrudRepository<GoodModel, Integer> {
}
