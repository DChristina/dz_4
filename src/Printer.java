public class Printer {
    int a = 45;
    public int printParams (){
        String formatingData = String.format("\"---<%d>---\"", a);
        System.out.println(formatingData);
        return a;
    }
}