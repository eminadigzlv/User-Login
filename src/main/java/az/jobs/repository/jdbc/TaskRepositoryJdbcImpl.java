package az.jobs.repository.jdbc;

import az.jobs.domain.Tasks;
import az.jobs.repository.TaskRepository;
import az.jobs.repository.mapper.TaskMapper;
import az.jobs.repository.query.SqlQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskRepositoryJdbcImpl implements TaskRepository {

    @Autowired
    private  JdbcTemplate jdbcTemplate;
    @Autowired
    private TaskMapper taskMapper;


    @Override
    public List<Tasks> getTaskList(String sql ,long start, long length, String filter) {
        Object[] args= {"%" + filter + "%",start,length};
        List<Tasks> tasks= jdbcTemplate.query(sql, args, taskMapper);
        return tasks;
    }

    @Override
    public long tasktsCount() {
        return jdbcTemplate.queryForObject(SqlQuery.GET_TASKS_COUNT,Long.class);
    }

    @Override
    public long tasksFilteredCount(String filter) {
        Object[] args={"%" + filter + "%"};
        return jdbcTemplate.queryForObject(SqlQuery.GET_FILTERED_COUNT,args,Long.class);
    }
}
