/*
 Создать класс, который может выполнять «тесты», в качестве тестов выступают 
классы с наборами методов с аннотациями @Test. Для этого у него должен быть
статический метод start(), которому в качестве параметра передается или 
объект типа Class, или имя класса. Из «класса-теста» вначале должен быть
запущен метод с аннотацией @BeforeSuite если такой имеется, далее запущены
методы с аннотациями @Test, а по завершению всех тестов – метод с 
аннотацией @AfterSuite. К каждому тесту необходимо также добавить приоритеты
(int числа от 1 до 10), в соответствии с которыми будет выбираться порядок 
их выполнения, если приоритет одинаковый то порядок не имеет значения.
Методы с аннотациями @BeforeSuite и @AfterSuite должны присутствовать в 
единственном экземпляре, иначе необходимо бросить RuntimeException при
запуске «тестирования».
 */
package j3hw7;

import java.io.File;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.net.URL;
import java.net.URLClassLoader;
//import static java.rmi.server.RMIClassLoader.loadClass;

/**
 *
 * @author Yuri Tveritin
 */
public class J3hw7 {   
   
    public static void main(String[] args) throws Exception {
        URL url=new File("d:/txt").toURL();//ссылка 
        URL[] f={url};//массив ссылок
        Class cc=URLClassLoader.newInstance(f).loadClass("Calc"); 
        Constructor constr=cc.getConstructor();//получить конструктор с определенными параметарми
        Object calc=constr.newInstance();//создать объект из конструктора
        Method m=cc.getMethod("mult");
        m.invoke(calc);//запустить метод для объекта 
        //вопрос как передать в медод параметры??? В процессе исполнения ошибка:(
       // до аннотаций не дошел
        
        
        
    }
    
}
