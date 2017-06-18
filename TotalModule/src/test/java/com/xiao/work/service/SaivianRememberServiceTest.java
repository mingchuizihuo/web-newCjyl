package com.xiao.work.service;

import SupportTest.SupportTest;
import com.idea.cjyl.totalmodule.web.domain.pojo.SaivianRemember;
import com.idea.cjyl.totalmodule.web.service.SaivianRememberService;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.Map;

/**
 * Created by xiaolitong on 2017/6/17.
 */
public class SaivianRememberServiceTest extends SupportTest {

    private POIFSFileSystem fs;
    private XSSFWorkbook wb;
    private XSSFSheet sheet;
    private XSSFRow row;
    @Autowired
    private SaivianRememberService saivianRememberService;

    @Test
    public void testAdd() {
        SaivianRemember saivianRemember = new SaivianRemember();
        saivianRemember.setSaivianId(123l);
        saivianRemember.setBankCardNum("a");
        SaivianRemember insert = saivianRememberService.insert(saivianRemember);
        System.out.println(insert);

    }

    @Test
    public void savepySaivianRemember(){
        try {
            String filepath = "/Users/xiaolitong/dev/workspace/web-newCjyl/TotalModule/src/test/resources/text2.xlsx";
            ExcelTest excelReader = new ExcelTest(filepath);


            // 对读取Excel表格内容测试
            Map<Integer, Map<Integer, Object>> map = excelReader.readExcelContent();
            System.out.println("获得Excel表格的内容:");
            for (int i = 1; i <= map.size(); i++) {
                if (map.get(i).get(0) == "") {
                    continue;
                }
                SaivianRemember saivianRemember = new SaivianRemember();

                String saivianId = map.get(i).get(11).toString().replaceAll("\\u00A0","") ;
                saivianRemember.setSaivianId(Long.parseLong(saivianId));
                saivianRemember.setUserName(map.get(i).get(0).toString());
                saivianRemember.setLoginName(map.get(i).get(1).toString());
                saivianRemember.setLoginPassword(map.get(i).get(2).toString());
                saivianRemember.setTel(map.get(i).get(10).toString());
                saivianRemember.setEmail(map.get(i).get(3).toString());
                saivianRemember.setEmailPwd(map.get(i).get(4).toString());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
                saivianRemember.setRenewalDate(simpleDateFormat.parse(map.get(i).get(5).toString()));
                saivianRemember.setUserId(2l);
                SaivianRemember insert = saivianRememberService.insert(saivianRemember);
                System.out.println(insert.getId() + ":" + map.get(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("未找到指定路径的文件!");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    @Test
    public void saveSaivaianRemember() {
        try {
            String filepath = "/Users/xiaolitong/dev/workspace/web-newCjyl/TotalModule/src/test/resources/text.xlsx";
            ExcelTest excelReader = new ExcelTest(filepath);


            // 对读取Excel表格内容测试
            Map<Integer, Map<Integer, Object>> map = excelReader.readExcelContent();
            System.out.println("获得Excel表格的内容:");
            for (int i = 1; i <= map.size(); i++) {
                if (map.get(i).get(0) == "") {
                    continue;
                }
                SaivianRemember saivianRemember = new SaivianRemember();

                String saivianId = map.get(i).get(0).toString().replaceAll("\\u00A0","") ;
                saivianRemember.setSaivianId(Long.parseLong(saivianId));
                saivianRemember.setUserName(map.get(i).get(1).toString());
                saivianRemember.setLoginName(map.get(i).get(2).toString());
                saivianRemember.setLoginPassword(map.get(i).get(3).toString());
                saivianRemember.setTel(map.get(i).get(4).toString());
                saivianRemember.setEmail(map.get(i).get(5).toString());
                saivianRemember.setEmailPwd(map.get(i).get(6).toString());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
                saivianRemember.setRenewalDate(simpleDateFormat.parse(map.get(i).get(7).toString()));
                saivianRemember.setUserId(1l);
                SaivianRemember insert = saivianRememberService.insert(saivianRemember);
                System.out.println(insert.getId() + ":" + map.get(i));
            }
        } catch (FileNotFoundException e) {
            System.out.println("未找到指定路径的文件!");
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
