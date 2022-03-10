package az.jobs.repository.query;

public class SqlQuery {

    public  static  final  String GET_TASK_LIST_WITH_PAGING="select id,title,description ,\n" +
            "start_date,end_date,username\n" +
            "from task\n" +
            "where concat(id, title, description, date_format(start_date,'%d.%m.%Y')," +
            "date_format(end_date,'%d.%m.%Y'), username )\n" +
            "order by {SORT_COLUMN} {SORT_DIRECTION}";
    public  static  final  String GET_TASKS_COUNT="use task;\n" +
            "select count(*)\n" +
            "from task";
    public  static  final  String GET_FILTERED_COUNT="select count(*)\n" +
            "from task\n" +
            "where concat(id, title, description, date_format(start_date,'%d.%m.%Y'),\n" +
            "date_format(end_date,'%d.%m.%Y'), username )";
}
