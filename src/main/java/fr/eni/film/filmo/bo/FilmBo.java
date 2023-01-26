package fr.eni.film.filmo.bo;

public class FilmBo {

    private int id;
    private String title;
    private int annee;
    private int duree;
    private String synopsis;

    private AvisBo avis;

    public FilmBo(int id, String title, int annee, int duree, String synopsis) {
        super();
        this.id =id;
        this.title = title;
        this.annee=annee;
        this.duree = duree;
        this.synopsis=synopsis;
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

    public AvisBo getAvis() {
        return avis;
    }

    public void setAvis(AvisBo avis) {
        this.avis = avis;
    }
}
