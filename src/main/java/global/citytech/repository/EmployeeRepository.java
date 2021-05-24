package global.citytech.repository;

import global.citytech.model.Employee;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.CrudRepository;
import io.reactivex.Maybe;
import io.reactivex.Single;

import java.util.List;
@Repository()
@JdbcRepository(dialect = Dialect.MYSQL)
public interface EmployeeRepository extends CrudRepository<EmployeeEntity,String> {



}
