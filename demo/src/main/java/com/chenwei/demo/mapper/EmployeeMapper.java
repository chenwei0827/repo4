package com.chenwei.demo.mapper;

import com.chenwei.demo.bean.Employee;

//@Mapper或者@MapperScan将接口扫面装配到容器中
public interface EmployeeMapper {

    public Employee getEmpById(Integer id);

    public void insertEmp(Employee employee);
}
