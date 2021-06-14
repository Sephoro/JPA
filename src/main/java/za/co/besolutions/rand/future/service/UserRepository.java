package za.co.besolutions.rand.future.service;

import org.springframework.data.jpa.repository.JpaRepository;
import za.co.besolutions.rand.future.entity.User;

public interface UserRepository  extends JpaRepository<User, Long> {
}
