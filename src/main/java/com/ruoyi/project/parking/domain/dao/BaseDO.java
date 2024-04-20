package com.ruoyi.project.parking.domain.dao;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BaseDO {

    private Long id;
    private Date gmtCreate;
    private Date gmtModified;
    private Integer isDelete;
    private Integer version;
    private String creator;
    private String modifier;
    private String remark;

    @Override
    public String toString() {
        return "BaseDO{" +
                "id=" + id +
                ", gmtCreate=" + gmtCreate +
                ", gmtModified=" + gmtModified +
                ", isDelete=" + isDelete +
                ", version=" + version +
                ", creator='" + creator + '\'' +
                ", modifier='" + modifier + '\'' +
                ", remark='" + remark + '\'' +
                '}';
    }
}
