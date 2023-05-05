/** Implementa (parcialmente) os anéis dos números racionais
 * 
 */
class AnelRacional implements AnelAbstrato<Racional> {
    public Racional soma(Racional x, Racional y) {
        return x.soma(y);
    }
    public static void main(String[] args) {
        AnelRacional Q = new AnelRacional();
        Racional x = new Racional(2,3);
        Racional y = new Racional(4,3);
        Racional z = Q.soma(x,y);
        System.out.println(x + " + " + y + " = " + z);
    }
}