package springboot.elk.logback.web.conf;

import org.springframework.stereotype.Component;
import springboot.elk.logback.web.logbackExt.utils.LogTraceContext;

import javax.servlet.*;
import java.io.IOException;

/**
 * Created by zd.yao on 2017/5/24.
 */
@Component
public class ContextFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //实现日志追踪上下文-初始化
        LogTraceContext.init();
        filterChain.doFilter(servletRequest, servletResponse);
    }

    @Override
    public void destroy() {

    }
}
