package tehtava12;

import java.util.ArrayList;
import java.util.List;

public class ProxyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Image> kuvat = new ArrayList<Image>();
        Image image1 = new ProxyImage("HiRes_10MB_Photo1");
        Image image2 = new ProxyImage("HiRes_10MB_Photo2");

        kuvat.add(image1);
        kuvat.add(image2);
        
       for(Image kuva: kuvat) {
    	   kuva.showData();
       }

       System.out.println();
       
       for(Image kuva: kuvat) {
    	   kuva.displayImage();
       }
	}

}
