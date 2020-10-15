package com.img.entity;

import io.swagger.annotations.ApiModelProperty;

import java.util.Date;

/**
 * 图片收藏表
 */
public class ImgLibCollectPo {
    @ApiModelProperty(value = "主键Id")
    private Integer ID;

    @ApiModelProperty(value = "用户Id")
    private Integer userId;

    @ApiModelProperty(value = "图片编号")
    private String picId;

    @ApiModelProperty(value = "收藏时间")
    private Date createTime;

    @ApiModelProperty(value = "0未收藏，1已收藏")
    private char status;
}
