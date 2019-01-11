package yousee.clouds.common.core.bean;

import java.util.HashMap;
import java.util.Map;


/**
 * 返回数据
 */
public class R extends HashMap<String, Object> {

    private static final long serialVersionUID = 1L;

    private R() {
        put("code", 0);
        put("msg", "");
        put("remark", "");
    }

    @Override
    public R put(String key, Object value) {
        super.put(key, value);
        return this;
    }

    public R data(Object obj) {
        if (obj != null) {
            super.put("data", obj);
        }
        return this;
    }

    public R remark(Object obj) {
        if (obj != null) {
            super.put("remark", obj);
        }
        return this;
    }

    // 成功
    public static R ok() {
        return ok(EStatus.SUCCESS);
    }

    public static R ok(String msg) {
        return ok(EStatus.SUCCESS.getKey(), msg);
    }

    public static R ok(EStatus status) {
        return ok(status.getKey(), status.getValue());
    }

    public static R ok(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }

    public static R ok(Map<String, Object> map) {
        R ok = ok(EStatus.SUCCESS);
        ok.putAll(map);
        return ok;
    }

    // 错误
    public static R error() {
        return error(EStatus.CODE_ERROR);
    }

    public static R error(String msg) {
        return error(EStatus.CODE_ERROR.getKey(), msg);
    }

    public static R error(EStatus status) {
        return error(status.getKey(), status.getValue());
    }

    private static R error(int code, String msg) {
        R r = new R();
        r.put("code", code);
        r.put("msg", msg);
        return r;
    }


}
