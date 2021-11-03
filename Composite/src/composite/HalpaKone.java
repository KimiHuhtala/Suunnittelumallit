package composite;

public class HalpaKone implements Tehdas {
    @Override
    // Luo halvan tietokoneen
    public KoneenOsat luoTietokone() {
        KoneenOsat naytonohjain = new NaytonohjainNVIDIA();
        KoneenOsat muisti = new MuistiCorsair();
        KoneenOsat nettikortti = new NettikorttiPCI();
        KoneenOsat prosessori = new ProsessoriAMD();

        EmolevyMSI emolevy = new EmolevyMSI();
        emolevy.lisaaKomponentti(naytonohjain);
        emolevy.lisaaKomponentti(muisti);
        emolevy.lisaaKomponentti(nettikortti);
        emolevy.lisaaKomponentti(prosessori);

        KoteloAsus kotelo = new KoteloAsus();
        kotelo.lisaaComponentti(emolevy);
        // Hinta yhteensä:
        return kotelo;
    }
}
