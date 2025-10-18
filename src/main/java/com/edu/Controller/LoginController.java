package com.edu.Controller;
import com.edu.Service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class LoginController {


    @Autowired
    private LoginService loginService;

    @GetMapping("/login")
    @ResponseBody
    public String login() {
        return "Login Successful";
    }

    @ResponseBody
    @PostMapping("/processlogin")
    public String processLogin(@RequestParam String username, @RequestParam String password) {
//        String username = "DAV1";
//        String password = "12345";
        if (username != null && password != null) {
            String loginDetail = loginService.processLogin(username, password);
            if(loginDetail.equalsIgnoreCase("success")){
                return "{\"status\":\"success\",\"message\":\"Login successful\"}";
            } else {
                return "{\"status\":\"error\",\"message\":\"Invalid credentials\"}";
            }
        } else {
            return "{\"status\":\"error\",\"message\":\"Invalid credentials\"}";
        }
    }


}
