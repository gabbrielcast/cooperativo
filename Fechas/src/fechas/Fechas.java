package fechas;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.format.DateTimeFormatter;
import java.time.format.TextStyle;
import java.util.Locale;
import java.util.Scanner;

public class Fechas {

    public static void main(String[] args) {
        String pattern = "hh:mm a";
        DateTimeFormatter patron = DateTimeFormatter.ofPattern("dd.MMMM.yyyy");
        LocalDate fecha;
        LocalTime ahora = LocalTime.now();
        
        //Formato fechas
        DateTimeFormatter fechasPuntos = DateTimeFormatter.ofPattern("yyyy.MM.dd ");
        DateTimeFormatter patronEntrada = DateTimeFormatter.ofPattern("yyyy.MMMM.dd ");
         DateTimeFormatter fechaBarras = DateTimeFormatter.ofPattern("dd/MM/yy");
        
        //Formato horas
        DateTimeFormatter horaEstandar = DateTimeFormatter.ofPattern("H:m");
        DateTimeFormatter horaCompleta = DateTimeFormatter.ofPattern("H:m:ss:SS");
        do {
            Scanner sc = new Scanner(System.in);
            String fechaIntroducida = sc.nextLine().toLowerCase();
            try {
                fecha = LocalDate.parse(fechaIntroducida, patron);
                break;
            } catch (Exception e) {
                System.out.println("No se introdució la fecha con el formato correcto, acuerdate: (dd.MMMM.yyyy)");
            }
        } while (true);

        String diaAformatear = fecha.getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ES"));
        String diaFormateado = upperCaseFirst(diaAformatear);
        String mesAformatear = fecha.getMonth().getDisplayName(TextStyle.FULL, Locale.forLanguageTag("ES"));
        String mesFormateado = upperCaseFirst(mesAformatear);
        String minutosDosDigitos = String.format("%02d", ahora.getMinute() % 100);
        String horaFormat = ahora.format(DateTimeFormatter.ofPattern(pattern));
        String horaAMPM = upperLetters(horaFormat);
        String fechasFormateadas="\n"+diaFormateado + ", día " + fecha.getDayOfMonth() + " de " + mesFormateado + " del año " + fecha.getYear() + " y són las " + ahora.getHour() + ":" + ahora.getMinute()+"\n";
        fechasFormateadas+=fecha.format(fechaBarras)+"\n"
                +fecha.format(fechasPuntos) + ahora.format(horaCompleta) +"\n"
                +diaAformatear + ", " + mesFormateado.substring(0, 3) + " " + fecha.getDayOfMonth() + ", '" + minutosDosDigitos + "\n"
                +horaAMPM.substring(0, 6) + horaAMPM.charAt(6) + horaAMPM.charAt(9) + "\n"
                +fecha.format(patronEntrada) + ahora.format(horaEstandar) +"\n";
        
        System.out.println("\n<<FECHAS FORMATOS>>\n" + fechasFormateadas);
        System.out.println();
        System.out.println("<<OPERACIONES>>");
        System.out.println();
        LocalDate birth = LocalDate.parse("2001-01-28");
        LocalDate navidad = LocalDate.of(birth.getYear(), Month.DECEMBER, 25);
        LocalDate ahora2= LocalDate.now();

        long diasNavidad=navidad.toEpochDay()-birth.toEpochDay();
        System.out.println(birth.plusMonths(3).plusDays(10));
        System.out.println(birth.minusDays(20));
        System.out.println("Quedaban para navidad: " + diasNavidad );
        int difA = ahora2.getYear() - birth.getYear();
        int difM = difA * 12 + ahora2.getMonthValue() - birth.getMonthValue();
        System.out.println("Han pasado " + difM + " meses");
        
        System.out.println();
        System.out.println("<<FORMATER>>");
        System.out.println();
        
        //Formato bucle
        System.out.println("1 digito\t" + "2 digitos\t" + "abrieviado\t" + "completo");
        DateTimeFormatter dosDigitos = DateTimeFormatter.ofPattern("-> MM");
        DateTimeFormatter abreviado = DateTimeFormatter.ofPattern("-> MMM");
        DateTimeFormatter completo = DateTimeFormatter.ofPattern("-> MMMM");
        DateTimeFormatter unDigito = DateTimeFormatter.ofPattern("M");
        LocalDate inicio= LocalDate.parse("01.enero.2022", patron);
       
        for (int i = 0; i < 12; i++) {
           
            System.out.print(inicio.format(unDigito) + "\t"+ "\t");
            System.out.print(inicio.format(dosDigitos) + "\t" + "\t");
            System.out.print(inicio.format(abreviado) + "\t" + "\t");
            System.out.print(inicio.format(completo)  + "\t"+ "\t");
            System.out.println("");
            inicio=inicio.plusMonths(1);

        }
    }

    public static String upperCaseFirst(String val) {
        char[] arr = val.toCharArray();
        arr[0] = Character.toUpperCase(arr[0]);
        return new String(arr);

    }

    public static String upperLetters(String val) {
        char[] arr = val.toCharArray();
        arr[6] = Character.toUpperCase(arr[6]);
        arr[9] = Character.toUpperCase(arr[9]);
        return new String(arr);
    }
}
