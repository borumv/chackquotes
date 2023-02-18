package com.borisvlasevsky.chackquotes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class QuoteServiceImpl implements QuoteService {

    ChuckNorrisQuotes chuckNorrisQuotes;

    public QuoteServiceImpl() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

   public String getRandomJoke(){
       return chuckNorrisQuotes.getRandomQuote();
   }
}
