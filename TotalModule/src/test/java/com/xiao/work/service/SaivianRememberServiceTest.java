package com.xiao.work.service;

import SupportTest.SupportTest;
import com.github.pagehelper.Page;
import com.idea.cjyl.totalmodule.web.domain.pojo.ConsumptionRecord;
import com.idea.cjyl.totalmodule.web.domain.pojo.SaivianRemember;
import com.idea.cjyl.totalmodule.web.domain.pojo.Shop;
import com.idea.cjyl.totalmodule.web.service.ConsumptionRecordService;
import com.idea.cjyl.totalmodule.web.service.SaivianRememberService;
import com.idea.cjyl.totalmodule.web.service.ShopService;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.regex.Pattern;

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
    @Autowired
    private ShopService shopService;
    @Autowired
    private ConsumptionRecordService consumptionRecordService;

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
            String filepath = "/Users/xiaolitong/dev/workspace/web-newCjy2/TotalModule/src/test/resources/jt.xlsx";
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
                saivianRemember.setSaivianUserName(map.get(i).get(0).toString());
                saivianRemember.setSaivianLoginName(map.get(i).get(1).toString());
                saivianRemember.setSaivianLoginPassword(map.get(i).get(2).toString());
                saivianRemember.setTel(map.get(i).get(10).toString());
                saivianRemember.setEmail(map.get(i).get(3).toString());
                saivianRemember.setEmailPwd(map.get(i).get(4).toString());
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM/dd/yyyy");
                saivianRemember.setSaivianRenewalDate(simpleDateFormat.parse(map.get(i).get(5).toString()));
                saivianRemember.setServiceUserId(2l);
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
    public void random(){
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
            System.out.println( random.nextInt(2));
        }
    }

    @Test
    public void strsub(){
        String s = "123456789";
        System.out.println(s.substring(s.length()-4,s.length()));
    }

    @Test
    public void folder() throws ParseException {
        File file = new File("/Users/xiaolitong/赛比安公作/焦健工作/5月小票");
        Collection<File> files = listFiles(file);
        List<String> error = new ArrayList<>();
        Map<String,String> map = new HashMap<>();
        map.put("吕洪侠","吕洪侠");
        map.put("宋莹","宋莹");
        map.put("姜树利","姜树利");
        map.put("王荣","王荣");
        map.put("肖续珍","肖续珍");
        map.put("王洪英","王洪英");
        for (File file1 : files) {
            if(map.get(file1.getName())==null){
                continue;
            }
            File[] listFiles = file1.listFiles();
            if (listFiles != null) {
                for (File listFile : listFiles) {
                    if (listFile.isFile()) {

                        String fileName = listFile.getName();
                        if (fileName.indexOf(".docx") != -1 && fileName.indexOf("-") != -1) {
                            String[] fileNameArray = fileName.split("-");
                            String shpoName = fileNameArray[0].substring(0, fileNameArray[0].length() - 1);

                            String date = fileNameArray[0].substring(fileNameArray[0].length() - 1, fileNameArray[0].length()) +
                                    "-" + fileNameArray[1].substring(0, 2);
                            String s = fileNameArray[1].substring(2,fileNameArray[1].length());
                            StringBuffer money = new StringBuffer();
                            for (int i = 0; i < s.length(); i++) {
                                char item = s.charAt(i);
                                String ss = String.valueOf(item);

                                if (isNumeric(ss)) {
                                    money.append(ss);
                                    if (money.length() == 4) {
                                        break;
                                    }
                                }
                            }

                            ConsumptionRecord consumptionRecord = new ConsumptionRecord();
                            consumptionRecord.setConsumeMoney((Double.parseDouble(money.toString())/6.8097)+"");
                            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("MM-dd-yyyy");
                            Date parse = simpleDateFormat.parse(date + "-2017");
                            consumptionRecord.setConsumeDate(parse);
                            String fileName2 = file1.getName().substring(0,2);

                            List<SaivianRemember> byName = saivianRememberService.findByName("%"+fileName2+"%");
                            //获取所有商铺
                            Page<Shop> all = shopService.findAll(1, 1000);
                            List<Shop> shops = all.getResult();
                            for (Shop shop : shops) {
                                if(shop.getShopName().equals(shpoName)){
                                    consumptionRecord.setShopCode(shop.getShopCode());
                                }
                            }

                            try {

                                consumptionRecord.setUserSaivianId(byName.get(0).getId());
                                consumptionRecordService.insert(consumptionRecord);
                            }catch (Exception e){
                                error.add(file1.getName() + ":" + shpoName + ":" + date + ":" + money.toString());
                            }









                            System.out.println(file1.getName() + ":" + shpoName + ":" + date + ":" + money.toString());


                        }


                    }

                }
            }



        }
        for (String file2 : error) {
            System.out.println(file2+"error");
        }
    }
        @Test
        public void tocharArray(){
            String a = "asdasdsadas";
            char[] chars = a.toCharArray();
            for (int i = 0; i <chars.length ; i++) {
                String s = String.valueOf(chars[i]);
                System.out.println(s);
            }
        }


    public static boolean isNumeric(String str){
        Pattern pattern = Pattern.compile("[0-9]*");
        return pattern.matcher(str).matches();
    }
    static Collection<File> listFiles(File root){
        List<File> fileList = new ArrayList<>();
        File[] files = root.listFiles();
        for (File file : files) {
            fileList.add(file);
        }

        return fileList;
    }
    static void ListF(List<File> files,File dir){
        File[] listFiles = dir.listFiles();
    }


//    static void listFiles(Map<String,List<File>> map, File dir){
//        File[] listFiles = dir.listFiles();
//        for(File f: listFiles){
//            if(f.isFile()){
//                files.add(f);
//            }else if(f.isDirectory()){
//                listFiles(files, f);
//            }
//        }
//    }

}
