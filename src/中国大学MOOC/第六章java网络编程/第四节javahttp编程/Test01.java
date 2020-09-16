package 中国大学MOOC.第六章java网络编程.第四节javahttp编程;

import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;

//视频地址：https://www.icourse163.org/learn/ECNU-1003718005?tid=1003949006#/learn/content?type=detail&id=1210475597&cid=1212573132
public class Test01 {
    public static void main(String[] args)  {
        String urlName = "https://www.baidu.com/";
        try {
            URL url = new URL(urlName);
            URLConnection connection = url.openConnection();
            connection.connect();

            //打印http的头部信息
            Map<String, List<String>> headers = connection.getHeaderFields();
            for(Map.Entry<String, List<String>> entry : headers.entrySet()){
                String key = entry.getKey();
                for(String value : entry.getValue()){
                    System.out.println(key+":"+value);
                }
            }
        }catch(Exception e){
            e.printStackTrace();
        }

    }
}
