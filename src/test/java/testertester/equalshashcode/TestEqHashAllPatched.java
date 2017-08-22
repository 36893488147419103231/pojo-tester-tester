package testertester.equalshashcode;

import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import pl.pojo.tester.api.assertion.Method;
import pl.pojo.tester.internal.pl.pojo.tester.patch.LinearPatch;

/**
 * Created by me on 21/08/17.
 */
public class TestEqHashAllPatched {
  @BeforeClass
  public static void init() {
    LinearPatch.patch();
  }
  @Test
  public void smallTest() {
    // given
    final Class<?> classUnderTest = Small.class;

    // when

    // then
    assertPojoMethodsFor(classUnderTest)
        .testing(Method.EQUALS, Method.HASH_CODE)
        .areWellImplemented();
  }

  @Test
  public void mediumTest() {
    LinearPatch.patch();
    // given
    final Class<?> classUnderTest = Medium.class;

    // when

    // then
    assertPojoMethodsFor(classUnderTest)
        .testing(Method.EQUALS, Method.HASH_CODE)
        .areWellImplemented();
  }

  @Test
  public void bigTest() {
    // given
    final Class<?> classUnderTest = Big.class;

    // when

    // then
    assertPojoMethodsFor(classUnderTest)
        .testing(Method.EQUALS, Method.HASH_CODE)
        .areWellImplemented();
  }
  @AfterClass
  public static void fini() {
    LinearPatch.unpatch();
  }
}
