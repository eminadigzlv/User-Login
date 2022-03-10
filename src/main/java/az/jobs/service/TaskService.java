package az.jobs.service;

import az.jobs.domain.DataTableRequest;
import az.jobs.domain.DataTableResult;
import org.springframework.stereotype.Service;

@Service
public interface TaskService {

    DataTableResult getTaskList(DataTableRequest request);

}
