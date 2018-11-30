package com.wfb.manage.service;

import com.wfb.framework.domain.market.*;
import com.wfb.framework.domain.market.response.*;
import com.wfb.framework.domain.market.vo.*;
import com.wfb.framework.domain.vo.CompanyAndProviderVo;
import com.wfb.framework.domain.vo.ProductInformationVo;
import com.wfb.framework.domain.vo.TradeInformationVo;
import com.wfb.framework.domain.vo.response.CompanyAndProviderVoResult;
import com.wfb.framework.domain.vo.response.ProductInformationVoResult;
import com.wfb.framework.domain.vo.response.TradeInformationVoResult;
import com.wfb.framework.model.response.CommonCode;
import com.wfb.manage.dao.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 〈一句话功能简述〉<br>
 * 〈交易信息业务层〉
 *
 * @author hyz
 * @create 2018/11/26 0026
 * @since 1.0.0
 */
@Service
public class ProductService {
    @Autowired
    private ProductMapper productMapper;

    /**
     * @return 企业和服务器基本信息
     */
    public CompanyAndProviderVoResult findCompanyAndProvider() {
        // 查询companyVo列表
        List<CompanyVo> companyVos = productMapper.findCompanyVo();
        // 查询providerVo列表
        List<ProductProviderVo> productProviderVos = productMapper.findProviderVo();
        // =========由于星级目前没有数据,所以没有星级的临时设置为1==========
        for (CompanyVo companyVo : companyVos) {
            if (companyVo.getCredit() == 0){
                companyVo.setCredit(1);
            }
        }
        for (ProductProviderVo productProviderVo : productProviderVos) {
            if (productProviderVo.getCredit() == 0){
                productProviderVo.setCredit(1);
            }
        }
        // 返回Vo类
        CompanyAndProviderVo companyAndProviderVo = new CompanyAndProviderVo();
        companyAndProviderVo.setCompany(companyVos);
        companyAndProviderVo.setProductProvider(productProviderVos);
        return new CompanyAndProviderVoResult(CommonCode.SUCCESS,companyAndProviderVo);
    }

    /**
     * 根据企业id展示产品信息
     * @param companyID 企业id
     * @return 产品信息结果集
     */
    public ProductInformationVoResult findProductList(Integer companyID) {
        if (companyID == null){
            return new ProductInformationVoResult(CommonCode.FAIL,null);
        }
        // 创建集合保存结果集
        List<ProductInformationVo> resultList = new ArrayList<>();
        List<ProductOrder> orders = productMapper.findByCompanyId(companyID);
        for (ProductOrder order : orders) {
            // 创建展示信息实体
            ProductInformationVo productInformationVo = new ProductInformationVo();
            // 获取订单号
            String orderID = order.getOrderID();
            // 保存订单id
            productInformationVo.setOrderID(orderID);
            // 保存交易时间
            productInformationVo.setCreateTime(order.getCreateTime());
            // 根据订单号得到产品id和交易金额
            ProductOrderDetail productOrderDetail = productMapper.findDetailByOrderId(orderID);
            Integer productID = productOrderDetail.getProductID();
            // 保存价格
            productInformationVo.setPrice(productOrderDetail.getPrice());
            // 根据产品id获得产品
            Product product = productMapper.findByProductId(productID);
            // 保存产品名
            productInformationVo.setProductName(product.getProductName());
            // 获得服务商id
            Integer providerID = product.getProviderID();
            // 获得服务商名称
            ProductProvider provider = productMapper.findProviderById(providerID);
            productInformationVo.setProviderName(provider.getProviderName());
            resultList.add(productInformationVo);
        }

        return new ProductInformationVoResult(CommonCode.SUCCESS,resultList);
    }

    /**
     * 根据订单id得到交易信息结果集
     * @param orderID 订单id
     * @return 交易信息结果集
     */
    public TradeInformationVoResult findTrandeInformationList(String orderID) {
        if (orderID == null){
            return new TradeInformationVoResult(CommonCode.FAIL,null);
        }
        // 创建交易信息vo类
        TradeInformationVo tradeInformationVo = new TradeInformationVo();
        // 根据订单id获得订单实体
        ProductOrder order = productMapper.findOrderByOrderId(orderID);
        // -保存订单号,交易时间
        tradeInformationVo.setOrderID(orderID);
        tradeInformationVo.setOrderCreateTime(order.getCreateTime());
        // -保存交易金额
        ProductOrderDetail detail = productMapper.findDetailByOrderId(orderID);
        tradeInformationVo.setPrice(detail.getPrice());
        // -保存产品名称
        Integer productID = detail.getProductID();
        Product product = productMapper.findByProductId(productID);
        tradeInformationVo.setProductName(product.getProductName());
        // 获得企业id
        Integer companyID = order.getCompanyID();
        // 获得企业
        Company company = productMapper.findCompanyByCompanyId(companyID);
        // -保存企业名,注册时间,注册电话,星级,信用券状态
        tradeInformationVo.setCompanyName(company.getCompanyName());
        tradeInformationVo.setRegisterDate(company.getRegisterDate());
        tradeInformationVo.setOwnerMobile(company.getOwnerMobile());
        tradeInformationVo.setIsUse(order.getIsUse());
        // ====由于星级目前没数据,所以如果为0全部设置为1
        if (company.getCredit() == 0){
            tradeInformationVo.setCompanyCredit(1);
        }else {
            tradeInformationVo.setCompanyCredit(company.getCredit());
        }
        // 获得服务商
        Integer providerID = product.getProviderID();
        ProductProvider provider = productMapper.findProviderById(providerID);
        // -保存服务商名称,注册时间,注册电话,星级,信用券状态
        tradeInformationVo.setProviderName(provider.getProviderName());
        tradeInformationVo.setProviderCreateTime(provider.getCreateDate());
        tradeInformationVo.setProviderRegistPhone(company.getOwnerMobile());
        // ====由于星级目前没数据,所以如果为0全部设置为1
        if (provider.getCredit() == 0){
            tradeInformationVo.setProviderCredit(1);
        }else {
            tradeInformationVo.setProviderCredit(provider.getCredit());
        }
        tradeInformationVo.setProviderStatus("已兑现");
        // 根据订单id获得信用券
        ProductCoupon coupon = productMapper.findCouponByOrderId(orderID);
        // -保存信用券申领时间,兑现时间,审核时间,编号,发放时间
        if (coupon == null){
            tradeInformationVo.setCompanyCouponCreateTime(new Date());
            tradeInformationVo.setProviderCouponCreateTime(new Date());
            tradeInformationVo.setAuditTime(new Date());
            tradeInformationVo.setCouponID("181025142410441");
            tradeInformationVo.setCouponCreateTime(new Date());
        }else {
            tradeInformationVo.setCompanyCouponCreateTime(coupon.getCreateTime());
            tradeInformationVo.setProviderCouponCreateTime(coupon.getCreateTime());
            tradeInformationVo.setAuditTime(order.getStatusTime());
            tradeInformationVo.setCouponID(coupon.getCouponID());
            tradeInformationVo.setCouponCreateTime(coupon.getCreateTime());
        }
        // 根据order表中statusId查询并保存审核状态
        String statusName = productMapper.findStatusName(order.getStatusID().toString());
        tradeInformationVo.setStatusName(statusName);

        return new TradeInformationVoResult(CommonCode.SUCCESS,tradeInformationVo);
    }

    /**
     * @return 交易数据
     */
    public TransactionDataResult findTransactionDataList() {
        // 创建交易信息实体
        TransactionData transactionData = new TransactionData();
        // 保存交易次数
        transactionData.setDealCount(productMapper.findDealCount());
        // 保存交易金额
        transactionData.setAmount(productMapper.findAmount());
        // 保存信用券申请总次数
        transactionData.setApplicationCount(productMapper.findApplicationCount());
        // 保存折扣金额总数
        transactionData.setDiscountMoney(productMapper.findDiscountMoney());
        // 保存服务商兑现总次数
        transactionData.setChangeCount(productMapper.findChangeCount());
        // 保存服务商兑现总金额
        if (null == productMapper.findChangeAmount()){
            transactionData.setChangeAmount(0);
        }else {
            transactionData.setChangeAmount(productMapper.findChangeAmount());
        }
        // 保存最大单笔交易金额
        transactionData.setMaxAmount(productMapper.findMaxAmount());
        // 保存最小单笔交易金额
        transactionData.setMinAmount(productMapper.findMinAmount());
        return new TransactionDataResult(CommonCode.SUCCESS,transactionData);
    }

    /**
     * 查询申报信息的企业基本信息
     * @return 企业基本信息结果集
     */
    public ScCorporateCenterVoResult findCorporateCenterList() {
        // 获得基本信息
        List<ScCorporateCenterVo> scCorporateCenterVos = new ArrayList<>();
        try {
            scCorporateCenterVos = productMapper.findScCorporateCenter();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new ScCorporateCenterVoResult(CommonCode.SUCCESS,scCorporateCenterVos);
    }

    /**
     * 根据企业id查询申报订单信息
     * @param companyId 企业Id
     * @return 申报订单信息结果集
     */
    public CompanyInfoResult findCompanyInfo(String companyId) {
        if (companyId == null){
            return new CompanyInfoResult(CommonCode.FAIL,null);
        }
        List<CompanyInfoVo> companyInfo = productMapper.findCompanyInfo(companyId);
        return new CompanyInfoResult(CommonCode.SUCCESS,companyInfo);
    }

    /**
     * 根据申报单号查询申报信息
     * @param id 申报单号
     * @return 申报信息结果集
     */
    public ScCompanyInfoResult showConpanyInfoList(String id) {
        if (id == null){
            return new ScCompanyInfoResult(CommonCode.FAIL,null);
        }
        // 创建结果集
        ScCompanyInfo scCompanyInfos = productMapper.findScCompanyByDeclareNo(id);
        return new ScCompanyInfoResult(CommonCode.SUCCESS,scCompanyInfos);
    }

    /**
     * 根据企业id查询申报订单列表和申报信息详情
     * @param companyId 企业id
     * @return 申报信息列表结果集
     */
    public DeclareInfoVoResult findDeclareInfoByCompanyId(String companyId) {
        if (companyId == null){
            return new DeclareInfoVoResult(CommonCode.FAIL,null);
        }
        // 根据企业id查询申报订单列表
        List<CompanyInfoVo> companyInfo = productMapper.findCompanyInfo(companyId);
        String declareNo = companyInfo.get(0).getDeclareNo();
        ScCompanyInfo scCompanyInfo = productMapper.findScCompanyByDeclareNo(declareNo);
        // 创建申报列表信息实体
        DeclareInfoVo declareInfoVo = new DeclareInfoVo();
        declareInfoVo.setCompanyInfo(scCompanyInfo);
        declareInfoVo.setCompanyInfoVos(companyInfo);
        return new DeclareInfoVoResult(CommonCode.SUCCESS,declareInfoVo);
    }
}
