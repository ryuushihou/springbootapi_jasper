package com.doumichi.pdfServer.mapper;

import com.doumichi.pdfServer.entity.Tuser;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    List<Tuser> getUserList();

}
