package com.example.demo;




import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;


@Controller
public class ControllerTest {


    @RequestMapping("/index")
    public String index(Model model){

//        model.addAttribute("message","This is Thymeleaf");
        User user = new User();
//        user.setName("bbbbb");
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

    @RequestMapping("/table")
    public String table() {
        return "table";
    }

    @RequestMapping("/table/msg")
    @ResponseBody
    public Map<String,Object> tableMsg(Model model) {
        Map<String,String> userMap = new HashMap<>();
        userMap.put("id","001");
        userMap.put("username","admin");
        List<Map> list = new ArrayList<>();
        list.add(userMap);
        Map<String,Object> response = new LinkedHashMap<>();
        response.put("code","0");
        response.put("data",list);
        return response;
    }

}
