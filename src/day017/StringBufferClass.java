package day017;

public class StringBufferClass {
    public static void main(String[] args) {
        StringBuffer sbf=new StringBuffer();
        sbf.append("Selam");
        sbf.replace(1,2,"a");
        sbf.reverse();
        System.out.println(sbf.toString());
    }
}
