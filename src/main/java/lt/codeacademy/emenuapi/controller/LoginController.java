package lt.codeacademy.emenuapi.controller;

import lt.codeacademy.emenuapi.dto.Login;
import lt.codeacademy.emenuapi.dto.User;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static lt.codeacademy.emenuapi.ApplicationPath.LOGIN;

@RestController
@RequestMapping(LOGIN)
public class LoginController {
    @PostMapping
    public Login login(@AuthenticationPrincipal User user) {
        return new Login(user);
    }
}