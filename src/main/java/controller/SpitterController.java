package controller;

import entity.Spitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

/**
 * @author tanjie
 * @date 2018-07-04
 */
@Controller
@RequestMapping(value = "/spitter")
public class SpitterController {
    @RequestMapping(value = "/register", method = RequestMethod.GET)
    public String getRegisterPage(Model model) {
        model.addAttribute("spitter", new Spitter());
        return "register";
    }

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(@Valid Spitter spitter, Errors errors) {
        if (errors.hasErrors()) {
            return "register";
        }
        System.out.println(spitter.getFirstName());
        System.out.println(spitter.getLastName());
        System.out.println(spitter.getUsername());
        System.out.println(spitter.getPassword());
        return "redirect:/spitter/" + spitter.getUsername();
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable(value = "username") String username, Model model) {
        model.addAttribute("username", username);
        return "profile";

    }
}
