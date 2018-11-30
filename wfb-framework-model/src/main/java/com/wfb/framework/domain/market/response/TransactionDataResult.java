package com.wfb.framework.domain.market.response;

import com.wfb.framework.domain.market.ScCompanyInfo;
import com.wfb.framework.domain.market.vo.TransactionData;
import com.wfb.framework.model.response.ResponseResult;
import com.wfb.framework.model.response.ResultCode;
import lombok.Data;

/**
 * 〈一句话功能简述〉<br>
 * 〈交易数据结果集〉
 *
 * @author hyz
 * @create 2018/11/28 0028
 * @since 1.0.0
 */
@Data
public class TransactionDataResult extends ResponseResult {
    TransactionData transactionData;

    public TransactionDataResult(ResultCode resultCode, TransactionData transactionData) {
        super(resultCode);
        this.transactionData = transactionData;
    }
}
