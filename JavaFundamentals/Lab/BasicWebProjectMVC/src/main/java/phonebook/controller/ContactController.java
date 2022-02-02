package phonebook.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;
import phonebook.entity.Contact;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class ContactController {
    private List<Contact> contacts;

    public ContactController(List<Contact> contactList) {
        this.contacts = new ArrayList<>();
//                Arrays.asList(
//                new Contact("Pesho", "08559658"),
//                new Contact("Hogso", "085967365"),
//                new Contact("Svetosla", "0548723"));
    }
    @GetMapping("/")
    public ModelAndView index(ModelAndView modelAndView) {
        modelAndView.setViewName("index");
        modelAndView.addObject("contacts", contacts);


        return modelAndView;
    }

    @PostMapping("/")
    public String add(Contact contact, @RequestParam("picture")MultipartFile picture) {
        this.contacts.add(contact);
        return "redirect:/";
    }
}
