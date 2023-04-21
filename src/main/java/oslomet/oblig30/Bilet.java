package oslomet.oblig30;

public class Bilet {
    private String film;
    private int adet;
    private String isim;
    private String soyisim;
    private String telefon;
    private String eposta;

    public Bilet(String film, int adet, String isim, String soyisim, String telefon, String eposta) {
        this.film = film;
        this.adet = adet;
        this.isim = isim;
        this.soyisim = soyisim;
        this.telefon = telefon;
        this.eposta = eposta;
    }

    public Bilet(){}

    public String getFilm() {
        return film;
    }

    public void setFilm(String film) {
        this.film = film;
    }

    public int getAdet() {
        return adet;
    }

    public void setAdet(int adet) {
        this.adet = adet;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public String getSoyisim() {
        return soyisim;
    }

    public void setSoyisim(String soyisim) {
        this.soyisim = soyisim;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    public String getEposta() {
        return eposta;
    }

    public void setEposta(String eposta) {
        this.eposta = eposta;
    }
}
