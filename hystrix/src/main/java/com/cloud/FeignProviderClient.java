package com.cloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@FeignClient(value = "provider")  // 指feign要调用的微服务
public interface FeignProviderClient {

    @GetMapping("/student/index")
    public String index();
    @GetMapping("/student/findAll")
    public Collection<Student> findAll();
    @GetMapping("/student/findById/{id}")
    public Student findById(@PathVariable("id") long id);
    @PostMapping("/student/save")
    public void save(@RequestBody Student student);
    @PutMapping("/student/update")
    public void update(@RequestBody Student student);
    @DeleteMapping("/student/deleteById/{id}")
    public void deleteById(@PathVariable("id") long id);

}
