package tehtava1;
public abstract class AterioivaOtus {

    Juoma juoma = null;

    public abstract Juoma createJuoma();


    public void aterioi(){
        sy�();
        juo();
    }

    public void sy�(){
        System.out.println("Kyll�p� ruoka maistuukin hyv�lt�");
    }


    public void juo(){
        if (juoma == null)
            juoma = createJuoma();
        System.out.println("Aterian j�lkeen " + juoma + " tekee ter��");
    }
}
