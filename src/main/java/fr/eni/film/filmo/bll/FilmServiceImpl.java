package fr.eni.film.filmo.bll;

import fr.eni.film.filmo.bo.FilmBo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FilmServiceImpl implements FilmService{
    private List<FilmBo> listeFilms;
    @Override
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
        listeFilms.add( new FilmBo(2, "Bucheron.ne"));
        listeFilms.add(new FilmBo(3, "Vigneron.ne"));

        mapFilms = new HashMap<Integer, FilmBo>();
        listeFilms.forEach(m -> mapFilms.put(Math.toIntExact(m.getId()), m));

    }
}
