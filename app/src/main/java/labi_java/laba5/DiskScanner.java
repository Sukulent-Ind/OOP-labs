package labi_java.laba5;

import java.io.File;
import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class DiskScanner {
    public static void main(String[] args) {
        List<String> docs = new ArrayList<>();
        
        // Получаем корневые диски (для Windows)
        File[] roots = File.listRoots();
        
        // Создаем FileVisitor для обработки файлов
        FileVisitor<Path> visitor = new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) {
                if (!attrs.isDirectory()) {
                    if (file.getFileName().toString().toLowerCase().endsWith(".txt")) docs.add(file.toAbsolutePath().toString());
                }
                return FileVisitResult.CONTINUE;
            }

            @Override
            public FileVisitResult visitFileFailed(Path file, IOException exc) {
                // Пропускаем файлы с ошибками доступа
                return FileVisitResult.CONTINUE;
            }
        };

        // Обходим каждый корневой диск
        for (File root : roots) {
            try {
                Files.walkFileTree(root.toPath(), visitor);
            } catch (IOException e) {
                System.err.println("Ошибка при обходе: " + root);
            }
        }

        // Сохраняем результаты в файл
        Path output = Paths.get("files.txt");
        try {
            Files.write(output, docs);
            System.out.println("Найдено файлов: " + docs.size());
            System.out.println("Результаты сохранены в: " + output.toAbsolutePath());
        } catch (IOException e) {
            System.err.println("Ошибка записи в файл: " + e.getMessage());
        }
    }
}