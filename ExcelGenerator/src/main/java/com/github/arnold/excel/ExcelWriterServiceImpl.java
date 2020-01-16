package com.github.arnold.excel;

import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.metadata.Sheet;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.github.arnold.entity.BpmAccount;
import org.springframework.stereotype.Service;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class ExcelWriterServiceImpl implements com.github.arnold.excel.ExcelWriterService {


    public List<BpmAccount> queryData() throws IOException {


            List<BpmAccount> data=new ArrayList<BpmAccount>();

            for (int i = 0; i < 1000; i++) {
                BpmAccount bpmAccount=new BpmAccount();
                bpmAccount.setUserName("name"+i);
                bpmAccount.setUserCName("姓名"+i);
                if(i%2==0){
                    bpmAccount.setAreaName("上海总部");
                }else{
                    bpmAccount.setAreaName("全国区域中心");
                }
                bpmAccount.setRoleNames("系统管理员");
                bpmAccount.setAccountStatus("使用中");
                SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
                String createTime = sdf.format(new Date());
                bpmAccount.setCreateTime(createTime);

                bpmAccount.setEndTime(createTime);
                data.add(bpmAccount);
            }




        return data;
    }
}
