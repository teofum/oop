public class E2 {
    public static void main(String[] args) {

    }

    public static void test1() {
        double numero1;
        Double numero2;
        // Uso de variables sin incializar
//        double resultado = numero1 + numero2;
    }

    public static void test2() {
        String a = "hola";
        // Asignación de tipo incorrecto
//        a = 32;
        System.out.println("El valor de a es: " + a);

    }

    public static void test3() {
        int a;
        // Uso de var. sin inicializar
//        int b = a + 5;
    }

    public static void test4() {
        Double a = 1.3;
        // Asignación de double a Float
//        Float b = 1.3;
        Float b = 1.3f;
    }

    public static void test5() {
        int a = 1;
        // a no es de tipo boolean
//        if (a) {
//            System.out.println(",.");
//        }
    }

    public static void test6() {
        long x = 3;
        long y = 2;
        int rta;
        // Parámetro de tipo int no toma long (downgrade)
//        rta = sumar(x, y);
//        System.out.println(rta);
    }

    private static int sumar(int a, int b) {
        return a + b;
    }

    public static void test7() {
        if (3 > 2) {
            // Uso de break fuera de un loop/switch
//            break;
        }
    }
}
