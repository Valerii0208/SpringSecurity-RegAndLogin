package bank.com.SignUpAndAuth.service.impl;

import bank.com.SignUpAndAuth.service.UserService;
import bank.com.SignUpAndAuth.service.exception.UserNotFoundException;
import bank.com.entity.User;
import bank.com.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    @Override
    public Long create(User user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        return userRepository.save(user).getId();
    }

    @Override
    public User getByUsername(String username) {
        return userRepository.findByUsername(username).orElseThrow(() -> new UserNotFoundException("User with this username  doesn't exist"));
    }

    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
