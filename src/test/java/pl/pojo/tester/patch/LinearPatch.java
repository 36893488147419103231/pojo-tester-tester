package pl.pojo.tester.patch;

import java.lang.reflect.Field;
import pl.pojo.tester.api.assertion.Method;
import pl.pojo.tester.internal.tester.EqualsTester;
import pl.pojo.tester.internal.tester.EqualsTesterLinear;
import pl.pojo.tester.internal.tester.HashCodeTester;
import pl.pojo.tester.internal.tester.HashCodeTesterLinear;

public class LinearPatch {

  public static void patch() {
    try {
      Field declaredField = Method.class.getDeclaredField("tester");
      declaredField.setAccessible(true);
      if (!(declaredField.get(Method.EQUALS) instanceof EqualsTesterLinear)) {
        declaredField.set(Method.EQUALS, new EqualsTesterLinear());
      }
      if (!(declaredField.get(Method.HASH_CODE) instanceof HashCodeTesterLinear)) {
        declaredField.set(Method.HASH_CODE, new HashCodeTesterLinear());
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
  public static void unpatch() {
    try {
      Field declaredField = Method.class.getDeclaredField("tester");
      declaredField.setAccessible(true);
      if (!(declaredField.get(Method.EQUALS) instanceof EqualsTester)) {
        declaredField.set(Method.EQUALS, new EqualsTester());
      }
      if (!(declaredField.get(Method.HASH_CODE) instanceof HashCodeTester)) {
        declaredField.set(Method.HASH_CODE, new HashCodeTester());
      }
    } catch (Exception e) {
      throw new RuntimeException(e);
    }
  }
}
