package sunyue;

import java.lang.reflect.Field;

public class FanShe2 {
    public void setpro(Object o,String filename,Object arg) throws NoSuchFieldException, IllegalAccessException {
        Class<?> aClass = o.getClass();
        Field declaredField = aClass.getDeclaredField(filename);
        declaredField.setAccessible(true);
        declaredField.set(o,arg);
    }
}
