package org.example.controller;

import org.example.model.Staff;
import org.example.service.StaffService;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.xml.ws.WebServiceRef;

import java.io.IOException;
import java.util.List;
import java.util.Objects;

@WebServlet("/getAllStaff")
public class GetAllStaffController extends HttpServlet {
    @WebServiceRef
    private StaffService service;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Staff> all = service.getAll();
        if(Objects.nonNull(all)) {
            resp.getWriter().write(all.toString());
        } else {
            resp.getWriter().write("List is empty");
        }
    }
}
