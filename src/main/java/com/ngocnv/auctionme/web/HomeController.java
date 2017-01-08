package com.ngocnv.auctionme.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by framgia on 26/12/2016.
 */

@Controller("home")
public class HomeController {

    @RequestMapping(value="/", method = RequestMethod.GET)
    public String home() {
        return "home";
    }
}
