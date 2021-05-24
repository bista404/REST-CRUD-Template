package global.citytech.controller.payloads;

import io.micronaut.core.annotation.Introspected;

@Introspected
public record EmployeePayload(String id, String name){

}
