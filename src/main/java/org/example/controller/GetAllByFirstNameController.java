package org.example.controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.xml.ws.WebServiceRef;
import org.example.model.Staff;
import org.example.service.StaffService;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

@WebServlet("/getAllStaffByFirstName")
public class GetAllByFirstNameController extends HttpServlet {
    @WebServiceRef
    private StaffService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String firstName = req.getParameter("str");
        List<Staff> all = service.getAllByFirstName(firstName);
        if(Objects.nonNull(all)) {
            resp.getWriter().write(all.toString());
        } else {
            resp.getWriter().write("List is empty");
        }
    }
}