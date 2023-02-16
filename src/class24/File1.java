 package class24;

 public abstract class File1 {
    
    public abstract void open();
    
    public void edit(){
        System.out.println("Editing file...");
    }
    public void close(){
        System.out.println("closing file");
    }
    
}
class JavaFile1 extends File1{
    @Override
    public void open() {
        System.out.println("To open JavaFile, we need IntelliJ");
    }
}
class WordFile1 extends File1{
    @Override
    public void open() {
        System.out.println("To open Word File, we need Microsoft Word..");
    }
}
class PdfFile1 extends File1{
    @Override
    public void open() {
        System.out.println("To open Pdf File, we need Microsoft 365...");
    }
    
}
