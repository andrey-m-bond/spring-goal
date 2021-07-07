package carshop.services;


import carshop.db.models.GoodModel;
import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class GoodsTableService extends BasicTableService<GoodModel> {

    public GoodsTableService(CrudRepository<GoodModel, Integer> crudRepository) {
        super(crudRepository);
    }
}