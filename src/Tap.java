
public class Tap extends Ansat {
		private int arbejdstid;
		
		public Tap(String navn, String institut, int arbejdstid){
			super(navn, institut);
			this.arbejdstid = arbejdstid;
		}

		
		public String toString() {
			return super.toString() + "\n\tArbejdstid: " + arbejdstid;
		}
		

}
