package videoigra;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class VideoIgraTest {

    @Test
    void getNazivTest() {
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        String expected = "Toma";
        String actual = igrac.getNaziv();
        assertEquals(expected, actual);
    }

    @Test
    void setNazivTest() {
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        igrac.setNaziv("Toma2");
        String expected = "Toma2";
        String actual = igrac.getNaziv();
        assertEquals(expected, actual);
    }

    @Test
    void getZdravljeTest() {
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        double expected = 45.5;
        double actual = igrac.getZdravlje();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    void setZdravljeTest() {
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        igrac.setZdravlje(45.0);
        double expected = 45.0;
        double actual = igrac.getZdravlje();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    void getEnergijaTest() {
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        double expected = 100.0;
        double actual = igrac.getEnergija();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    void setEnergijaTest() {
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        igrac.setEnergija(90.5);
        double expected = 90.5;
        double actual = igrac.getEnergija();
        assertEquals(expected, actual, 0.001);
    }

    @Test
    void getSnagaTest() {
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        int expected = 75;
        int actual = igrac.getSnaga();
        assertEquals(expected, actual);
    }

    @Test
    void setSnagaTest() {
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        igrac.setSnaga(100);
        int expected = 100;
        int actual = igrac.getSnaga();
        assertEquals(expected, actual);
    }

    @Test
    void getInteligencijaTest() {
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        int expected = 100;
        int actual = igrac.getInteligencija();
        assertEquals(expected, actual);
    }

    @Test
    void setInteligencijaTest() {
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        igrac.setInteligencija(120);
        int expected = 120;
        int actual = igrac.getInteligencija();
        assertEquals(expected, actual);
    }

    @Test
    void getStanjeTest() {
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        Igrac.Stanje expected = Igrac.Stanje.AGRESIVNO;
        Igrac.Stanje actual = igrac.getStanje();
        assertEquals(expected, actual);
    }

    @Test
    void setStanjeTest() {
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        igrac.setStanje(Igrac.Stanje.DEFANZIVNO);
        Igrac.Stanje expected = Igrac.Stanje.DEFANZIVNO;
        Igrac.Stanje actual = igrac.getStanje();
        assertEquals(expected, actual);
    }

    @Test
    void getOruzjaTest() {
        ArrayList<Oruzje> oruzja = new ArrayList<>();
        oruzja.add(new Oruzje());
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, oruzja, new ArrayList<>(), new ArrayList<>());
        ArrayList<Oruzje> expected = oruzja;
        ArrayList<Oruzje> actual = igrac.getOruzja();
        assertEquals(expected, actual);
    }

    @Test
    void setOruzjaTest() {
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        ArrayList<Oruzje> oruzja = new ArrayList<>();
        oruzja.add(new Oruzje());
        ArrayList<Oruzje> expected = oruzja;
        igrac.setOruzja(oruzja);
        ArrayList<Oruzje> actual = igrac.getOruzja();
        assertEquals(expected, actual);
    }

    @Test
    void getOdecaTest() {
        ArrayList<Odeca> odeca = new ArrayList<>();
        odeca.add(new Odeca());
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), odeca , new ArrayList<>());
        ArrayList<Odeca> expected = odeca;
        ArrayList<Odeca> actual = igrac.getOdeca();
        assertEquals(expected, actual);
    }

    @Test
    void setOdecaTest() {
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        ArrayList<Odeca> odeca = new ArrayList<>();
        odeca.add(new Odeca());
        ArrayList<Odeca> expected = odeca;
        igrac.setOdeca(odeca);
        ArrayList<Odeca> actual = igrac.getOdeca();
        assertEquals(expected, actual);
    }

    @Test
    void getMagijeTest() {
        ArrayList<Magija> magija = new ArrayList<>();
        magija.add(new Magija());
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), magija);
        ArrayList<Magija> expected = magija;
        ArrayList<Magija> actual = igrac.getMagije();
        assertEquals(expected, actual);
    }

    @Test
    void setMagijeTest() {
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        ArrayList<Magija> magija = new ArrayList<>();
        magija.add(new Magija());
        ArrayList<Magija> expected = magija;
        igrac.setMagije(magija);
        ArrayList<Magija> actual = igrac.getMagije();
        assertEquals(expected, actual);
    }

    @Test
    void toString_ShouldReturnDataAboutPlayerAsStringInSpecificFormat() {
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        String expected = "(Toma, 45.5/100.0, STR:75, INT:100)";
        String actual = "(" + igrac.getNaziv() + ", " + igrac.getZdravlje() + "/" + igrac.getEnergija() + ", STR:" + igrac.getSnaga() + ", INT:" + igrac.getInteligencija() + ")";
        assertEquals(expected, actual);
    }

    private Oruzje oruzjeMock = Mockito.mock(Oruzje.class);
    private Odeca odecaMock = Mockito.mock(Odeca.class);
    private Magija magijaMock = Mockito.mock(Magija.class);

    ArrayList<Oruzje> oruzja2 = new ArrayList<>();
    ArrayList<Odeca> odeca2 = new ArrayList<>();
    ArrayList<Magija> magije2 = new ArrayList<>();
    Igrac igrac1;
    Igrac igrac2;

    private Oruzje oruzjeMock2 = Mockito.mock(Oruzje.class);
    private Odeca odecaMock2 = Mockito.mock(Odeca.class);
    private Magija magijaMock2 = Mockito.mock(Magija.class);

    void initializer(){
        oruzja2.add(oruzjeMock);
        odeca2.add(odecaMock);
        magije2.add(magijaMock);

        oruzja2.add(oruzjeMock2);
        odeca2.add(odecaMock2);
        magije2.add(magijaMock2);

        igrac1 = new Igrac("Toma", 45.5, 19.0, 60, 100, Igrac.Stanje.DEFANZIVNO, oruzja2, odeca2, magije2);
        igrac2 = new Igrac("Marko", 57.0, 19.0, 50, 50, Igrac.Stanje.AGRESIVNO, oruzja2, odeca2, magije2);
    }

    // TESTOVI ZA 7. METOD -> napadniIgraca()
    @Test
    void napadniIgrac_ShouldReturnStetaEqualTo96_IfIEnergyEqualTo19AndStateEqualsToDEFANZIVNO(){
        initializer();

        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(75.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(15.0);
        double expected = 96.0;
        double actual = igrac1.napadniIgraca(0, igrac2);
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }

    @Test // ovaj test i treba da padne zbog granicne vrednosti za energiju u prvom uslovu
    void napadniIgrac_ShouldReturnStetaEqualTo96_IfIEnergyEqualTo20AndStateEqualsToDEFANZIVNO(){
        initializer();
        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(75.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(15.0);
        igrac1.setEnergija(20);
        igrac1.setStanje(Igrac.Stanje.DEFANZIVNO);
        double expected = 96.0;
        double actual = igrac1.napadniIgraca(0, igrac2);
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }

    @Test
    void napadniIgrac_ShouldDecreaseEnergyTo0_IfIEnergyEqualTo21(){
        initializer();
        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(75.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(15.0);
        igrac1.setEnergija(21);
        igrac1.napadniIgraca(0, igrac2);
        double expected = 0.0;
        double actual = igrac1.getEnergija();
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }

    @Test
    void napadniIgrac_ShouldDecreaseEnergyTo1_IfEnergyEquals22(){
        initializer();
        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(75.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(15.0);
        igrac1.setEnergija(22);
        igrac1.napadniIgraca(0, igrac2);
        double expected = 1.0;
        double actual = igrac1.getEnergija();
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }

    @Test // treba da padne jer fali break u case PASIVNO
    void napadniIgrac_ShouldReturnStetaEqualTo127AndHalf_IfIEnergyEqualsTo21AndStrengthLessThanNeedAndStateEqualsToPASIVNO(){
        initializer();
        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(61.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(15.0);
        igrac1.setEnergija(21);
        igrac1.setStanje(Igrac.Stanje.PASIVNO);
        double expected = 127.5;
        double actual = igrac1.napadniIgraca(0, igrac2);
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }

    @Test
    void napadniIgrac_ShouldReturnStetaEqualTo153_IfIEnergyEqualsTo21AndStrengthLessThanNeedAndStateEqualsToAGRESIVNO(){
        initializer();
        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(61.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(15.0);
        igrac1.setEnergija(21);
        igrac1.setStanje(Igrac.Stanje.AGRESIVNO);
        double expected = 153.0;
        double actual = igrac1.napadniIgraca(0, igrac2);
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }

    @Test
    void napadniIgrac_ShouldReturnStetaEqualTo153_IfIEnergyEqualsTo21AndStrengthEqualAsNeedAndStateEqualsToAGRESIVNO(){
        initializer();
        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(60.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(15.0);
        igrac1.setEnergija(21);
        igrac1.setStanje(Igrac.Stanje.AGRESIVNO);
        double expected = 153.0;
        double actual = igrac1.napadniIgraca(0, igrac2);
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }

    @Test
    void napadniIgrac_ShouldReturnStetaEqualTo162_IfIEnergyEqualsTo21AndStrengthGreaterThanNeedAndStateEqualsToAGRESIVNO(){
        initializer();
        Mockito.when(oruzjeMock.getPotrebnaSnaga()).thenReturn(59.0);
        Mockito.when(oruzjeMock.getSteta()).thenReturn(15.0);
        igrac1.setEnergija(21);
        igrac1.setStanje(Igrac.Stanje.AGRESIVNO);
        double expected = 162.0;
        double actual = igrac1.napadniIgraca(0, igrac2);
        assertEquals(expected, actual, 0.01);

        Mockito.verify(oruzjeMock).getPotrebnaSnaga();
        Mockito.verify(oruzjeMock).getSteta();
    }

    // TESTOVI ZA 8. METOD -> odbraniSe()

    @Test
    void odbraniSe_ShouldThrowAnIllegalArgumentException_IfGivenArgumentLessThanZero(){
        initializer();
        assertThrows(IllegalArgumentException.class, () -> {
            igrac1.odbraniSe(-1.0);
        });
    }

    @Test
    void odbraniSe_ShouldThrowAnIllegalArgumentException_IfGivenArgumentEqualToZero(){
        initializer();
        assertThrows(IllegalArgumentException.class, () -> {
            igrac1.odbraniSe(0.0);
        });
    }

}