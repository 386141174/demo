package com.example.demo;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class ControllerTest {


    @RequestMapping("/index")
    public String index(Model model){

//        model.addAttribute("message","This is Thymeleaf");
        User user = new User();
        user.setName("bbbbb");
        model.addAttribute("message",user);
        return  "index";
    }

    @RequestMapping("/change")
    @ResponseBody
    public String change(Model model){
//        User user = new User();
//        user.setName("aaaaa");
//        model.addAttribute("message",user);
        return "index";
    }

}
