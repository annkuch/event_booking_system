package com.example.event_booking_system.controller;

import com.example.event_booking_system.models.user.User;
import com.example.event_booking_system.dto.RegistrationDto;
import com.example.event_booking_system.service.UserService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller("")
public class AuthController {
    private UserService userService;
    public AuthController(UserService userService) {
        this.userService = userService;
    }
//    @GetMapping("/login")
//    {
//
//    }
    @GetMapping("/register")
    public String getRegisterForm(Model model) {
        RegistrationDto user=new RegistrationDto();
        model.addAttribute("user", user);
        return "register";
    }
    @PostMapping("/register/save")
    public String registerUser(@Valid @ModelAttribute("user") RegistrationDto user,
                               BindingResult result, Model model) {
        User existingUser = userService.findByEmail(user.getEmail());
        if (existingUser != null && existingUser.getEmail() !=null && !existingUser.getEmail().isEmpty()) {
            result.rejectValue("email", null, "There is already an account registered with that email");
        }
        if (result.hasErrors()) {
            model.addAttribute("user", user);
            return "register";
        } else {
        userService.saveUser(user);
        return "redirect:/events/all?success";
    }

    }

}

