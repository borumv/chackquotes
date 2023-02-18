package com.borisvlasevsky.chackquotes.controllers;

import com.borisvlasevsky.chackquotes.services.QuoteService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class QuoteController {

    private final QuoteService quoteService;


    public QuoteController(QuoteService quoteService) {
        this.quoteService = quoteService;
    }

    @GetMapping("/")
    public ModelAndView getQuote(ModelAndView modelAndView){
       modelAndView.addObject("joke", quoteService.getRandomJoke());
       modelAndView.setViewName("index");
       return modelAndView;
    }

}
