package bank.com.SignUpAndAuth.web;

import bank.com.SignUpAndAuth.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/users/")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @DeleteMapping(value = "delete")
    @ResponseStatus(HttpStatus.OK)
    public void deleteById(@RequestParam Long id) {
        userService.deleteById(id);
    }

    @GetMapping("getById")
    @ResponseStatus(HttpStatus.ACCEPTED)
    public void getById(@RequestParam Long id) {
        userService.findById(id);
    }
}
