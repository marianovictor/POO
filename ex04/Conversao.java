package ex04;

public class Conversao {
    public  static void main(String[] args){
        int num = 858500;
        String bin = "";
    
        while (num>0) {
        bin = ((num % 2 == 0)?"0":"1" ) + bin;
        num /=2;
        }

        System.out.println(bin);
    }
}
