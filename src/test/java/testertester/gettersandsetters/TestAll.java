package testertester.gettersandsetters;

import static pl.pojo.tester.api.assertion.Assertions.assertPojoMethodsFor;

import org.junit.Test;
import pl.pojo.tester.api.assertion.Method;

/**
 * Created by me on 16/08/17.
 */
public class TestAll {
  @Test
  public void GoodTest() {
    // given
    final Class<?> classUnderTest = Good.class;

    // when

    // then
    assertPojoMethodsFor(classUnderTest)
        .testing(Method.GETTER, Method.SETTER)
        .testing(Method.CONSTRUCTOR)
        .areWellImplemented();
  }

  @Test
  public void Bad1Test() {
    // given
    final Class<?> classUnderTest = Bad1.class;

    // when

    // then
    assertPojoMethodsFor(classUnderTest)
        .testing(Method.GETTER, Method.SETTER)
        .testing(Method.CONSTRUCTOR)
        .areWellImplemented();
  }

  @Test
  public void Bad2aTest() {
    // given
    final Class<?> classUnderTest = Bad2a.class;

    // when

    // then
    assertPojoMethodsFor(classUnderTest)
        .testing(Method.GETTER, Method.SETTER)
        .testing(Method.CONSTRUCTOR)
        .areWellImplemented();
  }
  @Test
  public void Bad2bTest() {
    // given
    final Class<?> classUnderTest = Bad2b.class;

    // when

    // then
    assertPojoMethodsFor(classUnderTest)
        .testing(Method.GETTER, Method.SETTER)
        .testing(Method.CONSTRUCTOR)
        .areWellImplemented();
  }
  @Test
  public void Bad2cTest() {
    // given
    final Class<?> classUnderTest = Bad2c.class;

    // when

    // then
    assertPojoMethodsFor(classUnderTest)
        .testing(Method.GETTER, Method.SETTER)
        .testing(Method.CONSTRUCTOR)
        .areWellImplemented();
  }
  @Test
  public void Bad2dTest() {
    // given
    final Class<?> classUnderTest = Bad2d.class;

    // when

    // then
    assertPojoMethodsFor(classUnderTest)
        .testing(Method.GETTER, Method.SETTER)
        .testing(Method.CONSTRUCTOR)
        .areWellImplemented();
  }
  @Test
  public void Bad3aTest() {
    // given
    final Class<?> classUnderTest = Bad3a.class;

    // when

    // then
    assertPojoMethodsFor(classUnderTest)
        .testing(Method.GETTER, Method.SETTER)
        .testing(Method.CONSTRUCTOR)
        .areWellImplemented();
  }
  @Test
  public void Bad3bTest() {
    // given
    final Class<?> classUnderTest = Bad3b.class;

    // when

    // then
    assertPojoMethodsFor(classUnderTest)
        .testing(Method.GETTER, Method.SETTER)
        .testing(Method.CONSTRUCTOR)
        .areWellImplemented();
  }
  @Test
  public void Bad3cTest() {
    // given
    final Class<?> classUnderTest = Bad3c.class;

    // when

    // then
    assertPojoMethodsFor(classUnderTest)
        .testing(Method.GETTER, Method.SETTER)
        .testing(Method.CONSTRUCTOR)
        .areWellImplemented();
  }
  @Test
  public void Bad4aTest() {
    // given
    final Class<?> classUnderTest = Bad4a.class;

    // when

    // then
    assertPojoMethodsFor(classUnderTest)
        .testing(Method.GETTER, Method.SETTER)
        .testing(Method.CONSTRUCTOR)
        .areWellImplemented();
  }
  @Test
  public void Bad4bTest() {
    // given
    final Class<?> classUnderTest = Bad4b.class;

    // when

    // then
    assertPojoMethodsFor(classUnderTest)
        .testing(Method.GETTER, Method.SETTER)
        .testing(Method.CONSTRUCTOR)
        .areWellImplemented();
  }
}
