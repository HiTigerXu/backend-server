package com.mike.common;

import lombok.Data;

@Data
public class ServiceExecption extends Exception {
    private Integer code=1;

    public ServiceExecption(Integer code, String message) {
        super(message);
        setCode(code);
    }
}
