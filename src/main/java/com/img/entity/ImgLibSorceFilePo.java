package com.img.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * 来源表--文件表中间表
 */
public class ImgLibSorceFilePo {
    @ApiModelProperty(value = "主键Id")
    private Integer ID;

    @ApiModelProperty(value = "来源类型ID")
    private String sourceId;

    @ApiModelProperty(value = "文件ID")
    private String fileId;

}
