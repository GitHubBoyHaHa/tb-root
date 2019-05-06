package com.newyork;

public class JsonResult {

    private boolean success = true;

    private String msg = "操作成功";

    private Object object;
    public static JsonResult getMe(){

        return new JsonResult();
    }

    public Object getObject() {
        return object;
    }

    public JsonResult setObject(Object object) {
        this.object = object;
        return  this;
    }

    public boolean isSuccess() {
        return success;
    }

    public JsonResult setSuccess(boolean success) {
        this.success = success;
        return this;
    }

    public String getMsg() {
        return msg;
    }

    public JsonResult setMsg(String msg) {
        this.msg = msg;
        return this;
    }

    @Override
    public String toString() {
        return "JsonResult{" +
                "success=" + success +
                ", msg='" + msg + '\'' +
                ", object=" + object +
                '}';
    }
}
