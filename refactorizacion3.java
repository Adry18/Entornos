public class refactorizacion3 {

    public void method() {

        int a = 1;

        int b = 2;

        int c = extracted(a, b);

        int d = extracted(a, c);

    }

    private int extracted(int a, int b) {
        return a + b;
    }

}
