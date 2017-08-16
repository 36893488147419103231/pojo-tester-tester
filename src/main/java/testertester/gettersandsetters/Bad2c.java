package testertester.gettersandsetters;

/**
 * Created by me on 16/08/17.
 */
public class Bad2c {
  int qp;
  int db;

  public int getQp() {
    return qp;
  }

  public void setQp(int qp) {
    this.qp = qp;
  }

  public int getDb() {
    return qp; // bug
  }

  public void setDb(int db) {
    this.db = db;
  }
}
