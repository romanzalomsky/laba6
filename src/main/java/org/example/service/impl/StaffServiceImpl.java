package org.example.service.impl;

import org.example.model.Staff;
import org.example.repository.StaffRepository;
import org.example.service.StaffService;
import jakarta.jws.WebService;

import java.util.List;

@WebService(endpointInterface = "org.example.service.StaffService")
public class StaffServiceImpl implements StaffService {

    private final StaffRepository staffRepository;

    public StaffServiceImpl() {
        this.staffRepository = new StaffRepository();
    }

    @Override
    public List<Staff> getAll() {
        return staffRepository.getAll();
    }

    @Override
    public List<Staff> getAllByCurrentPosition(String currentPosition) {
        return staffRepository.getAllByCurrentPosition(currentPosition);
    }

    @Override
    public List<Staff> getAllByLastName(String lastName) {
        return staffRepository.getAllByLastName(lastName);
    }

    @Override
    public List<Staff> getAllByFirstName(String firstName) {
        return staffRepository.getAllByFirstName(firstName);
    }

    @Override
    public List<Staff> getAllByMiddleName(String middleName) {
        return staffRepository.getAllByMiddleName(middleName);
    }
}
