package cloud.channels.service.demo.repositories;

import cloud.channels.service.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    Optional<User> findByEmail(String email);
    List<User> findAllByNameContainsIgnoreCase(String name);
    Optional<User> findByConfirmCode(String confirmCode);
}
