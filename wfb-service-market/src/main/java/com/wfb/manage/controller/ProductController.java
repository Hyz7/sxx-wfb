package com.wfb.manage.controller;

import com.wfb.api.market.ProductControllerApi;
import com.wfb.framework.domain.market.response.*;
import com.wfb.framework.domain.vo.response.CompanyAndProviderVoResult;
import com.wfb.framework.domain.vo.response.ProductInformationVoResult;
import com.wfb.framework.domain.vo.response.TradeInformationVoResult;
import com.wfb.manage.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br>
 * 〈交易信息〉
 *
 * @author hyz
 * @create 2018/11/26 0026
 * @since 1.0.0
 */
@RestController
@RequestMapping("/product")
public class ProductController implements ProductControllerApi {
    @Autowired
    private ProductService productService;

    @Override
    @GetMapping("/findAll")
    public CompanyAndProviderVoResult findCompanyAndProvider() {
        return productService.findCompanyAndProvider();
    }

    @Override
    @GetMapping("/productInformation")
    public ProductInformationVoResult findProductList(Integer companyID) {
        return productService.findProductList(companyID);
    }

    @Override
    @GetMapping("/findTrandeInformationList")
    public TradeInformationVoResult findTrandeInformationList(String orderID) {
        return productService.findTrandeInformationList(orderID);
    }

    @Override
    @GetMapping("/findTransactionDataList")
    public TransactionDataResult findTransactionDataList() {
        return productService.findTransactionDataList();
    }

    @Override
    @GetMapping("/findCorporateCenterList")
    public ScCorporateCenterVoResult findCorporateCenterList() {
        return productService.findCorporateCenterList();
    }

    @Override
    @GetMapping("/findCompanyInfo")
    public CompanyInfoResult findCompanyInfo(String companyId) {
        return productService.findCompanyInfo(companyId);
    }

    @Override
    @GetMapping("/showConpanyInfoList")
    public ScCompanyInfoResult showConpanyInfoList(String id) {
        return productService.showConpanyInfoList(id);
    }

    @Override
    @GetMapping("/findDeclareInfoByCompanyId")
    public DeclareInfoVoResult findDeclareInfoByCompanyId(String companyId) {
        return productService.findDeclareInfoByCompanyId(companyId);
    }

}
