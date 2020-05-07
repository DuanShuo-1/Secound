package com.zh;

import com.zh.utils.ExcelExportUtil;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ExcelService {
      public void test(HttpServletResponse response, HttpServletRequest request) throws IOException {

          List<Map> maps = new ArrayList<Map>();
          if (maps != null && maps.size() > 0) {
              String[] title = new String[]{"城市", "项目名字", "合同", "实际"};        //设置表格表头字段
              String[] properties = new String[]{"city", "projectName", "ddNum", "sjNum"};  // 查询对应的字段
              ExcelExportUtil excelExport2 = new ExcelExportUtil();
              excelExport2.setData(maps);
              excelExport2.setHeardKey(properties);
              excelExport2.setFontSize(14);
              excelExport2.setSheetName("ceshi1");
              excelExport2.setTitle("ceshi2");
              excelExport2.setHeardList(title);
              excelExport2.exportExport(request, response);
          }

      }
}
