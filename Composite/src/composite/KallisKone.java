package composite;

public class KallisKone implements Tehdas {
    @Override
    // Luo kalliin tietokoneen
    public KoneenOsat luoTietokone() {
        KoneenOsat naytonohjain = new NaytonohjainAsus();
        KoneenOsat muisti = new MuistiCrucial();
        KoneenOsat nettikortti = new NettikorttiPCIe();
        KoneenOsat prosessori = new ProsessoriIntel();

        EmolevyAsus emolevy = new EmolevyAsus();
        emolevy.lisaaKomponentti(naytonohjain);
        emolevy.lisaaKomponentti(muisti);
        emolevy.lisaaKomponentti(nettikortti);
        emolevy.lisaaKomponentti(prosessori);

        KoteloCoolerMaster kotelo = new KoteloCoolerMaster();
        kotelo.lisaaComponentti(emolevy);
        // Hinta yhteensä:
        return kotelo;
    }
}
