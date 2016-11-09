
public class Vip extends Ansat {
	private int[] kurser;
	
	public Vip(String navn, String institut, int[] kurser){
		super(navn, institut);
		
		this.kurser = new int[kurser.length];
		for (int i=0; i< kurser.length; i++){
			this.kurser[i] = kurser[i];
			
		}
		
	}
	

	

}
