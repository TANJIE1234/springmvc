package controller;

import entity.Spitter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.Part;
import javax.validation.Valid;
import java.io.File;
import java.io.IOException;

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
    public String register(@RequestPart("profilePicture") MultipartFile profilePicture,
                               @Valid Spitter spitter, Errors errors, Model model) throws IOException {
        if (errors.hasErrors()) {
            return "register";
        }
        System.out.println(profilePicture.getSize());
        System.out.println(spitter.getFirstName());
        System.out.println(spitter.getLastName());
        System.out.println(spitter.getUsername());
        System.out.println(spitter.getPassword());
        profilePicture.transferTo(new File("/home/tanjie/java/IdeaProjects/springmvc/src/main/webapp/tmp/spittr/uploads/"+profilePicture.getOriginalFilename()));
        model.addAttribute("firstName", spitter.getFirstName());
        return "redirect:/spitter/" + spitter.getUsername();
    }

    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String showSpitterProfile(@PathVariable(value = "username") String username, Model model) {
        model.addAttribute("username", username);
        return "profile";

    }
}
