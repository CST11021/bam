package cn.gov.zcy.paas.dto.statecode;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @author zhouzongku
 * @date 2018/10/15
 * @desc
 */
public class StateCode implements Serializable {

    private static final Map<Integer, StateCode> lookup = new HashMap();
    private Integer code;
    private String desc;

    public StateCode() {
    }

    public StateCode(Integer code, String desc) {
        this.code = code;
        this.desc = desc;
        if (code != null && lookup.put(code, this) != null) {
            throw new IllegalArgumentException(String.format("duplicated code[{0}]", new Object[]{code}));
        }
    }

    public static StateCode get(int code, Class<?> clazz) {
        register(clazz);
        StateCode stateCode = (StateCode) lookup.get(Integer.valueOf(code));
        if (stateCode == null) {
            throw new IllegalArgumentException(String.format("invalid code[{0}]", new Object[]{Integer.valueOf(code)}));
        } else {
            return stateCode;
        }
    }

    public static void register(Class<?> clazz) {
        try {
            Class.forName(clazz.getName());
        } catch (ClassNotFoundException var2) {
            throw new RuntimeException(var2);
        }
    }

    public static boolean is(int code, StateCode stateCode) {
        if (stateCode == null) {
            throw new IllegalArgumentException("stateCode is null");
        } else {
            return stateCode.equals(get(code, StateCode.class));
        }
    }

    public int getCode() {
        return this.code.intValue();
    }

    public String getDesc() {
        return this.desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (this.getClass() != obj.getClass()) {
            return false;
        } else {
            StateCode other = (StateCode) obj;
            return this.code.hashCode() == other.code.hashCode();
        }
    }

    @Override
    public int hashCode() {
        return this.code.hashCode();
    }

    @Override
    public String toString() {
        return String.format("{code:%d,desc:%s}", code, desc);
    }


}
