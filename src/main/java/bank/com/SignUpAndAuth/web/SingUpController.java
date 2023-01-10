package bank.com.SignUpAndAuth.web;

import bank.com.entity.User;
import bank.com.SignUpAndAuth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/sign-up")
@RequiredArgsConstructor
public class SingUpController {

    private final UserService userService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Long signUp(@RequestBody User user) {
        return userService.create(user);
    }


}
