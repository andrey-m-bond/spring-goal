package carshop.services;

import lombok.RequiredArgsConstructor;
import org.springframework.data.repository.CrudRepository;

@RequiredArgsConstructor
public class BasicTableService<T> {

    private final CrudRepository<T, Integer> crudRepository;

    public String getAll() {
        StringBuilder result = new StringBuilder();
        crudRepository.findAll().forEach(
                item -> {
                    result.append(item.toString());
                    result.append("\n");
                }
        );
        return result.toString();
    }
}