package com.jumayev.market_project.SERVICES.classes;

import com.jumayev.market_project.ENTITIES.User;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface UserService {
    User create(User user);

    User getById(Long id);

    List<User> getAll();

    void deleteById(Long id);

    User update(User user);
}
