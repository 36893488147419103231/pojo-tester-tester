package testertester.equalshashcode;

/**
 * Created by me on 18/08/17.
 */
public class Big {
  int a,b,c,d,e,f,g,h,i,j,k,l,m,n,o,p,q,r,s,t,u,v,w,x,y,z;

  @Override
  public boolean equals(Object o1) {
    if (this == o1) {
      return true;
    }
    if (o1 == null || getClass() != o1.getClass()) {
      return false;
    }

    Big big = (Big) o1;

    if (a != big.a) {
      return false;
    }
    if (b != big.b) {
      return false;
    }
    if (c != big.c) {
      return false;
    }
    if (d != big.d) {
      return false;
    }
    if (e != big.e) {
      return false;
    }
    if (f != big.f) {
      return false;
    }
    if (g != big.g) {
      return false;
    }
    if (h != big.h) {
      return false;
    }
    if (i != big.i) {
      return false;
    }
    if (j != big.j) {
      return false;
    }
    if (k != big.k) {
      return false;
    }
    if (l != big.l) {
      return false;
    }
    if (m != big.m) {
      return false;
    }
    if (n != big.n) {
      return false;
    }
    if (o != big.o) {
      return false;
    }
    if (p != big.p) {
      return false;
    }
    if (q != big.q) {
      return false;
    }
    if (r != big.r) {
      return false;
    }
    if (s != big.s) {
      return false;
    }
    if (t != big.t) {
      return false;
    }
    if (u != big.u) {
      return false;
    }
    if (v != big.v) {
      return false;
    }
    if (w != big.w) {
      return false;
    }
    if (x != big.x) {
      return false;
    }
    if (y != big.y) {
      return false;
    }
    return z == big.z;
  }

  @Override
  public int hashCode() {
    int result = a;
    result = 31 * result + b;
    result = 31 * result + c;
    result = 31 * result + d;
    result = 31 * result + e;
    result = 31 * result + f;
    result = 31 * result + g;
    result = 31 * result + h;
    result = 31 * result + i;
    result = 31 * result + j;
    result = 31 * result + k;
    result = 31 * result + l;
    result = 31 * result + m;
    result = 31 * result + n;
    result = 31 * result + o;
    result = 31 * result + p;
    result = 31 * result + q;
    result = 31 * result + r;
    result = 31 * result + s;
    result = 31 * result + t;
    result = 31 * result + u;
    result = 31 * result + v;
    result = 31 * result + w;
    result = 31 * result + x;
    result = 31 * result + y;
    result = 31 * result + z;
    return result;
  }
}
