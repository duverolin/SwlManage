package com.duverolin.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebFilter(urlPatterns = "/api/*")
public class CORSFilter implements Filter {
    @Override
    public void destroy() {
        System.out.println("过滤器销毁了");
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        HttpServletResponse resp = (HttpServletResponse) response;
        //解决跨域 允许跨域访问的域，可以是一个域的列表，也可以是通配符”*”；
        resp.addHeader("Access-Control-Allow-Origin", "*");
        //允许使用的请求方法，以逗号隔开；
        resp.addHeader("Access-Control-Allow-Methods", "POST");
        //是否允许请求带有验证信息，XMLHttpRequest请求的withCredentials标志设置为true时，认证通过，浏览器才将数据给脚本程序。
        resp.addHeader("Access-Control-Allow-Credentials", "false");
        // 缓存此次请求的秒数。在这个时间范围内，所有同类型的请求都将不再发送预检请求而是直接使用此次返回的头作为判断依据，非常有用，大幅优化请求次数；
        resp.addHeader("Access-Control-Max-Age", "1800000");
        chain.doFilter(request, response);
    }

    @Override
    public void init(FilterConfig arg0) {
        System.out.println("过滤器被初始化了");
    }

}
