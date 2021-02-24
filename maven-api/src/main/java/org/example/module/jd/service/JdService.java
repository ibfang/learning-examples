package org.example.module.jd.service;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import org.example.common.exception.GeneralException;
import org.example.common.io.Output;
import org.example.common.utils.HttpRequestUtils;
import org.example.module.jd.entity.jokeEntity;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 *  @ Service注解用于类上，标记当前类是一个service类，加上该注解会将当前类自动注入到spring容器中，
 *  不需要再在applicationContext.xml文件定义bean了
 * 京东万象免费接口调用案例——service层
 * Created by <a href="https://blog.csdn.net/myme95">翻墙看妹子</a> on 2021/2/4.
 */
@Service
public class JdService {
    /**
     * 京东万象接口密钥。自行申请
     */
    private static String appkey="40ff81de3725b8fbeaxxxxxxxxxxxx";

    public Output getJoke() throws GeneralException {
        //1、数据预处理
        //1.1、得到long类型当前时间
        long l = System.currentTimeMillis();
        //1.2、设置需要的转换日期输出格式。并转换1.1得到的日期
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String time = dateFormat.format(new Date(l));
        //2、将预处理过的请求数据和京东万象接口进行拼接，拼出完整的地址
        StringBuilder api=new StringBuilder("");
        api.append("https://way.jd.com/showapi/wbxh?time=");
        api.append(time);
        api.append("&page=1&maxResult=20&showapi_sign=bd0592992b4d4050bfc927fe7a4db9f3&appkey=");
        api.append(appkey);
        //3、调用接口，获取到数据
        String str = HttpRequestUtils.httpRequest(api.toString());
        //4、将获取到的数据转换为JSONObject格式
        JSONObject jsonObject = JSON.parseObject(str);
        //5、判断code是否有数据，如果没有，或者code！=10000，说明此次获取的数据有问题
        String code = jsonObject.getString("code");
        if ("10000"!=code) {
            //5.1、抛出自定义异常，并将京东万象给的错误说明抛出来
            throw new GeneralException("数据获取有误！"+"错误代码："+code+","+jsonObject.getString("msg"));
        }
        //6、无异常的情况则拆解json，取出我们需要的数据
        JSONObject resultJsonObject = jsonObject.getJSONObject("result");
        JSONObject bodyJsonObject = resultJsonObject.getJSONObject("showapi_res_body");
        JSONArray contentListArray = bodyJsonObject.getJSONArray("contentlist");
        //7、用我们事先写好的实体类接收拆解后的数据
        List<jokeEntity> jokeEntityList = JSONArray.parseArray(contentListArray.toJSONString(),jokeEntity.class);
        //8、返回数据
        return new Output(jokeEntityList);
    }

}
