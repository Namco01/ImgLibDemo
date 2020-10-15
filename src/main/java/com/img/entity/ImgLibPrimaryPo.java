package com.img.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * 图片库
 */
public class ImgLibPrimaryPo {
    @ApiModelProperty(value = "主键Id")
    private Integer ID;

    @ApiModelProperty(value = "图片编号")
    private String picId;

    @ApiModelProperty(value = "图片名")
    private String picName;

    @ApiModelProperty(value = "图片授权类型")
    private String piAuthType;

    @ApiModelProperty(value = "来源ID")
    private Integer sourceId;

    @ApiModelProperty(value = "来源名称")
    private String sourceName;

    @ApiModelProperty(value = "规格ID")
    private Integer specId;

    @ApiModelProperty(value = "备注")
    private String note;

    @ApiModelProperty(value = "逻辑删除")
    private char deletFlag;
}
