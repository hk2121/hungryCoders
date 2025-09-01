package regexJcaOthers;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class InitExampleServlet extends HttpServlet {
    private Connection connection;

    @Override
    public void init(ServletConfig config) throws ServletException {
        super.init(config);
        String dbUrl = config.getInitParameter("dbUrl");
        String user = config.getInitParameter("user");
        String password = config.getInitParameter("password");

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection(dbUrl, user, password);
            System.out.println("Database connection initialized.");
        } catch (ClassNotFoundException | SQLException e) {
            throw new ServletException("Database connection initialization failed.", e);
        }
    }
}
