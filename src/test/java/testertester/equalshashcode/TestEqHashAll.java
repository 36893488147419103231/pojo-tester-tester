package testertester.equalshashcode;

import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

import org.junit.Test;
import pl.pojo.tester.api.assertion.Method;

/**
 * Created by me on 21/08/17.
 */
public class TestEqHashAll {
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
}
