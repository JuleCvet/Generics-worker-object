 
package genericsmethods;

public class StringWorker<T,U> {//ima 2 genericki tipa na objecti so iminja T i U 
    
    private T o1;//namesto object od tip String, zamenuvame objekt od bukva
    private U o2;//namesto object od tip String, zamenuvame objekt od bukva
    
    public StringWorker(T o1, U o2){
    this.o1 = o1;
    this.o2 = o2;
    
    }
    
    public String toString(){
    return "StringWorker" + " : " + o1.toString() + " : " + o2.toString();//vo momentov 
    // ne morat toString, ama za pokasno ke gi preminuvame vo objekti pa ke ni trebit
    
    }
    
    public T getO1(){//ke vraka objekt od tip T, t.s objektot o1
    return o1;
    
    }
    
    
    public static <A, B> String getString(A o1, B o2){//ke rab so 2 generic types ekvivalenti
 //na tie gore, metodov ke ima 2 objekt: eden od tip A dr od tip B so iminja na tie gore
 //povikuvame bilo koj objekt od bilo koj tip   
 //static e za da ne moze da ja instansiated StringWorker class (represent as or by an instance)
//ova e celosno nezavisen metod koj moze da go koristat site a nikoj da ne go poseduva. Zadrzuva samo edna v-st 
    return "StringWorker" + " : " + o1.toString() + " : " + o2.toString();//vo momentov 
    // ne morat toString, ama za pokasno ke gi preminuvame vo objekti pa ke ni trebit
    
    }
    
     public static <A> String getString2(A o1, A o2){//shto zema 2 objekti od isti tip
//shto znaci objektte vo metodot mora da se i 2-ta od toj isti vid na tip. Ovaj metod vraka String
//public static <A> A someMethodName(A s1, A s2)   - parse in nekoj objekt i vraka objekt od istiot tip shto e parse in
//so ova ne mora da frlame objekti vo tocen tip za da dobieme tocna return v-st
//NE MOZE public <A,B> A invalidMetod(B myValue)   zema parametar od eden geeneric tip(B), a vraka v-st od dr tip (A)
//ovde ne mozeme da kreirame object od tip A, za da potoa mozeme da vratime objekt od toj tip
//NE MOZE da napravime new object(Instansiate) od nepoznat generic tip pr: A myVariable = new A();
//MOZE samo ako zememe i B: public <A,B> B someMethod(A myValue, B ignore), so ova setirame v-st na objectot B i potoa ja vrakamei...
//ako ne znaeme sht e B vo ova reme. Najdobro e ako return type se sovpaga so inputot
         return "StringWorker" + " : " + o1.toString() + " : " + o2.toString();
         
     }
 }

