import javax.swing.JOptionPane;
class avaliacao
{
   public static void main(String args[])
   {
       float prova1, prova2, prova3, nota_fim;

       prova1 = Float.parseFloat
       (JOptionPane.showInputDialog("Digite o valor da primeira prova: "));
       prova2 = Float.parseFloat
       (JOptionPane.showInputDialog("Digite o valor da segunda prova: "));
       prova3 = Float.parseFloat
       (JOptionPane.showInputDialog("Digite o valor da terceira prova: "));

       prova1 = (prova1 * 2) /10;
       prova2 = (prova2 * 3) /10;
       prova3 = (prova3 * 5) /10;
       nota_fim = prova1 + prova2 + prova3;

       JOptionPane.showMessageDialog(null,"Sua nota final é: "+nota_fim);
       System.out.println("Sua nota final é: "+nota_fim);
   }
}