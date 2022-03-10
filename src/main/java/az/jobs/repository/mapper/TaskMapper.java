package az.jobs.repository.mapper;

import az.jobs.domain.Tasks;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Component;

import java.sql.ResultSet;
import java.sql.SQLException;

@Component
public class TaskMapper  implements RowMapper<Tasks> {

    @Override
    public Tasks mapRow(ResultSet rs, int i) throws SQLException {
        Tasks tasks = new Tasks();
        tasks.setId(rs.getLong("id"));
        tasks.setTittle(rs.getString("title"));
        tasks.setDescription(rs.getString("description"));
        tasks.setStartDate(rs.getDate("start_date").toLocalDate());
        tasks.setEndDate(rs.getDate("end_date").toLocalDate());
        tasks.setUserName(rs.getString("username"));
        return tasks;
    }
}
