package com.mike.common.utils;

public class Tools {
    public static Integer getOffset(Integer page, Integer size) {
        return (page - 1) * size;
    }
}
