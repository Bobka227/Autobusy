
package mainautobus;


public class MainAutobus {

    
    public static void main(String[] args) {
        Statistika st1 = new Statistika();
        
        
        Cas c1 = new Cas(12,45);
        Cas cd1 = new Cas(13,35);

        Cas c2 = new Cas(7,15);
        Cas cd2 = new Cas(8,01); 
        
        Cas c3 = new Cas(15,30);
        Cas cd3 = new Cas(16,15);
        
        Spoj v1 = new Spoj("A3",c1,cd1);
        Spoj v2 = new Spoj("A5",c2,cd2);
        
        st1.pridejSpoj(v1);
        st1.pridejSpoj(v2);
        
        st1.vypisSpoje();
        
        
        System.out.println(" ");
        st1.nejrychlejsiSpoj();
        System.out.println("nerychlejsi je: "  + " " + st1.nejrychlejsiSpoj());
        
        System.out.println(" ");
        
        
        
        st1.nactoioubor("busy.csv");
    }
    
}
