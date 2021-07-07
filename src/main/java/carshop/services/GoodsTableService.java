package carshop.services;


import carshop.db.models.GoodModel;
import carshop.db.repositories.GoodsTableRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GoodsTableService {

    private final GoodsTableRepository goodsTableRepository;

    public Iterable<GoodModel> getList() {
        return goodsTableRepository.findAll();
    }
}