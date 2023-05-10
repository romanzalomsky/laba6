package org.example.repository;

import org.example.model.Staff;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
public class StaffRepository {
    private static int id;
    private static List<Staff> staffList;

    static {
        staffList = List.of(
                Staff.builder()
                        .id(++id)
                        .firstName("Roman")
                        .middleName("Zalomsky")
                        .lastName("Olegovich")
                        .currentPosition(Staff.CurrentPosition.PM)
                        .build(),
                Staff.builder()
                        .id(++id)
                        .firstName("Max")
                        .middleName("Storm")
                        .lastName("Abuser")
                        .currentPosition(Staff.CurrentPosition.BA)
                        .build(),
                Staff.builder()
                        .id(++id)
                        .firstName("Maxim")
                        .middleName("Alexandrov")
                        .lastName("Betment")
                        .currentPosition(Staff.CurrentPosition.DEVELOPER)
                        .build(),
                Staff.builder()
                        .id(++id)
                        .firstName("Egor")
                        .middleName("Pudge")
                        .lastName("3kMusor")
                        .currentPosition(Staff.CurrentPosition.SECURITY)
                        .build()
/*                Staff.builder()
                        .id(++id)
                        .firstName("Yasha")
                        .middleName("Anime")
                        .lastName("Lover")
                        .currentPosition(Staff.CurrentPosition.SECURITY)
                        .build()*/
        );
    }


    public List<Staff> getAll() {
        return staffList;
    }

    public List<Staff> getAllByFirstName(String firstName) {
        return staffList
                .stream()
                .filter(staff -> Objects.equals(firstName, staff.getFirstName()))
                .collect(Collectors.toList());
    }

    public List<Staff> getAllByMiddleName(String middleName) {
        return staffList
                .stream()
                .filter(staff -> Objects.equals(middleName, staff.getMiddleName()))
                .collect(Collectors.toList());
    }

    public List<Staff> getAllByLastName(String lastName) {
        return staffList
                .stream()
                .filter(staff -> Objects.equals(lastName, staff.getLastName()))
                .collect(Collectors.toList());
    }

    public List<Staff> getAllByCurrentPosition(String currentPosition) {
        return staffList
                .stream()
                .filter(staff -> Objects.equals(currentPosition, staff.getCurrentPosition().toString()))
                .collect(Collectors.toList());
    }


}
