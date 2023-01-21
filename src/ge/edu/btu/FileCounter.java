package ge.edu.btu;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Objects;

public class FileCounter {
    public static int filesCount=0;
    public static void main(String[] args) {
        File file=new File("/Users/davitosadze/IdeaProjects/n2/src/ge/edu/BTU_DIRECTORY");
        String[] fileNames = file.list(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                String searchKey = "btu";
                if(name.toLowerCase().startsWith(searchKey.toLowerCase())) {
                    filesCount++;
                    return true;
                } else {
                    return false;
                }
            }
        });
    System.out.println(filesCount);
     }
}
