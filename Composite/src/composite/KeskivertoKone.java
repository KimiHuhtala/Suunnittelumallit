package composite;

public class KeskivertoKone implements Tehdas {
    @Override
    // Luo keskihintaisen tietokoneen
    public KoneenOsat luoTietokone() {
        KoneenOsat naytonohjain = new NaytonohjainAsus();
        KoneenOsat muisti = new MuistiCorsair();
        KoneenOsat nettikortti = new NettikorttiPCIe();
        KoneenOsat prosessori = new ProsessoriAMD();

        EmolevyAsus emolevy = new EmolevyAsus();
        emolevy.lisaaKomponentti(naytonohjain);
        emolevy.lisaaKomponentti(muisti);
        emolevy.lisaaKomponentti(nettikortti);
        emolevy.lisaaKomponentti(prosessori);

        KoteloAsus kotelo = new KoteloAsus();
        kotelo.lisaaComponentti(emolevy);
        // Hinta yhteensä
        return kotelo;
    }
}
