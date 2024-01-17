
package mainautobus;


public class Spoj {
    
    private String id;
    Cas casvyezdu;
    Cas casdojezdu;

    public Spoj(String id, Cas casvyezdu, Cas casdojezdu) {
        this.id = id;
        this.casvyezdu = casvyezdu;
        this.casdojezdu = casdojezdu;
    }

    public String getId() {
        return id;
    }

    public Cas getCasvyezdu() {
        return casvyezdu;
    }

    public Cas getCasdojezdu() {
        return casdojezdu;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCasvyezdu(Cas casvyezdu) {
        this.casvyezdu = casvyezdu;
    }

    public void setCasdojezdu(Cas casdojezdu) {
        this.casdojezdu = casdojezdu;
    }
    
    public int CasJizdyMinuty(){
        
        return casvyezdu.spocitejRozdilMinuty(casdojezdu);
    }
    

    @Override
    public String toString() {
        return "Spoj{" + "id=" + id + ", casvyezdu=" + casvyezdu + ", casdojezdu=" + casdojezdu + '}';
    }
    
    
    
    
        
    
}
