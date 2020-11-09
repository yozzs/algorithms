package com.yozzs.algorithms.pattern.listener;

public class CurdEvent implements ICurdEvent {
    private IListenerable eventSource;  //事件源
    private String methodname;          //事件源所执行的方法名称
    public CurdEvent(IListenerable eventSource,String methodname){
        super();
        this.eventSource = eventSource;
        this.methodname = methodname;
    }
    @Override
    public IListenerable getEventSource() {
        return eventSource;
    }
    //根据事件源所执行的不同的方法返回不同的事件类型
    @Override
    public String getEventType() {
        String eventType = null;
        if (methodname.startsWith("save")){
            eventType = Create_EVENT;
        }else if (methodname.startsWith("remove")){
            eventType = Delete_EVENT;
        }else if (methodname.startsWith("modify")){//修改
            eventType = Update_EVENT;
        }else if (methodname.startsWith("find")){
            eventType = Retrieve_EVENT;
        }else {
            eventType = "have not this event type";
        }
        return eventType;
    }
}