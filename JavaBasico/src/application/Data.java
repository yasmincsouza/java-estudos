package application;

import java.text.ParseException;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Data {
    public static void main(String[] args){
        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");//formatar de forma costumizada
        DateTimeFormatter fmt2 =  DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        LocalDate d01 = LocalDate.now(); //Pegar a data de agora
        LocalDateTime d02 = LocalDateTime.now(); //Pegar Data e hora de agora
        Instant d03 = Instant.now(); //Pega Data e hora de agora com o GMT(Fuso horario)

        LocalDate d04 = LocalDate.parse("2022-07-20"); //Pega um texto ISO 8601 e gera uma data-hora a partir dele
        LocalDateTime d05 = LocalDateTime.parse("2022-07-20T01:30:26"); //Pega um texto ISO 8601 e gera uma data-hora a partir dele
        Instant d06 = Instant.parse("2022-07-20T01:30:26Z"); //Pega Data e hora de agora no formato ISO 8601 com o GMT(Fuso horario)
        Instant d07 = Instant.parse("2022-07-20T01:30:26-03:00"); //Pega Data e hora de agora no formato ISO 8601 com o GMT(Fuso horario)

        // https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/time/format/DateTimeFormatter.html
        LocalDate d08 = LocalDate.parse("20/07/2022", fmt1); //formatado de forma específica como foi definido em fmt1/fmt2
        //OU LocalDate d08 = LocalDate.parse("20/07/2022", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", fmt2); //formatado de forma específica como foi definido em fmt1/fmt2
        //OU LocalDateTime d09 = LocalDateTime.parse("20/07/2022 01:30", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        LocalDate d10 = LocalDate.of(2022, 07, 20);
        LocalDateTime d11 = LocalDateTime.of(2022, 07, 20, 1, 30);

        //Por padrão o toString gera no formato texto ISO 8601
        System.out.println("d01 = " + d01.toString());
        System.out.println("d02 = " + d02.toString());
        System.out.println("d03 = " + d03.toString());
        System.out.println("d04 = " + d04.toString());
        System.out.println("d05 = " + d05.toString());
        System.out.println("d06 = " + d06.toString());
        System.out.println("d07 = " + d07.toString());
        System.out.println("d08 = " + d08.toString());
        System.out.println("d09 = " + d09.toString());
        System.out.println("d10 = " + d10.toString());
        System.out.println("d11 = " + d11.toString());
    }
}
