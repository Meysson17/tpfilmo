package fr.eni.film.filmo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.SessionAttributes;

import fr.eni.film.filmo.bll.FilmService;
import fr.eni.film.filmo.bo.FilmBo;

@Controller
@SessionAttributes("film")
public class FilmController {
	
	@Autowired
	private FilmService filmService;
	
	@ModelAttribute("film")
	public List<FilmBo> getFilmBos() {
		return new ArrayList<FilmBo>();
	}

	@GetMapping("/")
	public String accueil(Model model) {
		model.addAttribute("films", filmService.getListeFilms());
		return "home";
	}

	@GetMapping("/film/{filmtitle}")
	public String film(@PathVariable String title) {
		return "film";
	}

}
