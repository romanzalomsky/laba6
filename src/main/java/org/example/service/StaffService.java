package org.example.service;

import org.example.model.Staff;
import jakarta.jws.WebService;

import java.util.List;

@WebService
public interface StaffService {
    List<Staff> getAll();
    List<Staff> getAllByCurrentPosition(String currentPosition);
    List<Staff> getAllByLastName(String lastName);
    List<Staff> getAllByFirstName(String firstName);
    List<Staff> getAllByMiddleName(String middleName);
}
