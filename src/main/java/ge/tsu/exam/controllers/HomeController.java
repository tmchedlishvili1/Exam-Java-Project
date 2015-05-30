package ge.tsu.exam.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Locale;

/**
 * Created by tato on 5/31/15.
 */
@Controller
@RequestMapping(value = "/home", method = RequestMethod.GET)
public class HomeController {

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public String getHomePage(Locale locale,Model model) {
     try{
         System.out.println("dsadas");
         return "hello world";
     } catch (Exception e) {
         e.printStackTrace();
     }

        return "hello world";
    }
}
