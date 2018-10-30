package com.mike.common;

import lombok.Data;

@Data
public class Response {
    private Integer code = 0;

    private String message = "success";

    private Object data;

    public Response(Object data) {
        setData(data);
    }

    public Response(String message, Object data) {
        setData(data);
        setMessage(message);
    }

    public Response(Integer code, String message, Object data) {
        setCode(code);
        setMessage(message);
        setData(data);
    }
}
