package com.hotel.hotel_app.models;

import java.util.Objects;
import java.io.Serializable;
public class EmployeeRolePK implements Serializable { 
    private Long employee_id;
    private String role;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof EmployeeRolePK)) return false;
        EmployeeRolePK that = (EmployeeRolePK) o;
        return Objects.equals(employee_id, that.employee_id) &&
               Objects.equals(role, that.role);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employee_id, role);
    }
}
