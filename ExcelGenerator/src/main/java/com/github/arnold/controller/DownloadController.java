package com.github.arnold.controller;


import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.alibaba.fastjson.JSON;
import com.github.arnold.entity.BpmAccount;
import com.github.arnold.excel.ExcelWriterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.net.URLEncoder;
import java.util.HashMap;
import java.util.Map;

@Controller
public class DownloadController {
    @Autowired
    private ExcelWriterService excelWriterService;

    @GetMapping("/download")
    public void gengerateExcel(HttpServletResponse response) throws IOException {
        try {
            response.setContentType("application/vnd.ms-excel");

            response.setCharacterEncoding("UTF-8");

            String fileName = URLEncoder.encode("账号", "UTF-8");

            response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");

            ExcelWriter writer = new ExcelWriter(response.getOutputStream(), ExcelTypeEnum.XLSX);

            Sheet sheet = new Sheet(1, 0, BpmAccount.class);

//            int num=1/0;
            writer.write(excelWriterService.queryData(), sheet);
            writer.finish();

        }catch (Exception e){
            response.reset();
            response.setContentType("application/json");
            response.setCharacterEncoding("utf-8");
            Map<String, String> map = new HashMap<String, String>();
            map.put("status", "failure");
            map.put("message", "下载文件失败" + e.getMessage());
            response.getWriter().println(JSON.toJSONString(map));
        }
    }
}
