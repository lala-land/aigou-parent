package cn.itsource.common;

public class AjaxReslut {
    private Boolean success =true;
    private String msg="成功";
    private Object object=null; //返回的数据

    public static AjaxReslut getMe(){
        return new AjaxReslut();
    }

    public Boolean getSuccess() {
        return success;
    }

    public AjaxReslut setSuccess(Boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public AjaxReslut setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    public Object getObject() {
        return object;
    }

    public AjaxReslut setObject(Object object) {
        this.object = object;
        return this;
    }
}
