package fr.eni.film.filmo.bll.implementation;

import fr.eni.film.filmo.bll.Erreur.ErreurFilm;
import fr.eni.film.filmo.bll.FilmService;
import fr.eni.film.filmo.bo.FilmBo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilmServiceImpl implements FilmService {
    private List<FilmBo> listeFilms;
    public FilmBo film(int choix) throws ErreurFilm {
        return null;
    }

    public List<FilmBo> getListeFilms() {
        return listeFilms;
    }

    public Map<Integer, FilmBo> getMapFilms() {
            return mapFilms;
    }

    private Map<Integer, FilmBo> mapFilms;


    public FilmServiceImpl() {
        listeFilms = new ArrayList<>();
        listeFilms.add( new FilmBo(1, "Hary Potter", 2001, 120, "Je suis la"));
        listeFilms.add( new FilmBo(2, "Bucheron.ne", 1990, 240, "Foret"));
        listeFilms.add(new FilmBo(3, "Avatar 2", 2022, 180, "Voie de l'eau"));

        mapFilms = new HashMap<Integer, FilmBo>();
        listeFilms.forEach(m -> mapFilms.put(Math.toIntExact(m.getId()), m));

    }
}
