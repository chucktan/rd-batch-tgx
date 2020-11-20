package com.rd.batch.pojo.Bo;

/**
 * @author
 * @create 2020-09-16-14:55
 */
public class RdBatchProjectBo {

    private Integer serialno;
    private Integer taskno;
    private Integer relativemodelno;
    private String corn;
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

    public Integer getRelativemodelno() {
        return relativemodelno;
    }

    public void setRelativemodelno(Integer relativemodelno) {
        this.relativemodelno = relativemodelno;
    }

    public String getCorn() {
        return corn;
    }

    public void setCorn(String corn) {
        this.corn = corn;
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
