package cl.cehd.cleancode.examples;


import java.util.List;


public class BAD_NAME_CLASS_AFDGSFHDN {


    public static void main(String[] arg) {
        List<Integer> list = List.of(1, 8, 11, 7, 9, 21, 22, 2, 5, 10, 12, 400, 10000, 98, 27);

        //for (int i : list)
        //  System.out.println(i);

        // list.stream().forEach(integer -> System.out.println(integer));

        //list.stream().filter(n -> n % 2 == 0).forEach(integer -> System.out.println(integer));



       // list.stream()
         //       .filter(n -> n % 2 == 0)
           //     .map(pares -> "******" + String.valueOf(pares))
             //   .forEach(integer -> System.out.println(integer));

        /*list.stream().filter(numero -> {
            int contador = 2;
            boolean primo=true;
            while ((primo) && (contador!=numero)){
                if (numero % contador == 0)
                    primo = false;
                contador++;
            }
            return primo;
        })
                .collect(Collectors.toList())
                .forEach(r->System.out.println(r));



        list.stream().filter(numero -> numero!=1 &&
                IntStream.range(1, numero)
                 .filter(r -> numero % r == 0)
                 .sum() <=2 ? true:false)
                .collect(Collectors.toList())
                .forEach(r->System.out.println(r));*/

    }


}
