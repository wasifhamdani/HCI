/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nexbiz.widget;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

/**
 *
 * @author Nadeem Baig
 */
public class CurrencyRates {
    
        private static final String _LINK = "http://finance.yahoo.com/d/quotes.csv?f=l1&s=";    
        private static double result= 0.0;
        public static double findExchangeRateAndConvert(String from, String to, long amount) 
        {
          
            try 
            {

                URL url = new URL(_LINK + from + to + "=X");

                //System.out.println(url.getHost());

                HttpURLConnection con = (HttpURLConnection) url.openConnection();

                con.connect();

                if (con.getResponseCode() == 200)
                {

                     System.out.println("Connection established!!");
                     System.out.println(url.getHost());
                    try (BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()))) {
                        String line = reader.readLine();
                        if (line.length() > 0)
                        {
                            
                                result = Double.parseDouble(line) * amount;
                            
                        }
                    }
                }
                 

            } 
            catch (IOException | NumberFormatException ex) 
                {

                    System.out.println("No Connection");
                    result = OfflineCurrencyRates.getOfflineRates(from, to, amount);
                   // return result;

                }
            return result;
    }
        
     
}
