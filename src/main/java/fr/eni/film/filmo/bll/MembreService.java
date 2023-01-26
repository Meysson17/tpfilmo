package fr.eni.film.filmo.bll;

import fr.eni.film.filmo.bll.Erreur.ErreurMembre;
import fr.eni.film.filmo.bo.MembreBo;

import java.util.List;
import java.util.Map;

public interface MembreService {
    public MembreBo membre(int connexion) throws ErreurMembre;
    public List<MembreBo> getListeMembres();
    public Map<Integer, MembreBo> getMapMembres();

}
