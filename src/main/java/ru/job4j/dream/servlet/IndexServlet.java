package ru.job4j.dream.servlet;

import ru.job4j.dream.store.DbStore;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class IndexServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("lastdayposts", DbStore.instOf().findLastDayPost());
        req.setAttribute("user", req.getSession().getAttribute("user"));
        req.setAttribute("lastdaycandidates", DbStore.instOf().findLastDayCandidate());
        req.setAttribute("cities", DbStore.instOf().findAllCites());
        req.getRequestDispatcher("index.jsp").forward(req, resp);
    }
}
