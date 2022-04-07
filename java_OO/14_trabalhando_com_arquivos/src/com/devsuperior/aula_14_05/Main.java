package com.devsuperior.aula_14_05;

import java.io.*;

public class Main {

    public static void main(String[] args) {
        String[] lines = new String[] { "Bom dia", "Boa tarde", "boa noite"};
        String path = "/home/renato/ESTUDOS/Bootcamps/devsuperior-bootcamp-spring/java_OO/out.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(path, true))){
            for(String line : lines) {
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
