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
        String actual =  igrac.toString();
        assertEquals(expected, actual);
    }

    // TESTOVI ZA SETTERE KAD JE NULL
    @Test
    void setNaziv_ShouldThrowNullPointerException_WhenNullIsPassed(){
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        assertThrows(NullPointerException.class, () -> {
            igrac.setNaziv(null);
        });
    }

    @Test
    void setStanje_ShouldThrowNullPointerException_WhenNullIsPassed(){
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        assertThrows(NullPointerException.class, () -> {
            igrac.setStanje(null);
        });
    }

    @Test
    void setOruzja_ShouldThrowNullPointerException_WhenNullIsPassed(){
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        assertThrows(NullPointerException.class, () -> {
            igrac.setOruzja(null);
        });
    }

    @Test
    void setOdeca_ShouldThrowNullPointerException_WhenNullIsPassed(){
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        assertThrows(NullPointerException.class, () -> {
            igrac.setOdeca(null);
        });
    }

    @Test
    void setMagije_ShouldThrowNullPointerException_WhenNullIsPassed(){
        Igrac igrac = new Igrac("Toma", 45.5, 100.0, 75, 100, Igrac.Stanje.AGRESIVNO, new ArrayList<>(), new ArrayList<>(), new ArrayList<>());
        assertThrows(NullPointerException.class, () -> {
            igrac.setMagije(null);
        });
    }


    private Oruzje oruzjeMock = Mockito.mock(Oruzje.class);
    private Odeca odecaMock = Mockito.mock(Odeca.class);
    private Magija magijaMock = Mockito.mock(Magija.class);

    private Oruzje oruzjeMock2 = Mockito.mock(Oruzje.class);
    private Odeca odecaMock2 = Mockito.mock(Odeca.class);
    private Magija magijaMock2 = Mockito.mock(Magija.class);

    ArrayList<Oruzje> oruzja2 = new ArrayList<>();
    ArrayList<Odeca> odeca2 = new ArrayList<>();
    ArrayList<Magija> magije2 = new ArrayList<>();
    Igrac igrac1;
    Igrac igrac2;

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

    @Test // test pada jer nije obradjen izuzetak
    void napadniIgrac_ShouldThrowAnIllegalArgumentException_WhenNegativeIndexIsPassed(){
        initializer();
        assertThrows(IllegalArgumentException.class, () -> {
            igrac1.napadniIgraca(-1, igrac2);
        });
    }

    @Test // test pada jer nije obradjen izuzetak
    void napadniIgrac_ShouldThrowAnIllegalArgumentException_WhenBiggerThanMaxIndexIsPassed(){
        initializer();
        assertThrows(IllegalArgumentException.class, () -> {
            igrac1.napadniIgraca(igrac1.getOruzja().size(), igrac2);
        });
    }

    @Test
    void napadniIgrac_ShouldReturnStetaEqualTo96_IfIEnergyEqualTo19_WhenStateEqualsToDEFANZIVNO(){
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
    void napadniIgrac_ShouldReturnStetaEqualTo96_IfIEnergyEqualTo20_WhenStateEqualsToDEFANZIVNO(){
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
    void napadniIgrac_ShouldDecreaseEnergyTo0_WhenEnergyEqualTo21(){
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

    @Test // treba da padne jer fali break u case PASIVNO
    void napadniIgrac_ShouldReturnStetaEqualTo127AndHalf_IfIEnergyEqualsTo21AndStrengthLessThanNeed_WhenStateEqualsToPASIVNO(){
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
    void napadniIgrac_ShouldReturnStetaEqualTo153_IfIEnergyEqualsTo21AndStrengthLessThanNeedAnd_WhenStateEqualsToAGRESIVNO(){
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
    void napadniIgrac_ShouldReturnStetaEqualTo153_IfIEnergyEqualsTo21AndStrengthEqualAsNeed_WhenStateEqualsToAGRESIVNO(){
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
    void napadniIgrac_ShouldReturnStetaEqualTo162_IfIEnergyEqualsTo21AndStrengthGreaterThanNeed_WhenStateEqualsToAGRESIVNO(){
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
    void odbraniSe_ShouldThrowAnIllegalArgumentException_WhenGivenArgumentLessThanZero(){
        initializer();
        assertThrows(IllegalArgumentException.class, () -> {
            igrac1.odbraniSe(-1.0);
        });
    }

    @Test // test pada jer se po dokumentaciji ocekuje da je vrednost 0 za dolaznu stetu prihvatljiv argument
    void odbraniSe_ShouldThrowAnArithmeticException_WhenGivenArgumentEqualToZero(){
        initializer();
        assertThrows(ArithmeticException.class, () -> {
            igrac1.odbraniSe(0.0);
        });
    }


    @Test // treba da padne jer su zamenjeni k za AGRESIVNO i DEFANZIVNO
    void odbraniSe_ShouldReturn6Point41_IfTezinaLessThanMaxTezina_WhenStateIsAGRESIVNO(){
        initializer();
        Mockito.when(odecaMock.getTezina()).thenReturn(14.0);
        Mockito.when(odecaMock.getOdbrambenaVrednost()).thenReturn(24.0);
        Mockito.when(odecaMock2.getTezina()).thenReturn(9.0);
        Mockito.when(odecaMock2.getOdbrambenaVrednost()).thenReturn(15.0);

        Mockito.when(oruzjeMock.getTezina()).thenReturn(19.0);
        Mockito.when(oruzjeMock2.getTezina()).thenReturn(20.0);

        igrac1.setStanje(Igrac.Stanje.AGRESIVNO);
        double expected = 6.41;
        double actual = igrac1.odbraniSe(25.0);
        assertEquals(expected, actual, 0.1);

        Mockito.verify(odecaMock).getTezina();
        Mockito.verify(odecaMock).getOdbrambenaVrednost();
        Mockito.verify(odecaMock2).getTezina();
        Mockito.verify(odecaMock2).getOdbrambenaVrednost();
        Mockito.verify(oruzjeMock).getTezina();
        Mockito.verify(oruzjeMock2).getTezina();
    }

    @Test
    void odbraniSe_ShouldReturn3Point2_IfTezinaLessThanMaxTezina_WhenStateIsPASIVNO(){
        initializer();
        Mockito.when(odecaMock.getTezina()).thenReturn(14.0);
        Mockito.when(odecaMock.getOdbrambenaVrednost()).thenReturn(24.0);
        Mockito.when(odecaMock2.getTezina()).thenReturn(9.0);
        Mockito.when(odecaMock2.getOdbrambenaVrednost()).thenReturn(15.0);

        Mockito.when(oruzjeMock.getTezina()).thenReturn(19.0);
        Mockito.when(oruzjeMock2.getTezina()).thenReturn(20.0);

        igrac1.setStanje(Igrac.Stanje.PASIVNO);
        double expected = 3.2;
        double actual = igrac1.odbraniSe(25.0);
        assertEquals(expected, actual, 0.1);

        Mockito.verify(odecaMock).getTezina();
        Mockito.verify(odecaMock).getOdbrambenaVrednost();
        Mockito.verify(odecaMock2).getTezina();
        Mockito.verify(odecaMock2).getOdbrambenaVrednost();
        Mockito.verify(oruzjeMock).getTezina();
        Mockito.verify(oruzjeMock2).getTezina();
    }

    @Test // treba da padne jer su zamenjeni k za AGRESIVNO i DEFANZIVNO
    void odbraniSe_ShouldReturn2Point13_IfTezinaLessThanMaxTezina_WhenStateIsDEFANZIVNO(){
        initializer();
        Mockito.when(odecaMock.getTezina()).thenReturn(14.0);
        Mockito.when(odecaMock.getOdbrambenaVrednost()).thenReturn(24.0);
        Mockito.when(odecaMock2.getTezina()).thenReturn(9.0);
        Mockito.when(odecaMock2.getOdbrambenaVrednost()).thenReturn(15.0);

        Mockito.when(oruzjeMock.getTezina()).thenReturn(19.0);
        Mockito.when(oruzjeMock2.getTezina()).thenReturn(20.0);

        double expected = 2.13;
        double actual = igrac1.odbraniSe(25.0);
        assertEquals(expected, actual, 0.1);

        Mockito.verify(odecaMock).getTezina();
        Mockito.verify(odecaMock).getOdbrambenaVrednost();
        Mockito.verify(odecaMock2).getTezina();
        Mockito.verify(odecaMock2).getOdbrambenaVrednost();
        Mockito.verify(oruzjeMock).getTezina();
        Mockito.verify(oruzjeMock2).getTezina();
    }

    @Test
    void odbraniSe_ShouldThrowIllegalStateException_IfTezinaLessThanMaxTezinaAndStateIsIllegal(){
        initializer();
        Mockito.when(odecaMock.getTezina()).thenReturn(14.0);
        Mockito.when(odecaMock.getOdbrambenaVrednost()).thenReturn(24.0);
        Mockito.when(odecaMock2.getTezina()).thenReturn(9.0);
        Mockito.when(odecaMock2.getOdbrambenaVrednost()).thenReturn(15.0);

        Mockito.when(oruzjeMock.getTezina()).thenReturn(19.0);
        Mockito.when(oruzjeMock2.getTezina()).thenReturn(20.0);

        igrac1.setStanje(Igrac.Stanje.NEPOSTOJECE);
        assertThrows(IllegalStateException.class, () -> {
            igrac1.odbraniSe(25.0);
        });

        Mockito.verify(odecaMock).getTezina();
        Mockito.verify(odecaMock).getOdbrambenaVrednost();
        Mockito.verify(odecaMock2).getTezina();
        Mockito.verify(odecaMock2).getOdbrambenaVrednost();
        Mockito.verify(oruzjeMock).getTezina();
        Mockito.verify(oruzjeMock2).getTezina();
    }


    @Test
    void odbraniSe_ShouldReturn4Point27_IfTezinaGreaterThanMaxTezina_WhenStateIsDEFANZIVNO(){
        initializer();
        igrac1.setSnaga(20);
        Mockito.when(odecaMock.getTezina()).thenReturn(15.0);
        Mockito.when(odecaMock.getOdbrambenaVrednost()).thenReturn(24.0);
        Mockito.when(odecaMock2.getTezina()).thenReturn(9.0);
        Mockito.when(odecaMock2.getOdbrambenaVrednost()).thenReturn(15.0);

        Mockito.when(oruzjeMock.getTezina()).thenReturn(19.0);
        Mockito.when(oruzjeMock2.getTezina()).thenReturn(20.0);

        double expected = 4.27;
        double actual = igrac1.odbraniSe(25.0);
        assertEquals(expected, actual, 0.1);

        Mockito.verify(odecaMock).getTezina();
        Mockito.verify(odecaMock).getOdbrambenaVrednost();
        Mockito.verify(odecaMock2).getTezina();
        Mockito.verify(odecaMock2).getOdbrambenaVrednost();
        Mockito.verify(oruzjeMock).getTezina();
        Mockito.verify(oruzjeMock2).getTezina();
    }

    @Test
    void odbraniSe_ShouldReturn7Point12_IfTezinaGreaterThanMaxTezina_WhenStateIsPASIVNO(){
        initializer();
        igrac1.setSnaga(20);
        Mockito.when(odecaMock.getTezina()).thenReturn(15.0);
        Mockito.when(odecaMock.getOdbrambenaVrednost()).thenReturn(24.0);
        Mockito.when(odecaMock2.getTezina()).thenReturn(9.0);
        Mockito.when(odecaMock2.getOdbrambenaVrednost()).thenReturn(15.0);

        Mockito.when(oruzjeMock.getTezina()).thenReturn(19.0);
        Mockito.when(oruzjeMock2.getTezina()).thenReturn(20.0);
        igrac1.setStanje(Igrac.Stanje.PASIVNO);
        double expected = 7.12;
        double actual = igrac1.odbraniSe(25.0);
        assertEquals(expected, actual, 0.1);

        Mockito.verify(odecaMock).getTezina();
        Mockito.verify(odecaMock).getOdbrambenaVrednost();
        Mockito.verify(odecaMock2).getTezina();
        Mockito.verify(odecaMock2).getOdbrambenaVrednost();
        Mockito.verify(oruzjeMock).getTezina();
        Mockito.verify(oruzjeMock2).getTezina();
    }

    @Test
    void odbraniSe_ShouldReturn13Point35_IfTezinaGreaterThanMaxTezina_WhenStateIsAGRESIVNO(){
        initializer();
        igrac1.setSnaga(20);
        Mockito.when(odecaMock.getTezina()).thenReturn(15.0);
        Mockito.when(odecaMock.getOdbrambenaVrednost()).thenReturn(24.0);
        Mockito.when(odecaMock2.getTezina()).thenReturn(9.0);
        Mockito.when(odecaMock2.getOdbrambenaVrednost()).thenReturn(15.0);

        Mockito.when(oruzjeMock.getTezina()).thenReturn(19.0);
        Mockito.when(oruzjeMock2.getTezina()).thenReturn(20.0);
        igrac1.setStanje(Igrac.Stanje.AGRESIVNO);
        double expected = 13.35;
        double actual = igrac1.odbraniSe(25.0);
        assertEquals(expected, actual, 0.1);

        Mockito.verify(odecaMock).getTezina();
        Mockito.verify(odecaMock).getOdbrambenaVrednost();
        Mockito.verify(odecaMock2).getTezina();
        Mockito.verify(odecaMock2).getOdbrambenaVrednost();
        Mockito.verify(oruzjeMock).getTezina();
        Mockito.verify(oruzjeMock2).getTezina();
    }


    @Test
    void odbraniSe_ShouldThrowIllegalStateException_IfTezinaGreaterThanMaxTezinaAndStateIsIllegal(){
        initializer();
        igrac1.setSnaga(20);
        Mockito.when(odecaMock.getTezina()).thenReturn(15.0);
        Mockito.when(odecaMock.getOdbrambenaVrednost()).thenReturn(24.0);
        Mockito.when(odecaMock2.getTezina()).thenReturn(9.0);
        Mockito.when(odecaMock2.getOdbrambenaVrednost()).thenReturn(15.0);

        Mockito.when(oruzjeMock.getTezina()).thenReturn(19.0);
        Mockito.when(oruzjeMock2.getTezina()).thenReturn(20.0);

        igrac1.setStanje(Igrac.Stanje.NEPOSTOJECE);
        assertThrows(IllegalStateException.class, () -> {
            igrac1.odbraniSe(25.0);
        });

        Mockito.verify(odecaMock).getTezina();
        Mockito.verify(odecaMock).getOdbrambenaVrednost();
        Mockito.verify(odecaMock2).getTezina();
        Mockito.verify(odecaMock2).getOdbrambenaVrednost();
        Mockito.verify(oruzjeMock).getTezina();
        Mockito.verify(oruzjeMock2).getTezina();
    }


    // TESTOVI ZA 9. METOD -> upotrebiMagiju()

    @Test // test pada jer nije obradjen izuzetak
    void upotrebiMagiju_ShouldThrowAnIllegalArgumentException_WhenNegativeIndexIsPassed(){
        initializer();
        assertThrows(IllegalArgumentException.class, () -> {
            igrac1.upotrebiMagiju(-1, igrac2);
        });
    }

    @Test // test pada jer nije obradjen izuzetak
    void upotrebiMagiju_ShouldThrowAnIllegalArgumentException_WhenBiggerThanMaxIndexIsPassed(){
        initializer();
        assertThrows(IllegalArgumentException.class, () -> {
            igrac1.upotrebiMagiju(igrac1.getMagije().size(), igrac2);
        });
    }

    @Test
    void upotrebiMagiju_ShouldDecreaseZdravljeFor10Percent_IfInteligencijaLessThanNeed(){
        initializer();
        Mockito.when(magijaMock.getSteta()).thenReturn(15.0);
        Mockito.when(magijaMock.getPotrebnaInteligencija()).thenReturn(65.0);
        Mockito.when(magijaMock.getPotrebnaEnergija()).thenReturn(55.0);

        igrac1.setInteligencija(55);
        igrac1.upotrebiMagiju(0, igrac2);
        double expected = 40.95;
        double actual = igrac1.getZdravlje();
        assertEquals(expected, actual, 0.01);

        Mockito.verify(magijaMock).getSteta();
        Mockito.verify(magijaMock, Mockito.atMost(2)).getPotrebnaInteligencija();
        Mockito.verify(magijaMock, Mockito.atMost(2)).getPotrebnaEnergija();
    }

    @Test
    void upotrebiMagiju_ShouldSetEnergijaToZero_IfInteligencijaLessThanNeed(){
        initializer();
        Mockito.when(magijaMock.getSteta()).thenReturn(15.0);
        Mockito.when(magijaMock.getPotrebnaInteligencija()).thenReturn(65.0);
        Mockito.when(magijaMock.getPotrebnaEnergija()).thenReturn(55.0);

        igrac1.setInteligencija(55);
        igrac1.upotrebiMagiju(0, igrac2);
        double expected = 0.0;
        double actual = igrac1.getEnergija();
        assertEquals(expected, actual, 0.01);

        Mockito.verify(magijaMock).getSteta();
        Mockito.verify(magijaMock, Mockito.atMost(2)).getPotrebnaInteligencija();
        Mockito.verify(magijaMock, Mockito.atMost(2)).getPotrebnaEnergija();
    }

    @Test
    void upotrebiMagiju_ShouldReturnDamageEqualToZero_IfInteligencijaLessThanNeedAndEnergijaLessThanNeedAndZdravljelessThanDifference(){
        initializer();
        Mockito.when(magijaMock.getSteta()).thenReturn(15.0);
        Mockito.when(magijaMock.getPotrebnaInteligencija()).thenReturn(65.0);
        Mockito.when(magijaMock.getPotrebnaEnergija()).thenReturn(55.0);
        igrac1.setInteligencija(55);
        double expected = 0.0;
        double actual = igrac1.upotrebiMagiju(0, igrac2);
        assertEquals(expected, actual, 0.01);

        Mockito.verify(magijaMock).getSteta();
        Mockito.verify(magijaMock, Mockito.atMost(2)).getPotrebnaInteligencija();
        Mockito.verify(magijaMock, Mockito.atMost(2)).getPotrebnaEnergija();
    }

    @Test
    void upotrebiMagiju_ShouldReturnDamageEqualTo7Point5_IfInteligencijaLessThanNeedAndEnergijaLessThanNeedAndZdravljeGreaterThanDifference(){
        initializer();
        Mockito.when(magijaMock.getSteta()).thenReturn(15.0);
        Mockito.when(magijaMock.getPotrebnaInteligencija()).thenReturn(65.0);
        Mockito.when(magijaMock.getPotrebnaEnergija()).thenReturn(35.0);
        igrac1.setInteligencija(55);
        double expected = 7.5;
        double actual = igrac1.upotrebiMagiju(0, igrac2);
        assertEquals(expected, actual, 0.1);

        Mockito.verify(magijaMock).getSteta();
        Mockito.verify(magijaMock, Mockito.atMost(2)).getPotrebnaInteligencija();
        Mockito.verify(magijaMock, Mockito.atMost(2)).getPotrebnaEnergija();
    }


    @Test // ovaj test pada jer energija nije setovana na 0 izvan if-else unutrasnjeg bloka za proveru zdravlja sa razlikom
    void upotrebiMagiju_ShouldSetEnergijaToZero_IfInteligencijaGreaterThanNeedAndEnergijaLessThanNeedAndZdravljelessThanDifference(){
        initializer();
        Mockito.when(magijaMock.getSteta()).thenReturn(15.0);
        Mockito.when(magijaMock.getPotrebnaInteligencija()).thenReturn(65.0);
        Mockito.when(magijaMock.getPotrebnaEnergija()).thenReturn(85.0);

        igrac1.upotrebiMagiju(0, igrac2);
        double expected = 0.0;
        double actual = igrac1.getEnergija();
        assertEquals(expected, actual, 0.01);

        Mockito.verify(magijaMock).getSteta();
        Mockito.verify(magijaMock, Mockito.atMost(2)).getPotrebnaInteligencija();
        Mockito.verify(magijaMock, Mockito.atMost(2)).getPotrebnaEnergija();
    }

    @Test
    void upotrebiMagiju_ShouldDecreaseZdravljeByDifferenceTo39Point5_IfInteligencijaGreaterThanNeedAndEnergijaLessThanNeedAndZdravljeGreaterThanDifference(){
        initializer();
        Mockito.when(magijaMock.getSteta()).thenReturn(15.0);
        Mockito.when(magijaMock.getPotrebnaInteligencija()).thenReturn(65.0);
        Mockito.when(magijaMock.getPotrebnaEnergija()).thenReturn(25.0);
        igrac1.upotrebiMagiju(0, igrac2);
        double expected = 39.5;
        double actual = igrac1.getZdravlje();
        assertEquals(expected, actual, 0.1);

        Mockito.verify(magijaMock).getSteta();
        Mockito.verify(magijaMock, Mockito.atMost(2)).getPotrebnaInteligencija();
        Mockito.verify(magijaMock, Mockito.atMost(2)).getPotrebnaEnergija();
    }

    @Test // ovaj test pada jer ne postoji else slucaj kada je energija veca od potrebne
    void upotrebiMagiju_ShouldDecreaseEnergyByNeededEnergy_IfInteligencijaGreaterThanNeedAndEnergijaGreaterThanNeed(){
        initializer();
        Mockito.when(magijaMock.getSteta()).thenReturn(15.0);
        Mockito.when(magijaMock.getPotrebnaInteligencija()).thenReturn(65.0);
        Mockito.when(magijaMock.getPotrebnaEnergija()).thenReturn(25.0);
        igrac1.setEnergija(30.0);
        igrac1.upotrebiMagiju(0, igrac2);
        double expected = 5.0;
        double actual = igrac1.getEnergija();
        assertEquals(expected, actual, 0.1);

        Mockito.verify(magijaMock).getSteta();
        Mockito.verify(magijaMock, Mockito.atMost(2)).getPotrebnaInteligencija();
        Mockito.verify(magijaMock, Mockito.atMost(2)).getPotrebnaEnergija();
    }

    // // TESTOVI ZA 10. METOD -> odmoriSe()

    @Test
    void odmoriSe_ShouldReturnZero_IfEnergyGreaterThan75(){
        initializer();
        igrac1.setEnergija(80.0);
        double expected = 0.0;
        double actual = igrac1.odmoriSe();
        assertEquals(expected, actual, 0.01);

    }

    @Test
    void odmoriSe_ShouldReturn49_IfEnergyGreaterThan50(){
        initializer();
        igrac1.setEnergija(51.0);
        double expected = 49.0;
        double actual = igrac1.odmoriSe();
        assertEquals(expected, actual, 0.01);

    }

    @Test
    void odmoriSe_ShouldReturn40_IfEnergyGreaterThan50(){
        initializer();
        igrac1.setEnergija(60.0);
        double expected = 40.0;
        double actual = igrac1.odmoriSe();
        assertEquals(expected, actual, 0.01);

    }

    @Test
    void odmoriSe_ShouldReturn50_IfEnergyEqualTo50(){
        initializer();
        igrac1.setEnergija(50.0);
        double expected = 50.0;
        double actual = igrac1.odmoriSe();
        assertEquals(expected, actual, 0.01);

    }

    @Test // ima bug u uslovu za proveru da li je energija + 50 > 100, jer umesto 50 stoji 500
    void odmoriSe_ShouldReturn50_IfEnergyLessThan50(){
        initializer();
        igrac1.setEnergija(40.0);
        double expected = 50.0;
        double actual = igrac1.odmoriSe();
        assertEquals(expected, actual, 0.01);

    }
}