package com.rd.batch.pojo.Bo;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 * @author
 * @create 2020-09-14-14:35
 */
public class RdBatchModelBo {

    private Integer serialno;
    private Integer taskno;
    private String batchname;
    private String batchpath;
    private String content;
    private Integer isuse;

    public Integer getSerialno() {
        return serialno;
    }

    public void setSerialno(Integer serialno) {
        this.serialno = serialno;
    }

    public Integer getTaskno() {
        return taskno;
    }

    public void setTaskno(Integer taskno) {
        this.taskno = taskno;
    }

    public String getBatchname() {
        return batchname;
    }

    public void setBatchname(String batchname) {
        this.batchname = batchname;
    }

    public String getBatchpath() {
        return batchpath;
    }

    public void setBatchpath(String batchpath) {
        this.batchpath = batchpath;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getIsuse() {
        return isuse;
    }

    public void setIsuse(Integer isuse) {
        this.isuse = isuse;
    }
}
