package fr.eni.film.filmo.controller;

import fr.eni.film.filmo.bll.FilmService;
import fr.eni.film.filmo.bo.FilmBo;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("film")
public class FilmController {

    private FilmBo film() {return new FilmBo();}
    @Autowired
    private FilmService service;

    public FilmController(FilmService service){
        this.service = service;
    }

    @GetMapping({"/", "/home"})
    public String accueil() {
        return "home";
    }



}
