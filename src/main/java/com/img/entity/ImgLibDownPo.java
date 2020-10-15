package com.img.entity;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 图片库下载记录表
 */
public class ImgLibDownPo {

    @ApiModelProperty(value = "主键Id")
    private Integer ID;

    @ApiModelProperty(value = "用户Id")
    private Integer userId;

    @ApiModelProperty(value = "图片编号")
    private String picId;

    @ApiModelProperty(value = "下载时间")
    private Date CreateTime;

}
