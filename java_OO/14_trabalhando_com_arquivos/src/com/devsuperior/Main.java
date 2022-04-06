package com.devsuperior;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        File file = new File("/home/renato/ESTUDOS/Bootcamps/devsuperior-bootcamp-spring/java_OO/14_trabalhando_com_arquivos/in.txt");
        Scanner sc = null;

        try {
            sc = new Scanner(file);

            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (sc != null) {
                sc.close();
            }

        }
    }
}
