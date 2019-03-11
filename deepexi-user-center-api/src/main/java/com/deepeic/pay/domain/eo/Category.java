package com.deepeic.pay.domain.eo;


import com.deepexi.util.mapper.SuperEntity;

import java.util.*;
import java.io.Serializable;
//import io.swagger.annotations.ApiModel;
//import io.swagger.annotations.ApiModelProperty;


/**
 * @desc category
 * @author admin
 */
//@ApiModel(description = "category")
public class Category implements Serializable{

    //@ApiModelProperty(value = "id")
    private String id;

    //@ApiModelProperty(value = "类目名称")
    private String name;

    //@ApiModelProperty(value = "描述")
    private String description;

    //@ApiModelProperty(value = "是否末级节点")
    private Boolean isLeaf;

    //@ApiModelProperty(value = "父节点")
    private String parentId;

    //@ApiModelProperty(value = "公众号id")
    private String wechatPublistNo;

    //@ApiModelProperty(value = "租户id")
    private String tenantId;

    //@ApiModelProperty(value = "创建时间")
    private Date createdAt;

    //@ApiModelProperty(value = "创建人")
    private String createdBy;

    //@ApiModelProperty(value = "更新时间")
    private Date updatedAt;

    //@ApiModelProperty(value = "更新人")
    private String updatedBy;

    //@ApiModelProperty(value = "逻辑删除")
    private Boolean dr;

    //@ApiModelProperty(value = "预留字段")
    private String ext1;

    //@ApiModelProperty(value = "预留字段")
    private String ext2;

    //@ApiModelProperty(value = "预留字段")
    private String ext3;

    //@ApiModelProperty(value = "预留字段")
    private String ext4;

    //@ApiModelProperty(value = "预留字段")
    private String extJson;

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return this.id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return this.description;
    }

    public void setIsLeaf(Boolean isLeaf){
        this.isLeaf = isLeaf;
    }

    public Boolean getIsLeaf(){
        return this.isLeaf;
    }

    public void setParentId(String parentId){
        this.parentId = parentId;
    }

    public String getParentId(){
        return this.parentId;
    }

    public void setWechatPublistNo(String wechatPublistNo){
        this.wechatPublistNo = wechatPublistNo;
    }

    public String getWechatPublistNo(){
        return this.wechatPublistNo;
    }

    public void setTenantId(String tenantId){
        this.tenantId = tenantId;
    }

    public String getTenantId(){
        return this.tenantId;
    }

    public void setCreatedAt(Date createdAt){
        this.createdAt = createdAt;
    }

    public Date getCreatedAt(){
        return this.createdAt;
    }

    public void setCreatedBy(String createdBy){
        this.createdBy = createdBy;
    }

    public String getCreatedBy(){
        return this.createdBy;
    }

    public void setUpdatedAt(Date updatedAt){
        this.updatedAt = updatedAt;
    }

    public Date getUpdatedAt(){
        return this.updatedAt;
    }

    public void setUpdatedBy(String updatedBy){
        this.updatedBy = updatedBy;
    }

    public String getUpdatedBy(){
        return this.updatedBy;
    }

    public void setDr(Boolean dr){
        this.dr = dr;
    }

    public Boolean getDr(){
        return this.dr;
    }

    public void setExt1(String ext1){
        this.ext1 = ext1;
    }

    public String getExt1(){
        return this.ext1;
    }

    public void setExt2(String ext2){
        this.ext2 = ext2;
    }

    public String getExt2(){
        return this.ext2;
    }

    public void setExt3(String ext3){
        this.ext3 = ext3;
    }

    public String getExt3(){
        return this.ext3;
    }

    public void setExt4(String ext4){
        this.ext4 = ext4;
    }

    public String getExt4(){
        return this.ext4;
    }

    public void setExtJson(String extJson){
        this.extJson = extJson;
    }

    public String getExtJson(){
        return this.extJson;
    }


}

