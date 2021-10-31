package ru.job4j.servlets;

import ru.job4j.dream.store.DbStore;
import ru.job4j.dream.store.PsqlStore;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class DeleteServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String id = req.getParameter("id");
        DbStore.instOf().removeCandidate(Integer.parseInt(id));
        for (File file : Objects.requireNonNull(new File("c:\\images\\").listFiles())) {
            String name = file.getName();
            name = name.substring(0, name.indexOf("."));
            if (name.equals(id)) {
                file.delete();
                break;
            }
        }
        resp.sendRedirect(req.getContextPath() + "/candidates.do");
    }
}
