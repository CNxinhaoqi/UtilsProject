package com.github.arnold.util;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;

import java.io.OutputStream;
import java.util.List;

public class ExcelUtils {

    public void write(OutputStream outputStream, List<BaseRowModel> data, Sheet sheet){

        ExcelWriter excelWriter=new ExcelWriter(outputStream, ExcelTypeEnum.XLSX);
        excelWriter.write(data,sheet);
        excelWriter.finish();

    }
}
