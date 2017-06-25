package com.idea.cjyl.totalmodule.web.controller.page;

import com.idea.cjyl.totalmodule.web.domain.Note;
import com.idea.cjyl.totalmodule.web.domain.ProductR;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * Created by horo on 2016/10/11.
 */
@Controller
@RequestMapping
public class RegisterPageController {
    @RequestMapping(value = "/{url}/{url2}")
    public String register(@PathVariable String url, @PathVariable String url2) {

        return url + "/" + url2;
    }

    @RequestMapping(value = "/{url}/{url2}/{url3}", method = RequestMethod.GET)
    public String register(@PathVariable String url,
                           @PathVariable String url2,
                           @PathVariable String url3,Model model) {
        Note note = new Note();
        note.setBankName("招商银行");
        note.setBankNum("666666666666666");
        note.setConsumeDate(new Date());
        note.setConsumeMoney(123.00);
        note.setConsumeNum("21312321312312");
        note.setEffectDate("00/00");
        note.setShopCode("jyb");
        note.setSwipeDate(new Date());
        note.setSwipeNum("12312321321321312");
        ProductR productR = new ProductR();
        productR.setProdutTotal(111.00);
        productR.setProductPrice(123.00);
        productR.setProductNum(1.0);
        productR.setDiscount(0.0);
        productR.setProductName("测试商品");
        List<ProductR> productRS = new ArrayList<>();
        productRS.add(productR);
        ProductR productR2 = new ProductR();
        productR2.setProductName("测试商品2");
        productR2.setProdutTotal(111.00);
        productR2.setProductPrice(123.00);
        productR2.setProductNum(1.0);
        productR2.setDiscount(0.0);
        productRS.add(productR2);
        note.setProducts(productRS);

        model.addAttribute("note",note);
        model.addAttribute("products",productRS);
        return url + "/" + url2 + "/" + url3;
    }

    @RequestMapping(value = "/{url}/{url2}/{url3}/{url4}", method = RequestMethod.GET)
    public String register(@PathVariable String url,
                           @PathVariable String url2,
                           @PathVariable String url3,
                           @PathVariable String url4) {


        return url + "/" + url2 + "/" + url3 + "/" + url4;
    }


    @ResponseBody
    @RequestMapping(value = "/mbs/{url}/index", method = RequestMethod.POST)
    public ModelAndView getMb(@PathVariable String url, Note note, String productList) {
        JSONArray jsonArray3 = JSONArray.fromObject(productList);
        List<ProductR> productRList = new ArrayList<>();

        for (Object o : jsonArray3) {
            Map<String, Object> map = (Map<String, Object>) o;
            System.out.println(map.get("discount"));
            ProductR productR = new ProductR();
            Integer discount = (Integer)map.get("discount");

            productR.setDiscount(discount.doubleValue());
            productR.setProductNum(Double.parseDouble(map.get("productNum").toString()));
            productR.setProductPrice(Double.parseDouble(map.get("productPrice").toString()));
            productR.setProdutTotal(Double.parseDouble(map.get("produtTotal").toString()));


            productR.setProductName(map.get("productName").toString());

            productRList.add(productR);
        }
        //Note note = new Note();
        note.setProducts(productRList);





            ModelAndView modelAndView = new ModelAndView("/mb/" + url + "/index", "note",
                    note);


        return modelAndView;
    }
}