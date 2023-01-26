package fr.eni.film.filmo.bll;

import fr.eni.film.filmo.bo.FilmBo;

import java.util.List;
import java.util.Map;

public interface FilmService {

    public FilmBo film(int choix) throws ErreurFilm;

    public List<FilmBo> getListeFilms();
    public Map<Integer, FilmBo> getMapFilms();

}
