package application;

import entities.ImportedProduct;
import entities.Produto2;
import entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;


public class PolimorfismoProduto {
    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        SimpleDateFormat data = new SimpleDateFormat("dd/MM/yyyy");

        List<Produto2> list = new ArrayList<>();

        System.out.print("Enter the number of products: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.println("Product #" + i  + " data:");
            System.out.print("Common, used or imported (c/u/i)? ");
            char caractere = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Price: ");
            double price = sc.nextDouble();

            if (caractere == 'c') {
                list.add(new Produto2(name, price));
            }
            else if(caractere == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date date = data.parse(sc.next());
                list.add(new UsedProduct(name, price, date));
            }
            else if(caractere == 'i'){
                System.out.print("Customs fee: ");
                double customsFee = sc.nextDouble();
                list.add(new ImportedProduct(name, price, customsFee));
            }
        }

        System.out.println();
        System.out.println("PRICE TAGS: ");
        for (Produto2 produto : list){
            System.out.println(produto.priceTag());
        }
    }
}
