package com.borisvlasevsky.chackquotes.controllers;

import com.borisvlasevsky.chackquotes.services.QuoteService;
import com.borisvlasevsky.chackquotes.services.QuoteServiceImpl;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuoteController {

    private final QuoteService quoteServiceImpl;


    public QuoteController(QuoteService quoteServiceImpl) {
        this.quoteServiceImpl = quoteServiceImpl;
    }

    @GetMapping("/")
    public ModelAndView getQuote(ModelAndView modelAndView){
       modelAndView.addObject("joke", quoteServiceImpl.getRandomJoke());
       modelAndView.setViewName("index");
       return modelAndView;
    }

}
