package com.shiro.YangLaoYuan.mapper;

import com.baomidou.mybatisplus.plugins.pagination.Pagination;
import com.shiro.YangLaoYuan.entity.Attribute;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.shiro.YangLaoYuan.pojo.dto.ParamsDto;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * <p>
  *  Mapper 接口
 * </p>
 *
 * @author jwy
 * @since 2017-12-26
 */
public interface AttributeMapper extends BaseMapper<Attribute> {
    /**
     * @desc: 查询属性
     *
     * @author: jwy
     * @date: 2017/12/26
     */
    List<Attribute> findAttributesByPage(Pagination page, @Param("dto") ParamsDto dto);
}