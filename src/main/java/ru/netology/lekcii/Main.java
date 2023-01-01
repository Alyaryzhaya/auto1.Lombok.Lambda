package ru.netology.lekcii;

import lombok.val;
import ru.netology.lekcii.model.PurchaseItem;
import ru.netology.lekcii.service.CartService;
import ru.netology.lekcii.util.PriceAskComparator;

import java.util.Comparator;

public class Main {
    public static void main(String[] args) {

//        val item = new PurchaseItem(1, 1000, 1);
//        System.out.println(item);

        CartService service = new CartService();
        service.add(new PurchaseItem(1, 1000, 1));
        service.add(new PurchaseItem(2, 4000, 4));
        service.add(new PurchaseItem(3, 6000, 1));
        service.add(new PurchaseItem(4, 7000, 9));
        service.add(new PurchaseItem(5, 9000, 1));
        service.add(new PurchaseItem(6, 8000, 10));

        //class LocalPriceAscComparator implements Comparator <PurchaseItem> {

//        Comparator<PurchaseItem> comparator = new Comparator<PurchaseItem>() {
//            @Override
//            public int compare(PurchaseItem o1, PurchaseItem o2) {
//                return o1.getItemPrice() - o2.getItemPrice();
//            }
//        };


        // System.out.println(service.sortedBy(new PriceAskComparator()));

        // System.out.println(service.sortedBy(new LocalPriceAscComparator()));


//        System.out.println(service.sortedBy(
//                new Comparator<PurchaseItem>() {
//                    @Override
//                    public int compare(PurchaseItem o1, PurchaseItem o2) {
//                        return o1.getItemPrice() - o2.getItemPrice();
//                    }
//                }));
//    }
//}


        // положить в переменную (ctrl+Alt+V):
//  1    Comparator<PurchaseItem> comparator = (PurchaseItem o1, PurchaseItem o2) -> {
//            return o1.getItemPrice() - o2.getItemPrice();
//        };


        // лямбда - выражение.
//  2      System.out.println(service.sortedBy((PurchaseItem o1, PurchaseItem o2) -> {
//            return o1.getItemPrice() - o2.getItemPrice();
//        }));



        // Следующий этап упрощения (убираем в скобках типы PurchaseItem)
//    System.out.println(service.sortedBy(( o1,  o2) -> {
//            return o1.getItemPrice() - o2.getItemPrice();
//            }));



        //  Следующий этап упрощения (убираем фигурные скобки и ключевое слово return):
      System.out.println( service.sortedBy(( o1,  o2) -> o1.getItemPrice() - o2.getItemPrice()) ) ;

      // Обходной путь, не вникая в Лямбду:
//      System.out.println(service.sortedBy((o1, o2) -> o1.getItemPrice() - o2.getItemPrice()));




        //  Вызов статического метода, в скобках передается метод getItemPrice:
//      System.out.println( service.sortedBy(Comparator.comparingInt (PurchaseItem:: getItemPrice) )) ;
//              }}

    }
}
