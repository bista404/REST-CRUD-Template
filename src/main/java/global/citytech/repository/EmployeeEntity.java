package global.citytech.repository;

import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;

@MappedEntity("employees")
public record EmployeeEntity(@Id String id, String name) {
}
