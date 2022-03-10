package az.jobs.controller;
import az.jobs.domain.DataTableRequest;
import az.jobs.domain.DataTableResult;
import az.jobs.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/")
@Controller
public class WebController {
    @Autowired
    TaskService taskService;

    @GetMapping("/")
    public String index(){

        return "index";
    }
    @GetMapping("/getTaskListAjax")
    @ResponseBody
    public DataTableResult taskList(@RequestParam(name =  "draw") int draw,
                                    @RequestParam (name = "start") int start,
                                    @RequestParam (name = "length") int length,
                                    @RequestParam (name = "order[0][column]") int sortColumn,
                                    @RequestParam (name = "order[0][dir]") String sortDirection,
                                    @RequestParam (name = "search[value]") String filter){

        DataTableRequest dataTableRequest = new DataTableRequest();
        dataTableRequest.setPage(draw);
        dataTableRequest.setStart(start);
        dataTableRequest.setLength(length);
        dataTableRequest.setSortColumn(sortColumn);
        dataTableRequest.setSortDirection(sortDirection);
        dataTableRequest.setFilet(filter);

        DataTableResult dataTableResult = taskService.getTaskList(dataTableRequest);

        return dataTableResult;
    }
}
