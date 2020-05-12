package cn.lyc.apiserver.controller;

import cn.lyc.apiserver.dao.AuthInfoUserDao;
import cn.lyc.apiserver.entity.AuthInfoUserEntity;
import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@RestController
@RequestMapping("/api")
public class ApiController {

    @Autowired
    private AuthInfoUserDao authInfoUserDao;

    @RequestMapping("/getUser")
    public Map<String, Object> getUser(HttpServletRequest request){

        System.out.println("*************接收到param参数:");
        Map<String, String[]> parameterMap = request.getParameterMap();
        parameterMap.keySet().forEach(key -> {
            System.out.println(key + " = " + Arrays.toString(parameterMap.get(key)));
        });

        System.out.println("*************接收到header参数:");
        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String key = headerNames.nextElement();
            String value = request.getHeader(key);
            System.out.println(key + " = " + value);
        }

        List<AuthInfoUserEntity> list = authInfoUserDao.selectList(new QueryWrapper<AuthInfoUserEntity>());
        Map<String, Object> result = new HashMap<>();
        result.put("code", HttpStatus.OK.value());
        result.put("msg", "success!");
        result.put("data", list);
        return result;
    }

    @RequestMapping("/getUser2")
    public Map<String, Object> getUser2(HttpServletRequest request, @RequestBody Map<String, Object> param){

        System.out.println("*************接收到param参数:");
        Map<String, String[]> parameterMap = request.getParameterMap();
        parameterMap.keySet().forEach(key -> {
            System.out.println(key + " = " + Arrays.toString(parameterMap.get(key)));
        });

        System.out.println("*************接收到header参数:");
        Enumeration<String> headerNames = request.getHeaderNames();
        while(headerNames.hasMoreElements()){
            String key = headerNames.nextElement();
            String value = request.getHeader(key);
            System.out.println(key + " = " + value);
        }

        System.out.println("*************接收到json参数:");
        System.out.println(JSON.toJSONString(param));

        List<AuthInfoUserEntity> list = authInfoUserDao.selectList(new QueryWrapper<AuthInfoUserEntity>());
        Map<String, Object> result = new HashMap<>();
        result.put("code", HttpStatus.OK.value());
        result.put("msg", "success!");
        result.put("data", list);
        return result;
    }
}
