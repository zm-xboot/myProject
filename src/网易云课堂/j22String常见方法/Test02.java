package 网易云课堂.j22String常见方法;

public class Test02 {
    //验证邮箱是否合法   15651655789@qq.com   165789978.com
    public static boolean isValidateEmail(String email){
        //合法情况
        if(email.indexOf("@")!=-1&&email.indexOf(".")!=-1&& email.indexOf("@")<email.indexOf(".")){
            return true;
        }
        return false;
    }
    // 校验电话是否合法
    public static void isValidateTelephone(String phone){
        if(phone.indexOf("-")!=-1){
            System.out.println("座机号码");
            int start = 0;
            int end = phone.indexOf("-");
            String zone = phone.substring(start, end);
            String num = phone.substring(end+1);
            if((zone.length()==3||zone.length()==4)&&num.length()==8){
                System.out.println("座机号码正确");
            }else{
                System.out.println("座机号码错误");
            }
        }else{
            System.out.println("手机号码");
            String first = phone.substring(0,1);
            if(first.equals("1")&&phone.length()==11){
                System.out.println("手机号码正确");
            }else{
                System.out.println("手机号码错误");
            }
        }
    }

    public static void testSplit(){
        String phone = "029-12345-5678";
        String[] ps = phone.split("-");
        for(String p : ps){
            System.out.println(p);
        }
    }

    public static void main(String[] args){
//        boolean result = isValidateEmail("15651655789@qq.com");
//        System.out.println(result==true?"合法":"不合法");
//        testSplit();
        isValidateTelephone("134567656789");
    }
}
