package com.example.rfid.services;

import com.example.rfid.models.Log;
import com.example.rfid.repos.LogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LogService {

    @Autowired
    private LogRepository logRepository;

    public void addLog(Log log){
        logRepository.save(log);
    }

    public Log getLog(Integer id){
        return logRepository.getById(id);
    }

    public List<Log> getAllLogs(){
        return logRepository.findAll();
    }

    public void deleteLogById(Integer id){
        logRepository.deleteById(id);
    }
}
