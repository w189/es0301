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
         //写完代码了
	  //李四提交到李四的分支上，并合并到master

	    //张三也写完了，后写完

	 //李四提交了，先写完

        ConfigurableApplicationContext run = SpringApplication.run(EsApp.class, args);
        CourseService bean = run.getBean(CourseService.class);
        List<Course> curseByPage = bean.findCurseByPage(1, 2, "spring", null, null, null);
        for (Course course : curseByPage) {
            System.out.println(course);
        }
    }

}
