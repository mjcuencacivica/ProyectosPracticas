public class Perro extends Animal{
    @Override
    void sonido(){ System.out.println("Guau!"); }
    @Override
    public void comer() {
        System.out.println("El perro está comiendo carne.");
    }
}
