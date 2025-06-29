package uam.bradesco_bank_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import uam.bradesco_bank_system.entities.Transaction;

import java.util.UUID;

public interface TransactionRepository extends JpaRepository<Transaction, UUID> {
}
