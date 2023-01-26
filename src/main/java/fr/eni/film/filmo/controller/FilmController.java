package fr.eni.film.filmo.controller;

import fr.eni.film.filmo.bll.FilmService;
import fr.eni.film.filmo.bo.FilmBo;
import org.springframework.ui.Model;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;

import java.util.ArrayList;
import java.util.List;

@Controller
@SessionAttributes("film")
public class FilmController {

    @ModelAttribute("film")
    public List<FilmBo> getFilmBos(){
        return new ArrayList<FilmBo>();
    }


    @GetMapping({"/", "/home"})
    public String accueil() {
        return "home";
    }



}
