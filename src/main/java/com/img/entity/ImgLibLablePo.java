package com.img.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 *图片标签表
 */
public class ImgLibLablePo {
    @ApiModelProperty(value = "主键Id")
    private Integer ID;

    @ApiModelProperty(value = "标签ID")
    private Integer lableId;

    @ApiModelProperty(value = "标签名")
    private String lableName;

    @ApiModelProperty(value = "标签类型")
    private String lableType;

    @ApiModelProperty(value = "0未删除，1已删除")
    private char deletFlag;
}
