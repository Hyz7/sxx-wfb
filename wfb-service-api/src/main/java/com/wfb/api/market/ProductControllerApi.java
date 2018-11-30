/**
 * 〈一句话功能简述〉<br>
 * 〈交易信息〉
 *
 * @author hyz
 * @create 2018/11/26 0026
 * @since 1.0.0
 */
package com.wfb.api.market;

import com.wfb.framework.domain.market.response.*;
import com.wfb.framework.domain.vo.response.CompanyAndProviderVoResult;
import com.wfb.framework.domain.vo.response.ProductInformationVoResult;
import com.wfb.framework.domain.vo.response.TradeInformationVoResult;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Api(value="交易信息",description = "交易信息和申报信息的展示")
public interface ProductControllerApi {
    /**
     * @return 公司和服务商基本信息
     */
    @ApiOperation("展示交易信息:公司和服务商列表")
    CompanyAndProviderVoResult findCompanyAndProvider();

    /**
     * 根据企业id展示订单信息
     * @param companyID 企业id
     * @return 产品信息结果集
     */
    @ApiOperation("展示交易信息:订单信息")
    ProductInformationVoResult findProductList(Integer companyID);

    /**
     * 根据订单id查询交易信息
     * @param orderID 订单id
     * @return 交易信息结果集
     */
    @ApiOperation("展示交易信息:交易信息")
    TradeInformationVoResult findTrandeInformationList(String orderID);

    /**
     * 展示交易数据
     * @return 交易数据结果集
     */
    @ApiOperation("展示交易数据")
    TransactionDataResult findTransactionDataList();

    /**
     * @return 企业基本信息结果集
     */
    @ApiOperation("展示申报信息:企业列表")
    ScCorporateCenterVoResult findCorporateCenterList();

    /**
     * 根据企业id查询申报订单信息
     * @param companyId 企业Id
     * @return 申报订单信息结果集
     */
    @ApiOperation("展示申报订单信息")
    CompanyInfoResult findCompanyInfo(String companyId);
    /**
     * 根据申报单号查询申报信息
     * @param id 申报单号
     * @return 申报信息结果集
     */
    @ApiOperation("展示申报信息")
    ScCompanyInfoResult showConpanyInfoList(String id);

    /**
     * 根据企业id查询申报订单列表和申报信息详情
     * @param companyId 企业id
     * @return 申报信息列表结果集
     */
    @ApiOperation("展示申报订单列表和申报信息详情")
    DeclareInfoVoResult findDeclareInfoByCompanyId(String companyId);
}
