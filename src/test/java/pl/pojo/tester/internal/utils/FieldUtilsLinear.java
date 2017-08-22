package pl.pojo.tester.internal.utils;

import java.util.ArrayList;
import org.paukov.combinatorics.Factory;
import org.paukov.combinatorics.Generator;
import org.paukov.combinatorics.ICombinatoricsVector;
import pl.pojo.tester.internal.GetOrSetValueException;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public final class FieldUtilsLinear {
    public static List<List<Field>> sequences(final List<Field> fields) {
        List<List<Field>> res = new ArrayList<>();
        List<Field> last = new ArrayList<>();
      for (Field field: fields) {
        List<Field> next = new ArrayList<>(last);
        next.add(field);
        res.add(next);
      }
      return res;
    }
}
