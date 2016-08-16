/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.nexbiz.widget;

/**
 *
 * @author adivasahar
 */
public class OfflineCurrencyRates {
    
    public static double getOfflineRates(String from, String to, long amount)
    {
        //Currency Rates
        double converted_result = 0.0;
        double one = 1;
        double pk_us = 0.0096, pk_eur = 0.8957, pk_ca = 0.0124,pk_gbp = 0.0074, pk_au = 0.0125, pk_jpy=0.9669;
        double us_pk = 104.56, us_eur = 0.8943, us_ca = 1.2929,us_gbp = 0.7759, us_au = 1.3035, us_jpy=101.096;
        double eur_pk = 116.9183, eur_us = 1.1182, eur_ca = 1.4457, eur_gbp = 0.8676 , eur_au = 1.4576, eur_jpy= 113.0448;
        double ca_pk = 80.875, ca_us = 0.7735,  ca_eur= 0.6917, ca_gbp = 0.6002, ca_au = 1.0082, ca_jpy= 78.1956;
        double gbp_pk = 134.7562, gbp_us = 1.2888,  gbp_eur= 1.1526,  gbp_ca= 1.6662, gbp_au =1.6799 , gbp_jpy= 130.2918;
        double au_pk = 80.2148, au_us = 0.7672,  au_eur= 0.6861,  au_ca = 0.9918, au_gbp = 0.5953, au_jpy= 77.5573;
        double jpy_pk = 1.0343, jpy_us = 0.0099,  jpy_eur= 0.0089,  jpy_ca = 0.0129 , jpy_gbp = 0.0077, jpy_au= 0.0129 ; 
        
        // Convetion From Pakistani Rupee-PKR To Other Cureencies
        if(from.equals("PKR")  && to.equals("PKR"))
        {
            return converted_result = amount * one;
        }
        else if(from.equals("PKR")  && to.equals("USD"))
        {
            return converted_result = amount * pk_us;
        }
        else if(from.equals("PKR")  && to.equals("EUR"))
        {
            return converted_result = amount * pk_eur;
        }
        else if(from.equals("PKR") && to.equals("CAD"))
        {
            return converted_result = amount * pk_ca;
        }
        else if(from.equals("PKR") && to.equals("GBP"))
        {
            return converted_result = amount * pk_gbp;
        }
        else if(from.equals("PKR") && to.equals("AUD"))
        {
            return converted_result = amount * pk_au;
        }
        else if(from.equals("PKR") && to.equals("JPY"))
        {
            return converted_result = amount * pk_jpy;
        }
        // Convetion From US Dollar-USD To Other Cureencies
         else if(from.equals("USD")  && to.equals("PKR"))
        {
            return converted_result = amount * us_pk;
        }
        else if(from.equals("USD")  && to.equals("USD"))
        {
            return converted_result = amount * one;
        }
        else if(from.equals("USD")  && to.equals("EUR"))
        {
            return converted_result = amount * us_eur;
        }
        else if(from.equals("USD") && to.equals("CAD"))
        {
            return converted_result = amount * us_ca;
        }
        else if(from.equals("USD") && to.equals("GBP"))
        {
            return converted_result = amount * us_gbp;
        }
        else if(from.equals("USD") && to.equals("AUD"))
        {
            return converted_result = amount * us_au;
        }
        else if(from.equals("USD") && to.equals("JPY"))
        {
            return converted_result = amount * us_jpy;
        }
        //Convertion From Euro-EUR TO Other Curriencies
        else if(from.equals("EUR") && to.equals("PKR"))
        {
            return converted_result = amount * eur_pk;
        }
        else if(from.equals("EUR") && to.equals("USD"))
        {
            return converted_result = amount * eur_us;
        }
        else if(from.equals("EUR") && to.equals("EUR"))
        {
            return converted_result = amount * one;
        } 
        else if(from.equals("EUR") && to.equals("CAD"))
        {
            return converted_result = amount * eur_ca;
        }
        else if(from.equals("EUR") && to.equals("GBP"))
        {
            return converted_result = amount * eur_gbp;
        }
        else if(from.equals("EUR") && to.equals("AUD"))
        {
            return converted_result = amount * eur_au;
        }
        else if(from.equals("EUR") && to.equals("JPY"))
        {
            return converted_result = amount * eur_jpy;
        }
        //Convertion From Canadian Dollar-CAD TO Other Curriencies
        else if(from.equals("CAD") && to.equals("PKR"))
        {
            return converted_result = amount * ca_pk;
        }
        else if(from.equals("CAD") && to.equals("USD"))
        {
            return converted_result = amount * ca_us;
        }
        else if(from.equals("CAD") && to.equals("EUR"))
        {
            return converted_result = amount * ca_eur;
        }
        else if(from.equals("CAD") && to.equals("CAD"))
        {
            return converted_result = amount * one;
        }
        else if(from.equals("CAD") && to.equals("GBP"))
        {
            return converted_result = amount * ca_gbp;
        }
        else if(from.equals("CAD") && to.equals("AUD"))
        {
            return converted_result = amount * ca_au;
        }
        else if(from.equals("CAD") && to.equals("JPY"))
        {
            return converted_result = amount * ca_jpy;
        }
        //Convertion From British Pound-GBP TO Other Curriencies
        else if(from.equals("GBP") && to.equals("PKR"))
        {
            return converted_result = amount * gbp_pk;
        }
        else if(from.equals("GBP") && to.equals("USD"))
        {
            return converted_result = amount * gbp_us;
        }
        else if(from.equals("GBP") && to.equals("EUR"))
        {
            return converted_result = amount * gbp_eur;
        }
        else if(from.equals("GBP") && to.equals("CAD"))
        {
            return converted_result = amount * gbp_ca;
        }
        else if(from.equals("GBP") && to.equals("GBP"))
        {
            return converted_result = amount * one;
        }
        else if(from.equals("GBP") && to.equals("AUD"))
        {
            return converted_result = amount * gbp_au;
        }
        else if(from.equals("GBP") && to.equals("JPY"))
        {
            return converted_result = amount * gbp_jpy;
        }
        //Convertion From Australian Dollar-AUD TO Other Curriencies
        else if(from.equals("AUD") && to.equals("PKR"))
        {
            return converted_result = amount * au_pk;
        }
        else if(from.equals("AUD") && to.equals("USD"))
        {
            return converted_result = amount * au_us;
        }
        else if(from.equals("AUD") && to.equals("EUR"))
        {
            return converted_result = amount * au_eur;
        }
        else if(from.equals("AUD") && to.equals("CAD"))
        {
            return converted_result = amount * au_ca;
        }
        else if(from.equals("AUD") && to.equals("GBP"))
        {
            return converted_result = amount * au_gbp;
        }
        else if(from.equals("AUD") && to.equals("AUD"))
        {
            return converted_result = amount * one;
        }
        else if(from.equals("AUD") && to.equals("JPY"))
        {
            return converted_result = amount * au_jpy;
        }
        //Convertion From Japanese Yen-JPY TO Other Curriencies
        else if(from.equals("JPY") && to.equals("PKR"))
        {
            return converted_result = amount * jpy_pk;
        }
        else if(from.equals("JPY") && to.equals("USD"))
        {
            return converted_result = amount * jpy_us;
        }
        else if(from.equals("JPY") && to.equals("EUR"))
        {
            return converted_result = amount * jpy_eur;
        }
        else if(from.equals("JPY") && to.equals("CAD"))
        {
            return converted_result = amount * jpy_ca;
        }
        else if(from.equals("JPY") && to.equals("GBP"))
        {
            return converted_result = amount * jpy_gbp;
        }
        else if(from.equals("JPY") && to.equals("AUD"))
        {
            return converted_result = amount * jpy_au;
        }
        else if(from.equals("JPY") && to.equals("JPY"))
        {
            return converted_result = amount * one;
        }
        else
        {
            return 0.0;
        }
    }
    
}
