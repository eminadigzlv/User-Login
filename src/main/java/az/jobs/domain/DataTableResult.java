package az.jobs.domain;

import java.util.Arrays;

public class DataTableResult {
    private long page;
    private long totalCount;
    private long filterCount;
    private  Object[][] data;

    public DataTableResult() {
        this.page = 0;
        this.totalCount = 0;
        this.filterCount = 0;
        this.data = new Object[0][0];
    }

    @Override
    public String toString() {
        return "DataTableResult{" +
                "page=" + page +
                ", totalCount=" + totalCount +
                ", filterCount=" + filterCount +
                ", data=" + Arrays.toString(data) +
                '}';
    }

    public long getPage() {
        return page;
    }

    public void setPage(long page) {
        this.page = page;
    }

    public long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(long totalCount) {
        this.totalCount = totalCount;
    }

    public long getFilterCount() {
        return filterCount;
    }

    public void setFilterCount(long filterCount) {
        this.filterCount = filterCount;
    }

    public Object[][] getData() {
        return data;
    }

    public void setData(Object[][] data) {
        this.data = data;
    }
}
