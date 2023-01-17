public class Main {
    public static void main(String[] args) {
        int [] dati = new int[]{5,6,7};
        int galli [][]= new  int[][]{
                new int[]{5,6,7},
                new int[]{4,5,6}

        };
        int polli [][] = {
                {1,2,3}, {4,5,6},{7,8,9}
        };
        int serpenti [][] = new int[][]{
                new int[] {1,2,3,6,7},
                          {4,5,6,8,3},
                          {6,3,2,7,8}
        };
        // per iterare un array bidimensionale (normalmente) usiamo il for
        // un doppio for
        // esterno --->itera righe
        //interno---> itera colonne
        for (int i = 0 ;i< serpenti.length;i++){
            for (int b = 0; b< serpenti[i].length;b++){
                System.out.print(serpenti[i][b] + " ");
            }
            System.out.println();
        }


        for (int [] calamari :serpenti) {
            for (int pesci: calamari) {
                System.out.print(pesci + " ");
            }
            System.out.println();
        }

// sommo valori righe
        int somma = 0 ;
        for (int i = 0 ;i< serpenti.length;i++){
            for (int b = 0; b< serpenti[i].length;b++){
               somma = somma + serpenti[i][b];

            }
            System.out.println(somma);
            somma = 0;
        }
        // sommo valori colonne
        int sommacolonne = 0 ;
        for (int colonne = 0; colonne<serpenti[0].length;colonne++){
            for (int righe = 0;righe<serpenti.length;righe++){
                sommacolonne = sommacolonne + serpenti[righe][colonne];
            }
            System.out.println(sommacolonne);
            sommacolonne=0;
        }
        System.out.println("dfff");



    }
}
