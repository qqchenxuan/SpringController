package com.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

@Controller
public class TestController {

    @RequestMapping("test,do",method=RequetMethod.POST)
    public ModelAndView testCtl(HttpServletRequest httpServletRequest,HttpServletResponse httpServletResponse){
        String key= httpServletRequest.getParamter("key");
        System.out.println("testCtl"+key);

        ModelAndView modelAndView=new ModelAndView();
        modelAndView.setViewName("index.jsp");

        Map<String,String> map=new HashMap<String,String>();
        modelAndView.addObject(map);

        httpServletResponse.setContentType("application/json;char-set=utf-8");
        httpServletResponse.setCharacterEncoding("utf-8");

        PrintWriter printWriter= httpServletResponse.getWriter();

        String result={"result":"success","code":"0000"};

        printWriter.write("success!");


        return ModelAndView;
    }
}
