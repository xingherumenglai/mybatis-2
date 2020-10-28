package com.qf.mybatis.mapper;

import com.qf.mybatis.entity.Order;
import org.apache.ibatis.annotations.Param;

public interface OrderMapper {
    Order selectOrderByNo(@Param("orderNo") int no);
}
