package com.rd.batch.pojo;

import javax.persistence.*;
import java.math.BigDecimal;

@Table(name = "PUTOUT_PAYBACK_SUBSIDY_INFO")
public class PutoutPaybackSubsidyInfo {
    /**
     * 序号
     */
    @Id
    @Column(name = "SERIALNO")
    private Integer serialno;

    /**
     * 客户编号
     */
    @Column(name = "CUSTOMERID")
    private String customerid;

    /**
     * 放款借据号
     */
    @Column(name = "PUTOUT_DUEBILLNO")
    private String putoutDuebillno;

    /**
     * 客户营业执照号码（个人）
     */
    @Column(name = "LICENSENO")
    private String licenseno;

    /**
     * 放款额度
     */
    @Column(name = "PUTOUT_BALANCE")
    private BigDecimal putoutBalance;

    /**
     * 放款日期
     */
    @Column(name = "PUTOUT_DATE")
    private String putoutDate;

    /**
     * 还款借据号
     */
    @Column(name = "PAYBACK_DUEBILLNO")
    private String paybackDuebillno;

    /**
     * 还款合同号
     */
    @Column(name = "PAYBACK_CONTRACTNO")
    private String paybackContractno;

    /**
     * 还款额度
     */
    @Column(name = "PAYBACK_BALANCE")
    private BigDecimal paybackBalance;

    /**
     * 还款日期
     */
    @Column(name = "PAYBACK_DATE")
    private String paybackDate;

    /**
     * 管户人
     */
    @Column(name = "MANAGERUSERID")
    private String manageruserid;

    /**
     * 管户机构
     */
    @Column(name = "MANAGERORGID")
    private String managerorgid;

    /**
     * 创建人
     */
    @Column(name = "CREATED_BY")
    private String createdBy;

    /**
     * 创建日期
     */
    @Column(name = "CREATED_TIME")
    private String createdTime;

    /**
     * 更新人
     */
    @Column(name = "UPDATED_BY")
    private String updatedBy;

    /**
     * 更新日期
     */
    @Column(name = "UPDATED_TIME")
    private String updatedTime;

    /**
     * 获取序号
     *
     * @return SERIALNO - 序号
     */
    public Integer getSerialno() {
        return serialno;
    }

    /**
     * 设置序号
     *
     * @param serialno 序号
     */
    public void setSerialno(Integer serialno) {
        this.serialno = serialno;
    }

    /**
     * 获取客户编号
     *
     * @return CUSTOMERID - 客户编号
     */
    public String getCustomerid() {
        return customerid;
    }

    /**
     * 设置客户编号
     *
     * @param customerid 客户编号
     */
    public void setCustomerid(String customerid) {
        this.customerid = customerid;
    }

    /**
     * 获取放款借据号
     *
     * @return PUTOUT_DUEBILLNO - 放款借据号
     */
    public String getPutoutDuebillno() {
        return putoutDuebillno;
    }

    /**
     * 设置放款借据号
     *
     * @param putoutDuebillno 放款借据号
     */
    public void setPutoutDuebillno(String putoutDuebillno) {
        this.putoutDuebillno = putoutDuebillno;
    }

    /**
     * 获取客户营业执照号码（个人）
     *
     * @return LICENSENO - 客户营业执照号码（个人）
     */
    public String getLicenseno() {
        return licenseno;
    }

    /**
     * 设置客户营业执照号码（个人）
     *
     * @param licenseno 客户营业执照号码（个人）
     */
    public void setLicenseno(String licenseno) {
        this.licenseno = licenseno;
    }

    /**
     * 获取放款额度
     *
     * @return PUTOUT_BALANCE - 放款额度
     */
    public BigDecimal getPutoutBalance() {
        return putoutBalance;
    }

    /**
     * 设置放款额度
     *
     * @param putoutBalance 放款额度
     */
    public void setPutoutBalance(BigDecimal putoutBalance) {
        this.putoutBalance = putoutBalance;
    }

    /**
     * 获取放款日期
     *
     * @return PUTOUT_DATE - 放款日期
     */
    public String getPutoutDate() {
        return putoutDate;
    }

    /**
     * 设置放款日期
     *
     * @param putoutDate 放款日期
     */
    public void setPutoutDate(String putoutDate) {
        this.putoutDate = putoutDate;
    }

    /**
     * 获取还款借据号
     *
     * @return PAYBACK_DUEBILLNO - 还款借据号
     */
    public String getPaybackDuebillno() {
        return paybackDuebillno;
    }

    /**
     * 设置还款借据号
     *
     * @param paybackDuebillno 还款借据号
     */
    public void setPaybackDuebillno(String paybackDuebillno) {
        this.paybackDuebillno = paybackDuebillno;
    }

    /**
     * 获取还款合同号
     *
     * @return PAYBACK_CONTRACTNO - 还款合同号
     */
    public String getPaybackContractno() {
        return paybackContractno;
    }

    /**
     * 设置还款合同号
     *
     * @param paybackContractno 还款合同号
     */
    public void setPaybackContractno(String paybackContractno) {
        this.paybackContractno = paybackContractno;
    }

    /**
     * 获取还款额度
     *
     * @return PAYBACK_BALANCE - 还款额度
     */
    public BigDecimal getPaybackBalance() {
        return paybackBalance;
    }

    /**
     * 设置还款额度
     *
     * @param paybackBalance 还款额度
     */
    public void setPaybackBalance(BigDecimal paybackBalance) {
        this.paybackBalance = paybackBalance;
    }

    /**
     * 获取还款日期
     *
     * @return PAYBACK_DATE - 还款日期
     */
    public String getPaybackDate() {
        return paybackDate;
    }

    /**
     * 设置还款日期
     *
     * @param paybackDate 还款日期
     */
    public void setPaybackDate(String paybackDate) {
        this.paybackDate = paybackDate;
    }

    /**
     * 获取管户人
     *
     * @return MANAGERUSERID - 管户人
     */
    public String getManageruserid() {
        return manageruserid;
    }

    /**
     * 设置管户人
     *
     * @param manageruserid 管户人
     */
    public void setManageruserid(String manageruserid) {
        this.manageruserid = manageruserid;
    }

    /**
     * 获取管户机构
     *
     * @return MANAGERORGID - 管户机构
     */
    public String getManagerorgid() {
        return managerorgid;
    }

    /**
     * 设置管户机构
     *
     * @param managerorgid 管户机构
     */
    public void setManagerorgid(String managerorgid) {
        this.managerorgid = managerorgid;
    }

    /**
     * 获取创建人
     *
     * @return CREATED_BY - 创建人
     */
    public String getCreatedBy() {
        return createdBy;
    }

    /**
     * 设置创建人
     *
     * @param createdBy 创建人
     */
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    /**
     * 获取创建日期
     *
     * @return CREATED_TIME - 创建日期
     */
    public String getCreatedTime() {
        return createdTime;
    }

    /**
     * 设置创建日期
     *
     * @param createdTime 创建日期
     */
    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    /**
     * 获取更新人
     *
     * @return UPDATED_BY - 更新人
     */
    public String getUpdatedBy() {
        return updatedBy;
    }

    /**
     * 设置更新人
     *
     * @param updatedBy 更新人
     */
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    /**
     * 获取更新日期
     *
     * @return UPDATED_TIME - 更新日期
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    /**
     * 设置更新日期
     *
     * @param updatedTime 更新日期
     */
    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }
}