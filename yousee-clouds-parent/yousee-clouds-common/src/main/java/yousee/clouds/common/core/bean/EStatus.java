package yousee.clouds.common.core.bean;

/**
 * 状态码枚举
 *
 * @author NO.9
 */
public enum EStatus {

    // 成功状态200起
    SUCCESS(200, "操作成功"),
    LOGIN_SUCCESS(200, "登录成功"),
    LOGINOUT_SUCCESS(200, "注销成功"),

    // 业务层面的问题300起
    EXCEPTION(300, "操作异常"),
    LOGIN_EXCEPTION(301, "登录失败"),
    OFF_LINE_EXCEPTION(302, "用户没有登录"),
    ROLE_EXCEPTION(303, "用户没有权限"),

    SMSCODE_EXCEPTION(304, "短信验证码不正确"),
    REGISTER_EXCEPTION(305, "用户尚未注册"),
    THIRD_EXCEPTION(306, "未绑定第三方"),
    SUCCESS_REGISTER_EXCEPTION(307, "用户已经注册"),

    // 资源方面的异常400起
    SOURCE_ERROR(400, "资源不存在"),
    SOURCE_FILE_ERROR(402, "文件不存在"),

    // 代码层面的错误500起
    CODE_ERROR(500, "服务器异常");

    private final int key;
    private final String value;

    EStatus(int key, String value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }
}
