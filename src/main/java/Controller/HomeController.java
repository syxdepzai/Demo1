package Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("message", "Welcome to Spring Security Demo!");
        return "hello";
    }

    @GetMapping("/admin")
    public String admin() {
        return "admin";
    }
}
