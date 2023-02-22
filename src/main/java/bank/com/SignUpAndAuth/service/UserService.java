package bank.com.SignUpAndAuth.service;

import bank.com.entity.User;

public interface UserService {

    Long create(User user);
    User getByUsername(String username);

    void deleteById(Long id);

    void findById(Long id);
}
