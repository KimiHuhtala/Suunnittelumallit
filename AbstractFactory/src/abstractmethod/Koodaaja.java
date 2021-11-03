package abstractmethod;

public class Koodaaja {
    private String nimi;
    private String ammatti;
    private String hattu;
    private String paita;
    private String housut;
    private String kengät;

    public Koodaaja(String nimi, String ammatti){
        this.nimi = nimi;
        this.ammatti = ammatti;
    }

    public String getNimi() {
        return nimi;
    }

    public void setNimi(String name) {
        this.nimi = nimi;
    }

    public String getAmmatti() {
        return ammatti;
    }

    public void setAmmatti(String ammatti) {
        this.ammatti = ammatti;
    }

    public String getHattu() {
        return hattu;
    }

    public void setHattu(String hattu) {
        this.hattu = hattu;
    }

    public String getPaita() {
        return paita;
    }

    public void setPaita(String paita) {
        this.paita = paita;
    }

    public String getHousut() {
        return housut;
    }

    public void setHousut(String housut) {
        this.housut = housut;
    }

    public String getKengät() {
        return kengät;
    }

    public void setKengät(String kengät) {
        this.kengät = kengät;
    }

}
