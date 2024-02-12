public class LogManager { //loglama işlerinin yapılacağı uer

    //Bunlara gerek yok suistimal etmiş oluruz bunu böyle yazmak yerine ayrı ayrı yazarız
    public void log(int logType){
        if(logType==1) {
            System.out.println("Veritabanı loglandı");
        } else if (logType==2) {
            System.out.println("Dosya loglandı");
        } else
            System.out.println("Email loglandı");
    }
}
