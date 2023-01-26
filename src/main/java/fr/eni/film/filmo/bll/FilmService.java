package fr.eni.film.filmo.bll;

import fr.eni.film.filmo.bo.FilmBo;

import java.util.List;
import java.util.Map;

public interface FilmService {

    public List<FilmBo> getListeFilms();
    public Map<Integer, FilmBo> getMapFilms();

}
