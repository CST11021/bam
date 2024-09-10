package cn.gov.zcy.paas.exception;

import cn.gov.zcy.paas.dto.statecode.StateCode;
import lombok.Getter;

/**
 * zcy平台自定义warn顶层异常类
 * <p>
 *     1：用于接入工具类异常统一处理
 *     2：如果各个应用需要定义自己的异常类，请继承该类。
 *          eg: 参数校验异常类：<code>ZcyParamValidationException</code>
 * </p>
 *
 * Created by zhouzongkun on 2018/5/9.
 */
public class ZcyCustomWarnException extends RuntimeException {

    @Getter
    private StateCode stateCode;

    public ZcyCustomWarnException(String msg, Exception e) {
        super(msg, e);
    }

    public ZcyCustomWarnException(StateCode stateCode, String msg, Exception e) {
        super(msg, e);
        this.stateCode = stateCode;
    }

    public static ZcyCustomWarnException instanceOf(StateCode stateCode) {
        return ZcyCustomWarnException.instanceOf(stateCode, null);
    }

    public static ZcyCustomWarnException instanceOf(StateCode stateCode, String msg) {
        return ZcyCustomWarnException.instanceOf(stateCode, msg, null);
    }

    public static ZcyCustomWarnException instanceOf(StateCode stateCode, String msg, Exception e) {
        return new ZcyCustomWarnException(stateCode, msg, e);
    }
}
