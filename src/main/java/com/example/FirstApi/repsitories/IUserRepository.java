package example.FirstApi.repsitories;

import example.FirstApi.models.CUser;

import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public class IUserRepository extends CrudRepository<CUser, integer> {
    public Optional<Object> findById(int id) {
    }
}
