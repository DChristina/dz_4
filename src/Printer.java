public class Printer {
    int a = 45;
    public String printParams (){
        String formatingData = String.format("\"---<%d>---\"", a);
        System.out.println(formatingData);
        return formatingData;
    }
}