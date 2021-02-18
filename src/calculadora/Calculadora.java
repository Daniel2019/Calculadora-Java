
package calculadora;

public class Calculadora {
    // Atributos //
    private double numero1;
    private double numero2;
    private double resultado;
    
    // Métodos Especiais //
    public double getNumero1 (){
        return numero1;
    }
    
    public double getNumero2(){
        return numero2;
    } 
    
    public double getResultado(){
        return resultado;
    }
    
    public void setNumero1(String n1){
        if(n1.length() > 8){
            System.out.print("ERR");
            System.exit(0);
        }else{
            this.numero1 = Double.parseDouble(n1);
        }
       
    }
    
    public void setNumero2(String n2){
        if(n2.length() > 8){
            System.out.print("ERR");
            System.exit(0);
        }else{
            this.numero2 = Double.parseDouble(n2);
        }
    }
    
    public void setResultado(double r){
        this.resultado = r;
    }
    
    
    
    // Métodos Publicos // 
    public void somar(String num1, String num2){
        double r;
        this.setNumero1(num1);
        this.setNumero2(num2);
        r = this.getNumero1() + this.getNumero2();
        this.setResultado(r);
    }
    
    public void subtrair(String num1, String num2){
        double s;
        this.setNumero1(num1);
        this.setNumero2(num2);
        s = this.getNumero1() - this.getNumero2();
        this.setResultado(s);
    }
    
    public void dividir(String num1, String num2){
        double d;
        this.setNumero1(num1);
        this.setNumero2(num2);
        d = this.getNumero1() / this.getNumero2();
        this.setResultado(d);
    }
    
    public void multiplicar(String num1, String num2){
        double m;
        this.setNumero1(num1);
        this.setNumero2(num2);
        m = this.getNumero1() * this.getNumero2();
        this.setResultado(m);
    }
    
    public void limpar(){
        this.setNumero1("0");
        this.setNumero2("0");
        this.setResultado(0);
    }

}
