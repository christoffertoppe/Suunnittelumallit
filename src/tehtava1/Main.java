package tehtava1;

public class Main {

    public static void main(String[] args) {
        AterioivaOtus opettaja = new Opettaja();
        AterioivaOtus rehtori = new Rehtori();
        AterioivaOtus oppilas = new Oppilas();
        opettaja.aterioi();
        oppilas.aterioi();
        rehtori.aterioi();
    }
    
}
