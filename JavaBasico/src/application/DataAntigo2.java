package application;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Calendar;
import java.util.Date;

public class DataAntigo2 {
    public static void main(String[] args){
        //Somando uma unidade de tempo

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        Date d = Date.from(Instant.parse("2018-06-25T15:42:07Z"));

        System.out.println(sdf.format(d));

        Calendar cal = Calendar.getInstance();
        //calendario(cal) que esta com a data(d) instanciada dentro dele
        cal.setTime(d);
        cal.add(Calendar.HOUR_OF_DAY, 4);//acrescentar
        d = cal.getTime();//nova data atualizada

        System.out.println(sdf.format(d));
    }
}
