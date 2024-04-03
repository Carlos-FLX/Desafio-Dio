import java.util.Scanner;
import javax.swing.JOptionPane;
public class DesafioJava {
    public static void main(String[] args) throws Exception {
        String nomeHeroi = JOptionPane.showInputDialog(null, "Digite o nome do herói: ");
        JOptionPane.showMessageDialog(null,nomeHeroi);

        int xpHeroi = 9001;
        int xpVitoria = 100;
        String nivel;
                
        for(int i = 1; i <=10; i++){
            xpHeroi += xpVitoria;
        }

        if(xpHeroi<=1000){
            nivel = "Ferro";
            JOptionPane.showMessageDialog(null,"O herói " + nomeHeroi + " está no nível: " + nivel);
        }
        else if (xpHeroi>=1001 && xpHeroi<=2000) {
            nivel = "Bronze";
            JOptionPane.showMessageDialog(null,"O herói " + nomeHeroi + " está no nível: " + nivel);
        }
        else if (xpHeroi>=2001 && xpHeroi<=5000) {
            nivel = "Prata";
            JOptionPane.showMessageDialog(null,"O herói " + nomeHeroi + " está no nível: " + nivel);
        }
        else if (xpHeroi>=5001 && xpHeroi<=7000) {
            nivel = "Ouro";
            JOptionPane.showMessageDialog(null,"O herói " + nomeHeroi + " está no nível: " + nivel);
        }
        else if (xpHeroi>=7001 && xpHeroi<=8000) {
            nivel = "Platina";
            JOptionPane.showMessageDialog(null,"O herói " + nomeHeroi + " está no nível: " + nivel);
        }
        else if (xpHeroi>=8001 && xpHeroi<=9000) {
            nivel = "Ascendente";
            JOptionPane.showMessageDialog(null,"O herói " + nomeHeroi + " está no nível: " + nivel);
        }
        else if (xpHeroi>=9001 && xpHeroi<=10000) {
            nivel = "Imortal";
            JOptionPane.showMessageDialog(null,"O herói " + nomeHeroi + " está no nível: " + nivel);
        }
        else if (xpHeroi>= 10001) {
            nivel = "Radiante";
            JOptionPane.showMessageDialog(null,"O herói " + nomeHeroi + " está no nível: " + nivel);
        }
        else{
            JOptionPane.showMessageDialog(null, "Error");
        }
        
        
    }
}
