package fr.eni.film.filmo.bll;

import fr.eni.film.filmo.bo.AvisBo;
import fr.eni.film.filmo.bo.FilmBo;

import java.util.List;
import java.util.Map;

public interface AvisService {
    public List<AvisBo> getListeAvis();
    public Map<Integer, AvisBo> getMapAvis();

}
