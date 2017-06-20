package com.idea.cjyl.totalmodule.web.controller.page;

import com.idea.cjyl.totalmodule.web.domain.Note;
import com.idea.cjyl.totalmodule.web.domain.ProductR;
import net.sf.json.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
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
    public String register(@PathVariable String url, @PathVariable String url2, @PathVariable String url3) {

        return url + "/" + url2 + "/" + url3;
    }

    @RequestMapping(value = "/{url}/{url2}/{url3}/{url4}", method = RequestMethod.GET)
    public String register(@PathVariable String url, @PathVariable String url2, @PathVariable String url3, @PathVariable String url4) {

        return url + "/" + url2 + "/" + url3 + "/" + url4;
    }


    @ResponseBody
    @RequestMapping(value = "/mb/{url}/index", method = RequestMethod.POST)
    public ModelAndView getMb(@PathVariable String url, Note note, String productList) {
        JSONArray jsonArray3 = JSONArray.fromObject(productList);
        List<ProductR> productRList = new ArrayList<>();

        for (Object o : jsonArray3) {
            Map<String, Object> map = (Map<String, Object>) o;
            System.out.println(map.get("discount"));
            ProductR productR = new ProductR();
            Integer discount = (Integer)map.get("discount");

            productR.setDiscount(discount.doubleValue());
            productR.setProductNum(Double.parseDouble(map.get("productNum")+".00"));
            productR.setProductPrice(Double.parseDouble(map.get("productPrice")+".00"));
            productR.setProdutTotal(Double.parseDouble(map.get("produtTotal")+".00"));


            productR.setProductName(map.get("productName").toString());
            //ProductR productR = (ProductR) o;
            productRList.add(productR);
        }
        //Note note = new Note();
        note.setProducts(productRList);

            ModelAndView modelAndView = new ModelAndView("/mb/" + url + "/index", "note",
                    note);


        return modelAndView;
    }
}