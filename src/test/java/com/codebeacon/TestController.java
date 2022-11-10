package com.codebeacon;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@Controller
public class TestController {


//    @RequestMapping(value = "/options")
//    @ResponseBody
//    public String OptionsMethod() {
//
//        return "options";
//    }

    @GetMapping("/options")
    @ResponseBody
    public String getOptions(){
        return "options";
    }

    @PostMapping("/options")
    @ResponseBody
    public String postOptions(){
        return "options";
    }

}
