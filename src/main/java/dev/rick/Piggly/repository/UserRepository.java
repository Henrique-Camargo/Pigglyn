package dev.rick.Piggly.repository;

import dev.rick.Piggly.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
