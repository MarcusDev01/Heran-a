import java.text.DecimalFormat;

public class EmpregadoH extends Empregado{
    int totalDeHorasTrabalhadas;
    double valorDaHoraTrabalhada;



    public String getDados(){
        DecimalFormat df= new DecimalFormat("#,##0.00");
        String aux=super.getDados();
        aux+="Total de horas trabalhadas: "+totalDeHorasTrabalhadas+"\n";
        aux+="valor Da Hora Trabalhada:"+df.format(valorDaHoraTrabalhada)+"%\n";
        return aux;
    }

    public EmpregadoH(long matricula, String nome, int totalDeHorasTrabalhadas, double valorDaHoraTrabalhada) {
        super(matricula, nome);
        this.totalDeHorasTrabalhadas = totalDeHorasTrabalhadas;
        this.valorDaHoraTrabalhada = valorDaHoraTrabalhada;
    }

    public double calcularSalario(){


        return totalDeHorasTrabalhadas*valorDaHoraTrabalhada;
    }




}
