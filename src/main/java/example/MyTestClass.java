package example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//public class MyTestClass {
//    private static final Logger LOGGER = LoggerFactory.getLogger(MyTestClass.class);
//
//    public static void main(String[] args) {
//        LOGGER.info("Начало работ программы");
//        try {
//            LOGGER.warn("Программапытается разделить два числа");
//            System.out.println(12 / 0);
//        } catch (ArithmeticException e) {
//            LOGGER.error("Произошло деление на ноль!");
//
//        }
//    }
//}

public class MyTestClass {

    public static final Logger LOGGER = LoggerFactory.getLogger(MyTestClass.class);

    public static void main(String[] args) {

        LOGGER.info("Test log record!!!");
        LOGGER.error("В программе возникла ошибка!");
    }
}
