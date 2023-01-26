package fr.eni.film.filmo.bll;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import fr.eni.film.filmo.bo.FilmBo;

public interface FilmService {

    public List<FilmBo> getListeFilms();
    public Map<Integer, FilmBo> getMapFilms();

}
