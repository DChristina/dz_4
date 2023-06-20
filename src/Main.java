public class Main {
    public static void main(String[]args){
        Printer print = new Printer();
        String resultData = String.format("\"~~~<%d>~~~\"", print.printParams());
        System.out.println(resultData);
    }
}