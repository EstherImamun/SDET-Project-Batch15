package class24;
public abstract class File {

    int size;

    File(int size){
        this.size=size;
    }
    abstract void open();
    void edit(){
        System.out.println("editing the file");
    }
    void close(){
        System.out.println("Closing the file");
    }

}
class JavaFile extends File{

    public JavaFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("Opening the file in intelliJ");
    }

    @Override
    void edit() {
        System.out.println("Editing the file in IntelliJ");
    }
}
class WordFile extends File{

    public WordFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("Opening the file in Microsoft word");
    }
}
class PDFFile extends File{

    public PDFFile(int size) {
        super(size);
    }

    @Override
    void open() {
        System.out.println("Opening the file in Acrobat reader");
    }
}
