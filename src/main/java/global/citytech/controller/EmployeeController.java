package global.citytech.controller;

import global.citytech.controller.payloads.EmployeePayload;
import global.citytech.repository.EmployeeEntity;
import global.citytech.repository.EmployeeRepository;
import io.micronaut.data.annotation.Id;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Delete;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.Post;

import javax.inject.Inject;


@Controller("/employees")
public class EmployeeController {
    @Inject
    EmployeeRepository employeeRepository;
    @Inject
    EmployeePayload employeePayload;
    @Get
    public Iterable<EmployeeEntity> getAllEmployees()
    {
        return  employeeRepository.findAll();
    }
    @Post("/save")
    public EmployeeEntity save(EmployeeEntity employeeEntity)
    {
        return employeeRepository.save(employeeEntity);
    }
    @Delete(value = "/{id}")
    public void delete(String id)
    {
       employeeRepository.deleteById(id);

    }


}


