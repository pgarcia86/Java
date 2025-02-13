import logger.Logger;

public class main {
    public static void main(String[] args) throws Exception {
        Logger logger1 = Logger.getInstance();
        Logger logger2 = Logger.getInstance();

        logger1.log("mensaje 1");
        logger2.log("mensaje 2");

        System.out.println(logger1 == logger2);
    }
}
