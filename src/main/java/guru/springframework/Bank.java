package guru.springframework;

public class Bank {
    Money reduce(Expression source, String toCurrency) {
      return source.reduce(toCurrency);
    }

    public int rate(String  from , String  to){
        return from.equals("CHF") && to.equals("USD") ? 2 : 1;
    }
    public void addRate(String from, String to, int rate) {

    }
//        if(source instanceof Money) return (Money)source;
//        Sum sum = (Sum) source;
//        return  sum.reduce(toCurrency);


//        Sum sum = (Sum)source;
//        int amount = sum.addend.amount + sum.augmend.amount;
//        return new Money(amount, toCurrency);
//    }
}
