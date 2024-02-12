package interfaces;

public class Utils {

    public static void runLoggers(Logger[] loggers, String message){// sürekli foreach yazmamak için kullandığımız yapı araç görevi görüyor
                                                                    //CustomerManager'de new lememek için burada statik yaptık
        for (Logger logger: loggers){
            logger.log(message);
        }
    }
}


//for(Logger logger: loggers){
//  logger.log(customer.getFirstName());
//}

//normalde yukarıdaki gibi yazmıştık satır içini ama sonra loggers hata verdiği için Logger[] ı tanımladık ve customer da hata verdiği için String messag'ı tanımladık
//aşağıdaki gibi
//(Logger[] loggers, String message)