package 交大慧谷.day09.j04System对IO的支持;

public class Test {
    public static void main(String[] args){
        System.out.println(12345);
        System.err.println(2345678);

        try{
            Integer.parseInt("fghjbg");
        }catch(Exception e){
            System.err.println("格式不正确，无法转换");
        }
    }
}
