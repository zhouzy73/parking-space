package com.ruoyi.project.parking.common.error;

import java.io.Serializable;

public interface ServiceErrors extends Serializable {

    String getCode();

    String getMessage();
}
