/* 114   Peter
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.first.filter;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

/**
 *
 * @author INT303
 */
public class AuthenticationFilter implements Filter {

    private FilterConfig config; 
/*FilterConfig config ทำให้เราใช้พวกนี้ได้
    public String getFilterName();

    public ServletContext getServletContext();

    public String getInitParameter(String name);

    public Enumeration<String> getInitParameterNames();
*/

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        this.config = filterConfig;
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        HttpSession session = ((HttpServletRequest) request).getSession(false);// get flase เพ่อดูว่าlogin ยัง  

        if (session == null || session.getAttribute("user") == null) {

            config.getServletContext().getRequestDispatcher("/Login").forward(request, response);
            return;
        } else {
            chain.doFilter(request, response);//ปล่อยให้ผ่านFillterไป
        }

    }

    @Override
    public void destroy() {

    }

}
