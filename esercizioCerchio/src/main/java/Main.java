public class Main {
    public static void main(String[] args){
        Cerchio c1 = new Cerchio();
        Cerchio c2 = new Cerchio(3.14);

        System.out.println(c1.getArea());
        System.out.println(c2.getArea());
        System.out.println(c1.getCirconferenza());
        System.out.println(c2.getCirconferenza());

        c1.setRaggio(2.18);
        System.out.println(c1.getArea());
        System.out.println(c1.getCirconferenza());

        System.out.println(c1.getRaggio());
    }
}
