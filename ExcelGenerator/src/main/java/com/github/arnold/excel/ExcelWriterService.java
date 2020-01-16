package com.github.arnold.excel;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

public interface ExcelWriterService {

    List<com.github.arnold.entity.BpmAccount> queryData() throws IOException;
}
