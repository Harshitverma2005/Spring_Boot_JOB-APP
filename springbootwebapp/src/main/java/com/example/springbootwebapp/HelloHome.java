package com.example.springbootwebapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;




@Controller
public class HelloHome {

    @RequestMapping("/") 
    public String home()
    {
        return "index";
    }

    //   @RequestMapping("add") 
    // public String add(HttpServletRequest req,
    //                   HttpSession session)
    // {
    //     int number1 = Integer.parseInt(req.getParameter("num1"));
    //     int number2 = Integer.parseInt(req.getParameter("num2"));
    //     int result = number1 + number2;
        
    //     // Store the result in the session
    //     session.setAttribute("number1", number1);
    //     session.setAttribute("number2", number2);
    //     session.setAttribute("result", result);

        
    //     return "result";
    // }
    // @RequestMapping("addAlien")
    // public ModelAndView addAlien(@RequestParam("alienid")int alienId, @RequestParam("alienname") String alienName,ModelAndView modelAndView) {
    // Alien alien = new Alien();
    // alien.setAlienId(alienId);
    // alien.setAlienName(alienName);
    // modelAndView.addObject("alien", alien);
    // modelAndView.setViewName("result");
    // return modelAndView;
    // }
    @RequestMapping("addAlien")
    public  String addAlien(@ModelAttribute Alien alien) {
        return "return";
    }


    
}
