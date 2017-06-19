package priv.bruce.demoproject.hibernatedemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import priv.bruce.demoproject.hibernatedemo.dao.UsersDAO;
import priv.bruce.demoproject.hibernatedemo.model.Users;

import java.util.List;

/**
 * Created by jiezhou on 2017/6/15.
 */
@Controller

public class TestController {

    @Autowired
    private UsersDAO usersDAO;

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView indexGet(){
        List<Users> list = usersDAO.getAllUser();
        ModelAndView mv = new ModelAndView("index") ;
        mv.addObject("size", list.size());
        return mv;
    }


    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ResponseBody
    public String defaultGet(){
        return "default" ;
    }
}
