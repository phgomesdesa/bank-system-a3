package uam.bradesco_bank_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uam.bradesco_bank_system.entities.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
