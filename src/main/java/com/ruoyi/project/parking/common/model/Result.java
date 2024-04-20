package com.ruoyi.project.parking.common.model;

import com.ruoyi.project.parking.common.error.ServiceErrors;
import lombok.Data;

import java.io.Serializable;

@Data
public class Result<D> implements Serializable {

	private static final long serialVersionUID = -3008914601179204311L;

	private D data;

    private boolean success;

    private String code = "0000";

    private String message = "";

    @SuppressWarnings("rawtypes")
    public static Result wrapResult(Result result) {
        return result;
    }

    public static <D> Result<D> wrapSuccessfulResult(D data) {
        Result<D> result = new Result<D>();
        result.success = true;
        result.data = data;
        result.message = null;
        return result;
    }

    public static <D> Result<D> wrapErrorResult(Exception error, String code) {
        Result<D> result = new Result<D>();
        result.success = false;
        result.message = error.getMessage();
        result.code = code;
        return result;
    }

    public static <D> Result<D> wrapErrorResult(ServiceErrors error) {
        Result<D> result = new Result<D>();
        result.success = false;
        result.message = error.getMessage();
        result.code = error.getCode();
        return result;
    }

    public static <D> Result<D> wrapErrorResult(String message, String code) {
        Result<D> result = new Result<D>();
        result.success = false;
        result.message = message;
        result.code = code;
        return result;
    }

}
