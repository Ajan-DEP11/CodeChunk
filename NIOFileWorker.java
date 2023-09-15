import java.io.IOException;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.attribute.BasicFileAttributes;

public class NIOFileWorker {
    public static void main(String[] args) {

        Path Targetpath = Paths.get("file111");
        Files.walkFileTree(Targetpath,new SimpleFileVisitor());

       
    }
}

class MysimpleFileVisitor extends SimpleFileVisitor<Path>{


    
    @Override
    public FileVisitResult postVisitDirectory(Path dir, IOException exc) throws IOException {
        
    }

    public FileVisitResult visitFile(Path file, BasicFileAttributes attars) throws IOException{
        System.out.println(file.toAbsolutePath());
        Files.delete(file);
        return FileVisitResult.CONTINUE;
    }


}
