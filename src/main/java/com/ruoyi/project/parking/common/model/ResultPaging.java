package com.ruoyi.project.parking.common.model;

import com.ruoyi.project.parking.common.error.ServiceErrors;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
public class ResultPaging<D> implements Serializable {

	private static final long serialVersionUID = 615173930220755772L;

	private boolean success;

	private String message = "";

	private String code = "0000";

	private List<D> data;

	private Integer total;

	public static <D> ResultPaging<D> wrapSuccessfulResult(List<D> data, Integer total) {
		ResultPaging<D> result = new ResultPaging<D>();
		result.success = true;
		result.data = data;
		result.total = total;
		result.message = null;
		return result;
	}

	public static <D> ResultPaging<D> wrapErrorResult(Exception error, String code) {
		ResultPaging<D> result = new ResultPaging<D>();
		result.success = false;
		result.message = error.getMessage();
		result.code = code;
		return result;
	}

	public static <D> ResultPaging<D> wrapErrorResult(ServiceErrors error) {
		ResultPaging<D> result = new ResultPaging<D>();
		result.success = false;
		result.message = error.getMessage();
		result.code = error.getCode();
		return result;
	}

	public static <D> ResultPaging<D> wrapErrorResult(String message, String code) {
		ResultPaging<D> result = new ResultPaging<D>();
		result.success = false;
		result.message = message;
		result.code = code;
		return result;
	}

}
