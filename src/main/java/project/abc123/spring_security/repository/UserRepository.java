package project.abc123.spring_security.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import project.abc123.spring_security.domain.User;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUserid(String userid);
    boolean existsByUserid(String userid);
    boolean existsByEmail(String email);
}
