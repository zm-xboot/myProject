package 网易云课堂.j25StringBuffer的使用;

public class Test03 {
    public static void main(String[] args){
        //  "12345678" ->12,345,678 从后数往前每3位插入一个,逗号
        String str = "1234567867890009876540";
        StringBuffer sb = new StringBuffer(str);
        for(int i = str.length()-3; i>0 ; i=i-3){
            sb.insert(i, ",");
        }
        System.out.println(sb.toString());
    }
}
