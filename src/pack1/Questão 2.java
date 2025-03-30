import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class CalculadoraTempo {
    public static void contaTempo(int dia, int mes, int ano) {
        LocalDate dataFutura = LocalDate.of(ano, mes, dia);
        LocalDate dataAtual = LocalDate.now();
        
        if (dataFutura.isBefore(dataAtual)) {
            System.out.println("Essa data já passou...");
            return;
        }
        
        Period periodo = Period.between(dataAtual, dataFutura);
        
        String anos = periodo.getYears() == 1 ? "1 ano" : periodo.getYears() + " anos";
        String meses = periodo.getMonths() == 1 ? "1 mês" : periodo.getMonths() + " meses";
        String dias = periodo.getDays() == 1 ? "1 dia" : periodo.getDays() + " dias";
        
        System.out.printf("Falta%s %s, %s e %s para o dia %s. Mal podemos esperar!%n",
                          periodo.getYears() == 0 ? "m" : "", anos, meses, dias,
                          dataFutura.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
    }

    public static void main(String[] args) {
        contaTempo(15, 12, 2026); 
    }
}