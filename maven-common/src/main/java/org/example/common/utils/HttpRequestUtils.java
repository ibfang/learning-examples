package org.example.common.utils;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by <a href="https://blog.csdn.net/myme95">翻墙看妹子</a> on 2021/2/4.
 */
public class HttpRequestUtils {
    public static String httpRequest(String apiPath) {
        BufferedReader in = null;
        StringBuffer result = null;
        //调用的api的接口地址
        String apiUrl = apiPath;
        try {
            URL url = new URL(apiPath);
            //打开和url之间的连接
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            connection.setRequestProperty("Charset", "utf-8");
            connection.connect();
            result = new StringBuffer();
            //读取URL的响应
            in = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            String line;
            while ((line = in.readLine()) != null) {
                result.append(line);
            }
            return result.toString(); //返回json字符串
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (in != null) {
                    in.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return null;
    }
}
