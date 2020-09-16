package 网易云课堂.j16数组经典习题;

public class Test14 {
    public static void main(String[] args){
        // while  do..while   for
        int[] nusm = new int[]{33,2,4,5,277};
//        for(int i=0;i<nusm.length;i++){
//            System.out.println(nusm[i]);
//        }

        // (foreach)    for(元素类型 变量名：数组/集合/迭代值)  变量值相当于nums[i]
//        for(int x:nusm){
//            System.out.println(x);
//        }

        //数据类型[] 变量名 = new 数据类型[]{...};
        String[] names =new String[]{"dddd","rrr","eeee"};
        for(String name:names){
            System.out.println(name);
        }

        long n = 13; // long=int   小类型赋值给大类型，会自动转换
        //形式上： 数据类型[] 变量名 = new 数据类型[]{...};
        long[] nusms = new long[]{(byte)33,2,4,5,277};  //兼容,long < float   long>byte
        //数组在定义时=左右两侧的类型必须一致，但是数据值只需要兼容（类型本身或范围比其小的类型）即可。
    }
}
