package com.scrapper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

@Controller
public class HelloWorld {

    @RequestMapping("/")
    public @ResponseBody String getHellowWorld()
    {
        OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(
                OperatingSystemMXBean.class);

        StringBuilder sb = new StringBuilder();
        sb.append("Hello World from the Free Server!</br>");
        sb.append("\nCurrently System Load Average is " + osBean.getSystemLoadAverage() + "</br>");
        sb.append("Currently Available Processors are " + osBean.getAvailableProcessors());

        return sb.toString();

    }

}
