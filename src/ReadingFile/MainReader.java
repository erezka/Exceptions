package ReadingFile;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Andrey_Vaganov on 12/5/2016.
 */
public class MainReader {

    /**
     * Формат даты
     */
    private static final String DATE_FORMAT_PATTERN = "dd.MM.yyyy";

    /**
     * Форматтер, используется для преобразования строк в даты и обратно
     */
    private static SimpleDateFormat dateFormatter = new SimpleDateFormat(DATE_FORMAT_PATTERN);


    /**
     * Точка входа в программу
     * @param args
     */
    public static void main(String[] args)  {
        try {
            readFile();
        } catch (TextReaderException e) {
            e.printStackTrace();
        }
    }

    /**
     * Метод для чтения дат из файла
     */
    public static void readFile()throws TextReaderException  {
        //Открываем потоки на чтение из файла
        try(FileReader reader = new FileReader("file.txt");
        BufferedReader byfReader = new BufferedReader(reader)) {

            //Читаем первую строку из файла
            String strDate = byfReader.readLine();
                while (strDate != null) {
                    //Преобразуем строку в дату
                    Date date = null;
                    try {
                        date = parseDate(strDate);
                    } catch (ParseException e) {
                        System.out.println("Пойман ParseException. Неверный формат даты.");
                    }
                    //Выводим дату в консоль в формате dd-mm-yy
                    System.out.printf("%1$td-%1$tm-%1$ty \n", date);

                    //Читаем следующую строку из файла
                    strDate = byfReader.readLine();
                }
        } catch (FileNotFoundException a){
            System.out.println("Попался FileNotFoundException" + " " + a);

        } catch (IOException e) {
            throw new TextReaderException("Попался IOException! Обработался через CustomException");
        }
    }

    /**
     * Метод преобразует строковое представление даты в класс Date
     * @param strDate строковое представление даты
     * @return
     */
    public static Date parseDate(String strDate) throws ParseException {
        return dateFormatter.parse(strDate);
    }
}

