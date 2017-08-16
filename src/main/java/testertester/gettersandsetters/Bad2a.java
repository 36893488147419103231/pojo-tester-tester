package testertester.gettersandsetters;

/**
 * Created by me on 16/08/17.
 */
public class Bad2a {
  int qp;
  int db;

  public int getQp() {
    return db; // bug
  }

  public void setQp(int qp) {
    this.qp = qp;
  }

  public int getDb() {
    return db;
  }

  public void setDb(int db) {
    this.db = db;
  }
}
