package fr.eni.film.filmo.bo;

import java.util.ArrayList;
import java.util.List;

public class FilmBo {

    private int id;
    private String title;
    private int annee;
    private int duree;
    private String synopsis;

    private List<AvisBo> avis;

    private GenreBo genre;

    private ParticipantBo realisateur;

    private List<ParticipantBo> acteurs;


    public FilmBo(int id, String title, int annee, int duree, String synopsis) {
        super();
        this.id =id;
        this.title = title;
        this.annee=annee;
        this.duree = duree;
        this.synopsis=synopsis;
    }

    public FilmBo(Integer id, String title, int annee, ParticipantBo realisateur,
                int duree, GenreBo genre, String synopsis) {
        super();
        this.id = id;
        this.title = title;
        this.annee = annee;
        this.realisateur = realisateur;
        this.duree = duree;
        this.genre = genre;
        this.acteurs = new ArrayList<ParticipantBo>();
        this.avis = new ArrayList<AvisBo>();
        this.synopsis = synopsis;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getAnnee() {
        return annee;
    }

    public void setAnnee(int annee) {
        this.annee = annee;
    }

    public int getDuree() {
        return duree;
    }

    public void setDuree(int duree) {
        this.duree = duree;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    @Override
    public String toString() {
        return "FilmBo{" +
                "title='" + title + '\'' +
                ", annee=" + annee +
                ", duree=" + duree +
                ", synopsis='" + synopsis + '\'' +
                '}';
    }



    public GenreBo getGenre() {
        return genre;
    }

    public void setGenre(GenreBo genre) {
        this.genre = genre;
    }

    public ParticipantBo getParticipant() {
        return realisateur;
    }

    public void setParticipant(ParticipantBo participant) {
        this.realisateur = participant;
    }

    public List<ParticipantBo> getActeurs() {
        return acteurs;
    }

    public void setActeurs(List<ParticipantBo> acteurs) {
        this.acteurs = acteurs;
    }


    public List<AvisBo> getAvis() {
        return avis;
    }

    public void setAvis(List<AvisBo> avis) {
        this.avis = avis;
    }

    public ParticipantBo getRealisateur() {
        return realisateur;
    }

    public void setRealisateur(ParticipantBo realisateur) {
        this.realisateur = realisateur;
    }


}
