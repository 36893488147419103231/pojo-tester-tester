package testertester.equalshashcode;

/**
 * Created by me on 18/08/17.
 */
public class Small {
  int a,b,c;

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    Small small = (Small) o;

    if (a != small.a) {
      return false;
    }
    if (b != small.b) {
      return false;
    }
    return c == small.c;
  }

  @Override
  public int hashCode() {
    int result = a;
    result = 31 * result + b;
    result = 31 * result + c;
    return result;
  }
}
