package com.zh.demo_01;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.io.FileOutputStream;
import java.text.SimpleDateFormat;
import java.util.*;

@SpringBootTest
class Demo01ApplicationTests {

    @Test
    public void test(){
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(-1);
            list.add(5);
            list.add(4);
            Collections.sort(list);
            System.out.println(list);
            System.out.println(list.get(2)+list.get(3));


    }

}
