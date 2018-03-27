import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.web.util.WebAppRootListener;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;

public class WebAppRootContext  implements ServletContextInitializer{

    @Override
    public void onStartup(ServletContext servletContext) throws ServletException {
        servletContext.addListener(WebAppRootListener.class);
    }
}
