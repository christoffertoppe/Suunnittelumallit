package tehtava18;

public class Kello implements Cloneable{
	int vuosi,kuukausi;
	
	Viisarit viisarit = new Viisarit();
	
	public Object clone() throws CloneNotSupportedException 
    {
		Kello t = (Kello)super.clone(); 

		t.viisarit  = new Viisarit(); 

		return t; 
    }	 
}
