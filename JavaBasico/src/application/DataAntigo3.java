package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DataAntigo3 {
    public static void main(String[] args){
        //Obtendo uma unidade de tempo

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        cal.setTime(d);
        int minutes = cal.get(Calendar.MINUTE);//quantos minutos tem
        int month = 1 + cal.get(Calendar.MONTH);//qual o mês (foi acrescentado 1, pois no Calendar a contagem do mês começa no 0)

        System.out.println("Minutes: " + minutes);
        System.out.println("Month: " + month);
    }
}
