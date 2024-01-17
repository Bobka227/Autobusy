
package mainautobus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


public class Statistika {
    String jmeno;
     private ArrayList<Spoj> spoje;

    public Statistika() {
        this.spoje = new ArrayList<>();
    }
     
     public void pridejSpoj(Spoj spoj){
         spoje.add(spoj);
         
     }
     
     public void vypisSpoje(){
         for(Spoj sp : spoje){
             System.out.println(sp);
         }
     }
     
     public Spoj nejrychlejsiSpoj(){
         Spoj rychly = spoje.get(0);
         
         for(Spoj spojka : spoje){
             if(spojka.CasJizdyMinuty() < rychly.CasJizdyMinuty()){
                 
                 rychly = spojka;
             }
             
         }
        return rychly;
     }
     
     public void vypisSpojeOdCasu(Cas cas){
         for(Spoj spojk : spoje){
             
             
             if(spojk.getCasvyezdu().PrevedNaminuty()>= cas.PrevedNaminuty()){
                 System.out.println(spojk);
             }
         }
         
         
     }
     
     
     public void nactoioubor( String soubor){
         try(BufferedReader reader = new BufferedReader(new FileReader(soubor)) ){
            
             String line;
             
             while( (line = reader.readLine()) != null){
                 
                 System.out.println(line);
             }
             
         }catch(IOException e){
             e.printStackTrace();
         }
         
         
     }
     
     
     
     
    
}
