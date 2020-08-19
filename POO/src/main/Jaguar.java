package main;

public class Jaguar extends Animal implements IFelinoSalvaje{
    private int edad;
    private float peso;

    public Jaguar() {
        this.setEdad(0);
        this.setPeso(0.0f);
    }

    public Jaguar(int edad) {
        this.edad = edad;
        this.setPeso(0.0f);
    }

    public Jaguar(float peso) {
        this.peso = peso;
        this.setEdad(0);
    }

    public Jaguar(int edad, float peso) {
        this.edad = edad;
        this.peso = peso;
    }
    
    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    
    
    @Override
    public void comer(){
        System.out.println("El jaguar come!");
    }
    
    @Override
    public void dormir(){
        System.out.println("El jaguar duerme!");
    }
    
    @Override
    public String toString(){
        return "Mi edad es "+ this.getEdad()+" mi peso es "+this.getPeso();
    }

    @Override
    public void rugir() {
        System.out.println("El jaguar ruge!");
    }

    @Override
    public void cazar() {
        System.out.println("El jaguar caza!");
    }

    @Override
    public void maullar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
