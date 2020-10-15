package com.img.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * 图片规格表
 */
public class ImgLibSpecPo {
    @ApiModelProperty(value = "主键Id")
    private Integer Id;

    @ApiModelProperty(value = "规格Id")
    private String specId;

    @ApiModelProperty(value = "规格名称")
    private String specName;

    @ApiModelProperty(value = "图片编号")
    private String picId;

    @ApiModelProperty(value = "图片名")
    private String picName;

    @ApiModelProperty(value = "格式")
    private String specFormat;

    @ApiModelProperty(value = "尺寸")
    private String specMeasure;

    @ApiModelProperty(value = "分辨率")
    private String specDigtiza;

    @ApiModelProperty(value = "文件Object_id")
    private String FilleId;
}
