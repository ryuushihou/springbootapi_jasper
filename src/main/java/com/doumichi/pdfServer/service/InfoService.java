package com.doumichi.pdfServer.service;

import com.doumichi.pdfServer.entity.Tuser;
import com.doumichi.pdfServer.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InfoService implements UserMapper{

    private final UserMapper userMapper;

    public InfoService(UserMapper userMapper){
        this.userMapper = userMapper;
    }

    @Override
    public List<Tuser> getUserList() {
        return userMapper.getUserList();
    }

}
