package cz.czechitas.java2webapps.lekce2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Veronika Vyšínová
 */

@Controller
public class MainController {

    private final Random random = new Random();

    @GetMapping( "/")
    public ModelAndView pokus() {  //vracime ModelAndView - dame ti view =co mas zobrazit a model = metoda pro vypocet
        ModelAndView modelAndView = new ModelAndView("kostka"); //tady modelAndView naplnime a nastavime co se ma zobrazit/vratit, Spring najde sablonu jmenem kostka a freemarker pracuje dal
        modelAndView.addObject("cislo",hodKostkou()); //tady pouziji metodu pro nahodny hod kostkou
        return modelAndView;  //tomuto se rika view, protoze je to to, co se ma zobrazit na strance. zde namapuju soubor, ktery mam v resources
    }


   /* @GetMapping(value = "/kostka", produces = "text/plain")  //bude to fungovat pouze, kdyz budu mit nad public class RestController
    public String kostka (){
        return "" + (random.nextInt(6)+1);
    } */

    private int hodKostkou() {   //metoda pro hod kostkou
        return random.nextInt(6) +1;
    }
}
