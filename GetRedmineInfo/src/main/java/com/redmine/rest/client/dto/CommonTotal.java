package com.redmine.rest.client.dto;

public class CommonTotal<T> extends BaseDTO {
    private Integer total_count;
    private Integer offset;
    private Integer limit;
    // TODO 这里可以gson的构造函数来简化
    public Integer getTotal_count() {
        return total_count;
    }
    public void setTotal_count(Integer total_count) {
        this.total_count = total_count;
    }
    public Integer getOffset() {
        return offset;
    }
    public void setOffset(Integer offset) {
        this.offset = offset;
    }
    public Integer getLimit() {
        return limit;
    }
    public void setLimit(Integer limit) {
        this.limit = limit;
    }
}
