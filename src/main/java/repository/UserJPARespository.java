package repository;

import model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface UserJPARespository extends JpaRepository<Users,Long> {
    Users findByName(String name);
}
