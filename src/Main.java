public class Main {
    public static void main(String[] args) {
    Empregado[]empregado=new Empregado[3];
    empregado[0]=new EmpregadoC(123, "a", 1000, 10 );
    empregado[1]=new EmpregadoH(456, "b", 200, 180);
    empregado[2]=new EmpregadoC(789, "c", 100, 10);


    for(Empregado e: empregado){
        System.out.println(e.getDados());
        System.out.println(e.calcularSalario());


    }


    }

}
