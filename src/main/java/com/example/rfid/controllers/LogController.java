package com.example.rfid.controllers;

import com.example.rfid.models.Log;
import com.example.rfid.services.LogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.websocket.server.PathParam;
import java.util.List;

@RestController
@RequestMapping("/api/log")
@CrossOrigin(methods = {RequestMethod.GET,RequestMethod.DELETE,RequestMethod.POST,RequestMethod.PUT})
public class LogController {

    @Autowired
    private LogService logService;

    @GetMapping("/getAll")
    public List<Log> getAllLogs(){
        return logService.getAllLogs();
    }

    @GetMapping("/getLog/{id}")
    public Log getLog(@PathVariable Integer id){
        return logService.getLog(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteLog(@PathVariable Integer id){
        logService.deleteLogById(id);
    }

    @GetMapping("/hi")
    public String hello(){
        return "Hello World!";
    }
}
