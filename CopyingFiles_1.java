package src;
/*Реализовать копирование текстового файла с
заданным именем в текстовый файл по указанному пути.*/

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

public class CopyingFiles_1 {
    static class files {
        FileInputStream input;
        FileOutputStream output;

        public void Setfiles(FileInputStream input, FileOutputStream output) {
            this.input = input;
            this.output = output;
        }

        public files(String way) {
        }

        public files(CopyingFiles_2.files file_1, CopyingFiles_2.files file_2) throws IOException{
            Path copying = Files.copy(
                    new File(String.valueOf(file_1)).toPath(),
                    new File(String.valueOf(file_2)).toPath(),
                    StandardCopyOption.REPLACE_EXISTING,
                    StandardCopyOption.COPY_ATTRIBUTES,
                    LinkOption.NOFOLLOW_LINKS);
            System.out.println(copying);
        }
    }
    public static void main(String[] args) throws IOException {
        Path file_1 = Path.of("C:\\Users\\polue\\IdeaProjects\\Projects\\src\\src\\file_1_1.txt");
        Path file_2 = Path.of("C:\\Users\\polue\\IdeaProjects\\Projects\\src\\src\\file_1_2.txt");
        CopyingFiles_2.files file_3 = new CopyingFiles_2.files("C:\\Users\\polue\\IdeaProjects\\Projects\\src\\src\\files\\file_2_3.txt");
        CopyingFiles_2.files file_4 = new CopyingFiles_2.files("C:\\Users\\polue\\IdeaProjects\\Projects\\src\\src\\files\\file_2_4.txt");

        Path copying = Files.copy(
                new File(String.valueOf(file_1)).toPath(),
                new File(String.valueOf(file_2)).toPath(),
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES,
                LinkOption.NOFOLLOW_LINKS);
        System.out.println(copying);
    }
}