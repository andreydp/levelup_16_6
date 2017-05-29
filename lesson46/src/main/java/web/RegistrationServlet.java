package web;

import core.entity.User;
import core.entity.UserDetails;
import core.entity.UserType;
import core.store.UserCache;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

/**
 * Created by java on 23.05.2017.
 */
@WebServlet("/user/registration")
public class RegistrationServlet extends HttpServlet {
    private final UserCache USER_CACHE = UserCache.getInstance();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("../pages/user/registration.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setHeader("Access-Control-Allow-Origin", "*");

        String login = req.getParameter("login");
        String email = req.getParameter("email");
        String password = req.getParameter("password");
        String confirmationPassword = req.getParameter("password_confirm");
        String userRole = req.getParameter("user-role");
        String lang = req.getParameter("lang");

        User newUser = new User(USER_CACHE.generateId(), login, "", email, UserType.ADMIN, null,
                null, new Date());

//            resp.sendRedirect(String.format("%s%s", req.getContextPath(), "/user/view"));


        System.out.println("login = " + login);
        System.out.println("email = " + email);
        System.out.println("password = " + password);
        System.out.println("confirmationPassword = " + confirmationPassword);
        System.out.println("userRole = " + userRole);
        System.out.println("lang = " + lang);
    }
}