package az.jobs.domain;

import java.io.Serializable;

public class DataTableRequest  implements Serializable {

    private long page;
    private long start;
    private long length;
    private  long sortColumn;
    private String filet;
    private String sortDirection;

    public DataTableRequest() {
        this.page = 0;
        this.start = 0;
        this.length = 0;
        this.sortColumn = 0;
        this.filet = "";
        this.sortDirection = "";
    }

    @Override
    public String toString() {
        return "DataTableRequest{" +
                "page=" + page +
                ", start=" + start +
                ", length=" + length +
                ", sortColumn=" + sortColumn +
                ", filet='" + filet + '\'' +
                ", sortDirection='" + sortDirection + '\'' +
                '}';
    }

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public long getStart() {
        return start;
    }

    public void setStart(long start) {
        this.start = start;
    }

    public long getLength() {
        return length;
    }

    public void setLength(long length) {
        this.length = length;
    }

    public long getSortColumn() {
        return sortColumn;
    }

    public void setSortColumn(long sortColumn) {
        this.sortColumn = sortColumn;
    }

    public String getFilet() {
        return filet;
    }

    public void setFilet(String filet) {
        this.filet = filet;
    }

    public String getSortDirection() {
        return sortDirection;
    }

    public void setSortDirection(String sortDirection) {
        this.sortDirection = sortDirection;
    }
}
