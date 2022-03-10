package az.jobs.repository;

import az.jobs.domain.Tasks;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TaskRepository {

   List<Tasks> getTaskList(String sql ,long start , long length, String filter);
   long tasktsCount();
   long tasksFilteredCount(String filter);

}
