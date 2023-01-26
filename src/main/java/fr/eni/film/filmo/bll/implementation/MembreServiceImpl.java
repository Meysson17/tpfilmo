package fr.eni.film.filmo.bll.implementation;

import fr.eni.film.filmo.bll.Erreur.ErreurMembre;
import fr.eni.film.filmo.bll.MembreService;
import fr.eni.film.filmo.bo.MembreBo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MembreServiceImpl implements MembreService {
    private List<MembreBo> listeMembres;
    public MembreBo membre(int choix) throws ErreurMembre {
        return null;
    }

    public List<MembreBo> getListeMembres() {
        return listeMembres;
    }

    public Map<Integer, MembreBo> getMapMembres() {
        return mapMembres;
    }

    private Map<Integer, MembreBo> mapMembres;


    public MembreServiceImpl() {
        listeMembres = new ArrayList<>();
        listeMembres.add( new MembreBo(1, "Potter", "Harry", "harPot", "admin", true));
        listeMembres.add( new MembreBo(2, "None", "Bergere", "bernon", "b54fr", false));
        listeMembres.add(new MembreBo(3, "Avatar", "Cid", "AvaCid", "eauCha45", false));

        mapMembres = new HashMap<Integer, MembreBo>();
        listeMembres.forEach(m -> mapMembres.put(Math.toIntExact(m.getId()), m));

    }
}
