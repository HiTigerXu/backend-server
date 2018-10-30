package com.mike.common.utils;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;

@Data
public class Service {

    @JsonProperty("total_results")
    private Integer totalResults;

    @JsonProperty("has_next")
    private boolean hasNext;

    private Integer page;

    private Integer size;

    private Object list;


    public <T> Service(List<T> list, Integer total, Integer page, Integer size) {
        setList(list);
        setTotalResults(total);
        setPage(page);
        setSize(size);
        setHasNext(total > (page * size));
    }
}
