public class refactorizacion2 {

    anotherClass1 anotherClass;
    private int NUMERO = anotherClass1.intValue();

    public void method() {

        int a = 1;

        int b = a + NUMERO;

        int c = b + anotherClass1.intValue();

    }

}
