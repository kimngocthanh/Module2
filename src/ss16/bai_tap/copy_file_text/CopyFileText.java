package ss16.bai_tap.copy_file_text;

import java.util.ArrayList;
import java.util.List;

public class CopyFileText {
    public static String CopyFile(List<String> strings ){
        for (String string : strings) {
            System.out.println(string);
        }
        return null;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<String> strings = readAndWriteFile.readFile("src/ss16/bai_tap/copy_file_text/SourceFile.txt");
        CopyFile(strings);
        readAndWriteFile.writeFile("src/ss16/bai_tap/copy_file_text/TargetFile.txt", strings);

    }
}
