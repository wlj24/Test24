package thread.ali.ThreadLocal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wlj on 2019/1/12.
 */
public class SimpleThreadLocal {
    private Map valueMap= Collections.synchronizedMap(new HashMap());
    public void set(Object newValue){
        //键为线程对象，值为本线程的变量副本
        valueMap.put(Thread.currentThread(),newValue);
    }
    public Object get(){
        Thread currentThread=Thread.currentThread();
        Object o=valueMap.get(currentThread); //返回本线程对应的变量
        if(o==null&&!valueMap.containsKey(currentThread)){//如果不存在，保存起来
            o=initialValue();
            valueMap.put(currentThread,o);
        }
        return o;
    }

    public Object initialValue(){
        return null;
    }

    public void remove(){
        valueMap.remove(Thread.currentThread());
    }
}
