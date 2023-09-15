import java.io.File;

public class IOFileWorker {
    public static void main(String[] args) {
        File targetfile = new File("file111");
        listDirectoryContent(targetfile);

        // File[] FilesList = targetfile.listFiles();

        // System.out.println(targetfile.getName() + "Content");
        // System.out.println("=======================================");

        // for(File file : FilesList){
        //     System.out.println((file.isDirectory() ? "Directory ": "File")+"-"+file.getAbsolutePath());
        // }
    }

    public static void listDirectoryContent(File directory){
        System.out.println(directory.getName() + "content");
        System.out.println("===============================");

     File[] listFiles2 = directory.listFiles();

                for(File file : listFiles2){
            System.out.println((file.isDirectory() ? "Directory ": "File")+"-"+file.getAbsolutePath());
            if(file.isDirectory())listDirectoryContent(file); //<---list file
            
        }


    }
}