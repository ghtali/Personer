
public class Vip extends Ansat{
	private int[] kurser;

	public Vip(String navn, String institut, int[] kurser){
		super(navn, institut);

		this.kurser = new int[kurser.length];
		for (int i=0; i< kurser.length; i++){
			this.kurser[i] = kurser[i];	
		}


	    private String kurserAsString(){
	        String res="";
	        for (int i=0; i < kurser.length; i++){
	        	if(i!=0)
	        		res += " ";
	        	res += kurser[i];
	        }
	        return res;
	    }

//		public int[] getKurser() {
//			return kurser;
//		}
//
//		public void setKurser(int[] kurser) {
//			this.kurser = kurser;
//		}
		
		public String toString()
		{
			return super.toString()+"\n\t[kursus="+kurser+"]"; //For alle kurser!
		}

	}


}