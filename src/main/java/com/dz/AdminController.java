package com.dz;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * controller
 */
@Controller

public class AdminController {

    @RequestMapping(value = {"/"}, method = RequestMethod.GET)
    public ModelAndView welcomePage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("index");
        return model;
    }

    /**
     *
     * @return welcome page
     */
    @RequestMapping(value = {"/index"}, method = RequestMethod.GET)
    public ModelAndView homePage() {
        ModelAndView model = new ModelAndView();
        model.setViewName("welcome");
        model.addObject("title", "Welcome");
        model.addObject("message", "Welcome Shivani");
        return model;
    }

    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView loginPage(/*@RequestParam(value = "error", required = false) String error,
                                  @RequestParam(value = "logout", required = false) String logout*/) {

        ModelAndView model = new ModelAndView();
           model.setViewName("login");

        return model;
    }


}