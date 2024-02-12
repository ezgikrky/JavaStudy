public class FileLogger extends Logger{

    @Override  // Üzerine yazmak. dosya kodunu yazmak için base class yani Logger class'taki kodu ezmemizi sağlado
    public void log(){
        System.out.println("File loglandı ");
    }
}
