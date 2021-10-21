package src;

import java.io.*;

/*Организовать параллельное копирование двух файлов.
Замерить примерное время выполнения кода.*/
public class CopyingFiles_3 {
    public static class copyParal extends Thread {
        String name;
        int priority;
        public copyParal(String name, int priority) {
            this.name = name;
            this.priority = priority;
        }
        @Override
        public void run() {
            Thread.currentThread().setPriority(priority);
            Thread.currentThread().setName(name);
            File fileOne = new File("C:\\Users\\polue\\IdeaProjects\\Projects\\src\\src\\files\\file_2_1.txt");
            File fileTwo = new File("C:\\Users\\polue\\IdeaProjects\\Projects\\src\\src\\files\\file_2_2.txt");
            File fileThree = new File("C:\\Users\\polue\\IdeaProjects\\Projects\\src\\src\\files\\file_2_3.txt");
            InputStream is = null;
            OutputStream os = null;
            OutputStream os1 = null;
            try {
                is = new FileInputStream(fileOne);
                os = new FileOutputStream(fileTwo);
                os1 = new FileOutputStream(fileThree);
                byte[] buffer = new byte[1024];
                int length;
                while ((length = is.read(buffer)) > 0) {
                    if(getName().equals("первое копирвание")){
                        os.write(buffer, 0, length);
                    }
                    else if(getName().equals("второе копирование")){
                        os1.write(buffer, 0, length);
                    }

                }
            } catch (IOException e) {
                e.printStackTrace();
            }
            finally {
                try {
                    is.close();
                    os.close();
                    os1.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        copyParal copyOne = (new copyParal("первое копирование", 5));
        copyParal copyTwo = (new copyParal("второе копирование", 5)) ;
        copyOne.start();
        copyTwo.start();
        long finish = System.currentTimeMillis();
        System.out.println(finish - start);
    }
}
}
