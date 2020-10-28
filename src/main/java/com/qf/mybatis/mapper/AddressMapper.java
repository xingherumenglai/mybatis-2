package com.qf.mybatis.mapper;

import com.qf.mybatis.entity.Address;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface AddressMapper {
    List<Address> selectAddrById(@Param("addressId") int addressId);
}
