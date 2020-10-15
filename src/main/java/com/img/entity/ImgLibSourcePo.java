package com.img.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * 图片来源表
 */
public class ImgLibSourcePo {
    @ApiModelProperty(value = "主键Id")
    private Integer ID;

    @ApiModelProperty(value = "来源ID")
    private String sourceId;

    @ApiModelProperty(value = "来源名称")
    private String souceName;

    @ApiModelProperty(value = "备注")
    private String note;

    @ApiModelProperty(value = "0未删除，1已删除")
    private char deletFlag;

}
