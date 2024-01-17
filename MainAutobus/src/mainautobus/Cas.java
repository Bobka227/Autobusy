
package mainautobus;


public class Cas {
    private int hodina;
    private int minuty;

    public Cas(int hodina, int minuty) {
        this.hodina = hodina;
        this.minuty = minuty;
    }
    public int PrevedNaminuty(){
        
        return hodina * 60 + minuty; 
    }
    
    public int spocitejRozdilMinuty(Cas cas){
        
      int rozdil = this.PrevedNaminuty() - cas.PrevedNaminuty();
              return rozdil >=0 ? rozdil : -rozdil;
        
    }

    @Override
    public String toString() {
        return "Cas{" + "hodina=" + hodina + ", minuty=" + minuty + '}';
    }
    
    
    
    
    
    
    
}
