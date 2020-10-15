package com.img.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * 图片库--标签中间表
 */
public class ImgLibSourceLablePo {
    @ApiModelProperty(value = "主键Id")
    private Integer ID;

    @ApiModelProperty(value = "图片编号")
    private String picId;

    @ApiModelProperty(value = "标签ID")
    private String lableId;
}
