import java.util.*;

public class Principal {
    public static void main (String[] args){
        //usando o Data()
        Date data = new Date();
        System.out.println("Data de hoje: \n->"+data);

        //usando Data(long date)

        Long currentTimeMillis = System.currentTimeMillis();
        System.out.println(currentTimeMillis);

        Date nova_data = new Date();
        System.out.println("Data de hoje: \n->"+nova_data);
    }
}
