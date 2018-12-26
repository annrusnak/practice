package utils;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class CSVReader {
    public static String read(String key) {
        String csvFile = "D:\\projects\\practice_Rusnak\\src\\main\\resources\\params.csv";
        String line = "";
        String cvsSplitBy = ",";
        String result = null;

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            while ((line = br.readLine()) != null) {
                String[] param = line.split(cvsSplitBy);
                if (param[0].equals(key)) {
                    result = param[1];
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

}
