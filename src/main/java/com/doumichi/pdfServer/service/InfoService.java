package com.doumichi.pdfServer.service;

import com.doumichi.pdfServer.entity.Tuser;
import com.doumichi.pdfServer.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface InfoService{
    List<Tuser> getUserList();
}
