/**
 * 〈一句话功能简述〉<br>
 * 〈订单信息持久层〉
 *
 * @author hyz
 * @create 2018/11/26 0026
 * @since 1.0.0
 */
package com.wfb.manage.dao;

import com.wfb.framework.domain.market.*;
import com.wfb.framework.domain.market.vo.CompanyInfoVo;
import com.wfb.framework.domain.market.vo.CompanyVo;
import com.wfb.framework.domain.market.vo.ProductProviderVo;
import com.wfb.framework.domain.market.vo.ScCorporateCenterVo;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface ProductMapper {
    /**
     * 查询企业Vo类
     * @return 企业Vo
     */
    @Select("select DISTINCT c.companyID,c.companyName, c.credit from company c, productorder p where c.companyID = p.companyID ORDER BY p.createTime desc")
    List<CompanyVo> findCompanyVo();

    /**
     * 查询服务商Vo
     * @return 服务商Vo
     */
    @Select("select providerID,providerName,credit from productprovider")
    List<ProductProviderVo> findProviderVo();

    /**
     * 根据企业id查询订单
     * @param companyId 企业id
     * @return 订单
     */
    @Select("select * from productorder where companyID = #{companyID}")
    List<ProductOrder> findByCompanyId(@Param("companyID") Integer companyId);

    /**
     * 根据订单id查询订单追加信
     * @param orderId 订单id
     * @return 追加信
     */
    @Select("select * from productorderdetail where orderID = #{orderID}")
    ProductOrderDetail findDetailByOrderId(@Param("orderID") String orderId);

    /**
     * 根据产品id查询产品
     * @param productId 产品id
     * @return 产品
     */
    @Select("select * from product where productID = #{productID}")
    Product findByProductId(@Param("productID") Integer productId);

    /**
     * 根据服务商id查询服务商
     * @param providerId 服务商id
     * @return 服务商
     */
    @Select("select * from productprovider where providerID = #{providerID}")
    ProductProvider findProviderById(@Param("providerID") Integer providerId);

    /**
     * 根据订单id获得订单实体
     * @param orderId 订单id
     * @return 订单实体
     */
    @Select("select * from productorder where orderID = #{orderID}")
    ProductOrder findOrderByOrderId(@Param("orderID") String orderId);

    /**
     * 根据企业id获得企业实体
     * @param companyId 企业id
     * @return 企业实体
     */
    @Select("select * from company where companyID = #{companyID}")
    Company findCompanyByCompanyId(@Param("companyID") Integer companyId);

    /**
     * 根据订单id获得信用券实体
     * @param orderId 订单id
     * @return 信用券实体
     */
    @Select("select * from productcoupon where orderID = #{orderID}")
    ProductCoupon findCouponByOrderId(@Param("orderID") String orderId);

    /**
     * 查询审核状态
     * @param statusId 状态id
     * @return 状态
     */
    @Select("select statusName from productcouponstatus where statusID = #{statusID}")
    String findStatusName(@Param("statusID") String statusId);

    /**
     * @return 交易次数
     */
    @Select("select count(*) from productorder")
    Integer findDealCount();

    /**
     * @return 交易金额
     */
    @Select("select sum(fee) from productorder")
    Long findAmount();
    /**
     * @return 最大交易金额
     */
    @Select("select max(fee) from productorder")
    Integer findMaxAmount();

    /**
     * @return 最小交易金额
     */
    @Select("select min(fee) from productorder")
    Integer findMinAmount();

    /**
     * @return 信用券申请总次数
     */
    @Select("select count(1) from productcoupon")
    Integer findApplicationCount();

    /**
     * @return 折扣金额总数
     */
    @Select("select sum(discountMoney) from productcoupon")
    Integer findDiscountMoney();

    /**
     * @return 服务商兑现总次数
     */
    @Select("select count(1) from productcouponstatus p,(select pc.statusID from productprovider pp join productcoupon pc on pp.providerID = pc.providerID) ps where ps.statusID = p.statusID and p.statusName = '已核销'")
    Integer findChangeCount();

    /**
     * @return 服务商兑现总金额(已核销状态折扣金额)
     */
    @Select("select sum(ps.discountMoney) from productcouponstatus p,(select pc.discountMoney, pc.statusID from productprovider pp join productcoupon pc on pp.providerID = pc.providerID) ps where ps.statusID = p.statusID and p.statusName = '已核销'")
    Integer findChangeAmount();

    /**
     * @return 企业基本信息结果集
     */
    @Select("select id,corporate_name,state from sc_corporate_center")
    List<ScCorporateCenterVo> findScCorporateCenter();

    /**
     * @return 申报订单基本信息
     */
    @Select("select declare_policy_name,declare_no,declare_time from sc_company_info where company_id = #{companyId}")
    List<CompanyInfoVo> findCompanyInfo(@Param("companyId") String companyId);

    /**
     * 根据申报单号查询申报信息
     * @param declareNo 申报单号
     * @return 申报信息
     */
    @Select("select * from sc_company_info where declare_no = #{declareNo}")
    ScCompanyInfo findScCompanyByDeclareNo(@Param("declareNo") String declareNo);

    @Select("select * from company where companyName LIKE concat(concat('%',#{companyName}),'%')")
    List<Company> testHelper(@Param("companyName") String companyName);
}

