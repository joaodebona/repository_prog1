import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.DayOfWeek;
import java.util.Calendar;

public class DataHumanizada {

    public static void main(String[] args) {
        System.out.println(obterDataHumanizada());
    }

    public static String obterDataHumanizada() {
        LocalDate hoje = LocalDate.now();
        DayOfWeek diaDaSemana = hoje.getDayOfWeek();
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'de' MMMM 'de' yyyy");
        String dataFormatada = hoje.format(formatter);
        
        Calendar calendar = Calendar.getInstance();
        int hora = calendar.get(Calendar.HOUR_OF_DAY);
        int minuto = calendar.get(Calendar.MINUTE);
        
        String[] diasDaSemana = {
            "domingo", "segunda-feira", "terça-feira", "quarta-feira", "quinta-feira",
            "sexta-feira", "sábado"
        };
        
        String nomeDiaSemana = diasDaSemana[diaDaSemana.getValue() - 1];
        
        return String.format("Hoje é %s, %s, e agora são %d horas e %d minutos.", nomeDiaSemana, dataFormatada, hora, minuto);
    }
}
