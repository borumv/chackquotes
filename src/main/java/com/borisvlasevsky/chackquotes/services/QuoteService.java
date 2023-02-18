package com.borisvlasevsky.chackquotes.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.springframework.stereotype.Service;

@Service
public class QuoteService {

    ChuckNorrisQuotes chuckNorrisQuotes;

    public QuoteService() {
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

   public String getRandomJoke(){
       return chuckNorrisQuotes.getRandomQuote();
   }
}
