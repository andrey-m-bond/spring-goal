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
                    result.append("\n");
                    result.append(item.toString());
                }
        );
        return result.toString();
    }

    public T addRecord(T t) {
        return crudRepository.save(t);
    }
}