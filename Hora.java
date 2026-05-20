package tp03;

import java.util.Scanner;

/**
 *
 * @author henri
 */

public class Hora
{
    Scanner scanner = new Scanner(System.in);

    private int hora;
    private int min;
    private int seg;

    public Hora() {
        setHor();
        setMin();
        setSeg();
    }

    public Hora(int h, int m, int s) {
        setHor(h);
        setMin(m);
        setSeg(s);
    }


    public void setHor(int h){

        if (h >= 0 && h <= 23){
            hora = h;
        }
        else{
            System.out.println("Hora invalida!");
        }
    }

    public void setMin(int m){

        if (m >= 0 && m <= 59){
            min = m;
        }
        else{
            System.out.println("Minuto invalido!");
        }
    }

    public void setSeg(int s){

        if (s >= 0 && s <= 59){
            seg = s;
        }
        else{
            System.out.println("Segundo invalido!");
        }
    }


    public void setHor(){

        while (true){

            System.out.print("Digite as horas: ");

            if (scanner.hasNextInt()){

                int h = scanner.nextInt();

                if (h >= 0 && h <= 23){
                    hora = h;
                    break;
                }

                else{
                    System.out.println("Hora invalida. Digite novamente.");
                }
            }

            else{
                System.out.println("Entrada invalida. Digite um numero inteiro.");
                scanner.next();
            }
        }
    }

    public void setMin(){

        while (true){

            System.out.print("Digite os minutos: ");

            if (scanner.hasNextInt()){

                int m = scanner.nextInt();

                if (m >= 0 && m <= 59){
                    min = m;
                    break;
                }

                else{
                    System.out.println("Minuto invalido. Digite novamente.");
                }
            }

            else{
                System.out.println("Entrada invalida. Digite um numero inteiro.");
                scanner.next();
            }
        }
    }

    public void setSeg(){

        while (true){

            System.out.print("Digite os segundos: ");

            if (scanner.hasNextInt()){

                int s = scanner.nextInt();

                if (s >= 0 && s <= 59){
                    seg = s;
                    break;
                }

                else{
                    System.out.println("Segundo invalido. Digite novamente.");
                }
            }

            else{
                System.out.println("Entrada invalida. Digite um numero inteiro.");
                scanner.next();
            }
        }
    }

    public int getHor(){
        return hora;
    }

    public int getMin(){
        return min;
    }

    public int getSeg(){
        return seg;
    }


    public String getHora1(){

        return String.format("%02d:%02d:%02d", hora, min, seg);
    }


    public String getHora2(){

        int hora12;
        String periodo;

        if (hora == 0){
            hora12 = 12;
            periodo = "AM";
        }

        else if (hora < 12){
            hora12 = hora;
            periodo = "AM";
        }

        else if (hora == 12){
            hora12 = 12;
            periodo = "PM";
        }

        else{
            hora12 = hora - 12;
            periodo = "PM";
        }

        return String.format("%02d:%02d:%02d %s",
                hora12, min, seg, periodo);
    }


    public int getSegundos(){

        return (hora * 3600) + (min * 60) + seg;
    }
}
