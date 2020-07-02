package com.scrapper.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

@Controller
public class HelloWorld {

    @RequestMapping("/")
    public String getHellowWorld()
    {
        OperatingSystemMXBean osBean = ManagementFactory.getPlatformMXBean(
                OperatingSystemMXBean.class);

        StringBuilder sb = new StringBuilder();
        sb.append("Hello World from the Free Server!\n");
        sb.append("Currently System Load Average is " + osBean.getSystemLoadAverage() + "\n");
        sb.append("Currently Available Processors are" + osBean.getAvailableProcessors());

        return "";

    }

}
