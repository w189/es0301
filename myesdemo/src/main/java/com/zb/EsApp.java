package com.zb;

import com.zb.entity.Course;
import com.zb.service.CourseService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
public class EsApp {
    public static void main(String[] args) throws Exception {
        //2020年3月1日18:34:48 修改代码
        //组长修改代码
        ConfigurableApplicationContext run = SpringApplication.run(EsApp.class, args);
        CourseService bean = run.getBean(CourseService.class);
        List<Course> curseByPage = bean.findCurseByPage(1, 2, "spring", null, null, null);
        for (Course course : curseByPage) {
            System.out.println(course);
        }
    }

}
