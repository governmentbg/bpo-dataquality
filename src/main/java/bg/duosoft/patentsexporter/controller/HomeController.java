package bg.duosoft.patentsexporter.controller;

import com.duosoft.security.UserDetails;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@Slf4j
@Controller
@RequestMapping
@AllArgsConstructor
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    public String viewHome(Model model, HttpServletRequest request) {
        UserDetails userDetails = (UserDetails) SecurityContextHolder.getContext().getAuthentication().getPrincipal();
        model.addAttribute("username", userDetails.getUsername().toUpperCase());
        return "home_page";
    }

}
