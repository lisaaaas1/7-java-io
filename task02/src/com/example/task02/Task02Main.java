package com.example.task02;

import java.io.IOException;

public class Task02Main {
    public static void main(String[] args) throws IOException {
        // чтобы протестировать свое решение, вам нужно:
        // - направить файл input.test в стандартный ввод программы (в настройках запуска программы в IDE или в консоли)
        // - направить стандартный вывод программы в файл
        // - запустить программу
        // - и сравнить получившийся файл с expected.test
        int currentByte;
        int nextByte;

        currentByte = System.in.read();

        while (currentByte != -1) {
            nextByte = System.in.read();

            if (currentByte == 13 && nextByte == 10) {
                currentByte = nextByte;
                continue;
            }

            System.out.write(currentByte);

            currentByte = nextByte;
        }

        System.out.flush();
    }
}
