
public class Vip extends Ansat{
	private String[] kurser;

	public Vip(String navn, String institut, String[] kurser){
		super(navn, institut);

		if(!(kurser.length>4))
			this.kurser=kurser;	
	}
	
	public String kurserAsString(){
		StringBuilder builder = new  StringBuilder();
		for(int i=0; i < kurser.length;i++ ){
			builder.append("[kursus=").append("").append(kurser[i]).append("]\t");
		}
		return builder.toString();
	}
		public String[] getKurser() {
			return kurser;
		}

		public void setKurser(String[] kurser) {
			this.kurser = kurser;
		}
		
		public String toString()
		{
//			return super.toString()+"class Vip\n\t[kursus="+kurserAsString()+"]"; //For alle kurser!
			return "class Vip\n\t[navn="+navn+"]"+"\n\t"+"[institutnavn="+super.getInstitut()+"]"+"\n\t"+kurserAsString();
		}

	


}