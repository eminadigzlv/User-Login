package az.jobs.service.impl;

import az.jobs.domain.DataTableRequest;
import az.jobs.domain.DataTableResult;
import az.jobs.domain.Tasks;
import az.jobs.repository.TaskRepository;
import az.jobs.repository.query.SqlQuery;
import az.jobs.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;

import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TaskServiceImpl implements TaskService {
    @Autowired
    TaskRepository taskRepository;
    @Override
    public DataTableResult getTaskList(DataTableRequest request) {
        Map<Integer , String > map =new HashMap<>();
        map.put(0,"id");
        map.put(1,"title");
        map.put(2,"description");
        map.put(3,"start_date");
        map.put(4,"end_date");
        map.put(5,"username");
        String sql = SqlQuery.GET_TASK_LIST_WITH_PAGING.replace("{SORT_COLUMN}",map.get(request.getSortColumn())).
                replace("{SORT_DIRECTION}",map.get(request.getSortDirection()));
        DataTableResult result = new DataTableResult();
        result.setPage(request.getPage());
        result.setTotalCount(taskRepository.tasktsCount());
        result.setFilterCount(taskRepository.tasksFilteredCount(request.getFilet()));
        List<Tasks> tasksList= taskRepository.getTaskList(sql,request.getStart(),request.getLength(),request.getFilet());
        result.setData(new Object[tasksList.size()][7]);

        DateTimeFormatter dateTimeFormatter =  DateTimeFormatter.ofPattern("dd.MM.yyyy");
        for (int i = 0; i < tasksList.size(); i++) {
            result.getData()[i][0] = tasksList.get(i).getId();
            result.getData()[i][1] = tasksList.get(i).getTittle();
            result.getData()[i][2] = tasksList.get(i).getDescription();
            result.getData()[i][3] = dateTimeFormatter.format(tasksList.get(i).getStartDate());
            result.getData()[i][4] = dateTimeFormatter.format(tasksList.get(i).getEndDate());
            result.getData()[i][5] = tasksList.get(i).getUserName();
            result.getData()[i][6] =
                            "<form action=\"view?id=" + tasksList.get(i).getId() +"\" method=\"post\" > <input type=\"submit\" value=\"view\"></form> "
                            + "<form action=\"edit?id="+tasksList.get(i).getId()+"\" method=\"post\" > <input type=\"submit\" value=\"edit\"></form> "
                            + "<form action=\"delete?id="+tasksList.get(i).getId()+"\" method=\"post\" > <input type=\"submit\" value=\"delete\"></form> ";

        }
        return result;
    }
}
