package service;

import java.util.ArrayList;
import java.util.function.Supplier;



public class Joiners {
    public static <T> T fold(ArrayList<T> list, Joiner<T> joiner, Supplier<T> supplier){
        T type = supplier.get();


        if(type instanceof String){
            StringBuilder stringConcat = new StringBuilder();
            for (T element:list) {
                stringConcat.append(joiner.join(type, element));
            }
            return (T) stringConcat.toString();
        }else{
            T result = list.get(0);
            for(int i = 1; i < list.size(); i++) {
                result = joiner.join(result, list.get(i));
            }
            return result;
        }
    }
}
