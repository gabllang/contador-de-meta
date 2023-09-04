import java.util.Scanner;

public class ContadorDeMeta {
    public static void main(String[] args) throws Exception {

        // aqui declaro as variaveis, vou dividir a pontuação esperada pelo total de series, que vai dar a media dos pontos por serie

        int totalSerie = 20; 
        Scanner scanner = new Scanner(System.in);

        System.out.println("");
        System.out.println("");
                System.out.println("Quanto pretende fazer?");
                    int meta = scanner.nextInt();

            if (meta > 601 ) {
                System.out.println("impossivel fazer essa pontuação");
            }   else {

                
                    int media = meta / totalSerie;
                    int totalPonto = media / 3;

        System.out.println("");

        System.out.println("se você deseja fazer " + meta + " você vai precisar fazer em media " + media + " pontos por serie, fazendo no minimo " + totalPonto +  " pontos por flecha." );

        }

        System.out.println("boa sorte!");
        System.out.println("");

        
    }
}
