
public class Tap extends Ansat {
		private int arbejdstid;
		
		public Tap(String navn, String institut, int arbejdstid){
			super(navn, institut);
			this.arbejdstid = arbejdstid;
		}

		
		public String toString() {
			return "class Tap\n\t[navn="+navn+"]"+"\n\t"+"[institutnavn="+super.getInstitut()+"]"+"\n\t"+"["+"arbejdstid=" + arbejdstid+"]";
		}
		

}
