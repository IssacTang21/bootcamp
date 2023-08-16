package math;

import java.util.function.BiFunction;
import java.util.function.Function;

public interface SuperFunction<T, S, U, R>{
 R apply(T t, S s, U u);
  
}
