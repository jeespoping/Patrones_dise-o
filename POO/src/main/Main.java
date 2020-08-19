
package main;

public class Main {
    public static void main(String[] args) {
        //Instancia = crear un objeto
        
        Jaguar yagua = new Jaguar(10, 120f);
        
        System.out.println(yagua);
        
        yagua.comer();
        yagua.dormir();
        
        yagua.maullar();
    }
}
