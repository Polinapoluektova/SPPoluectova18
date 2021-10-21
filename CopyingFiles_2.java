package src;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;

/* Организовать последовательное копирование двух файлов.
Замерить примерное время выполнения кода.*/
public class CopyingFiles_2 {
    static class files {
        Path input;
        Path output;

        public files(String way) {
        }

        public files(files file_1, files file_2) throws IOException{
            Path copying = Files.copy(
                    new File(String.valueOf(file_1)).toPath(),
                    new File(String.valueOf(file_2)).toPath(),
                    StandardCopyOption.REPLACE_EXISTING,
                    StandardCopyOption.COPY_ATTRIBUTES,
                    LinkOption.NOFOLLOW_LINKS);
            System.out.println(copying);
        }
    }

    public void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        files file_1 = new files("C:\\Users\\polue\\IdeaProjects\\Projects\\src\\src\\files\\file_2_1.txt");
        files file_2 = new files("C:\\Users\\polue\\IdeaProjects\\Projects\\src\\src\\files\\file_2_2.txt");
        files file_3 = new files("C:\\Users\\polue\\IdeaProjects\\Projects\\src\\src\\files\\file_2_3.txt");
        files file_4 = new files("C:\\Users\\polue\\IdeaProjects\\Projects\\src\\src\\files\\file_2_4.txt");

        Path copying = Files.copy(
                new File(String.valueOf(file_1)).toPath(),
                new File(String.valueOf(file_2)).toPath(),
                StandardCopyOption.REPLACE_EXISTING,
                StandardCopyOption.COPY_ATTRIBUTES,
                LinkOption.NOFOLLOW_LINKS);
        System.out.println(copying);

        System.out.println(new files(file_1, file_2));
        System.out.println(new files(file_3, file_4));

        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }
}
