package com.gathergrid.controller;

import com.gathergrid.service.EventService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "Servlet", value = "", loadOnStartup = 1)
public class Servlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
//        super.init();
        EventService eventService = new EventService();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws  IOException {
        // Set the response content type
        resp.setContentType("text/html");

        // Get the PrintWriter to write the response
        PrintWriter out = resp.getWriter();

        // Write the HTML content to the response
        out.println("<html>");
        out.println("<head><title>Hello, World Servlet</title></head>");
        out.println("<body>");
        out.println("<h1>Hello, World!</h1>");
        out.println("</body>");
        out.println("</html>");

    }
}
