package global.citytech.controller;

import global.citytech.controller.payloads.EmployeePayload;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/employees")
public class EmployeeController {
    @Get
    public EmployeePayload get()
    {
        return new EmployeePayload("1","Ram");
    }
}
