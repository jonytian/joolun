/**
 * Copyright (C) 2018-2019
 * All rights reserved, Designed By www.joolun.com
 * 注意：
 * 本软件为www.joolun.com开发研制，未经购买不得使用
 * 购买后可获得全部源代码（禁止转卖、分享、上传到码云、github等开源平台）
 * 一经发现盗用、分享等行为，将追究法律责任，后果自负
 */
package com.joolun.cloud.mall.common.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.EqualsAndHashCode;
    import java.time.LocalDateTime;

import io.swagger.annotations.ApiModel;

/**
 * 省份表
 *
 * @author code generator
 * @date 2019-12-09 15:37:33
 */
@Data
@TableName("goods_province")
@EqualsAndHashCode(callSuper = true)
@ApiModel(description = "省份表")
public class GoodsProvince extends Model<GoodsProvince> {
    private static final long serialVersionUID=1L;

/**
 * 省份ID
 */
        @TableId(type = IdType.UUID)
        private Integer id;
/**
 * 省份名称
 */
        private String name;
/**
 * 省份编码
 */
        private String provinceId;

}
