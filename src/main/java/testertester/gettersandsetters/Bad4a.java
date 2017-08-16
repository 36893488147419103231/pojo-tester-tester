package testertester.gettersandsetters;

/**
 * Created by me on 16/08/17.
 */
public class Bad4a {
  int qp;
  int db;

  public int getQp() {
    return qp;
  }

  public void setQp(int qp) {
    this.qp = db; // bug
  }

  public int getDb() {
    return db;
  }

  public void setDb(int db) {
    this.db = db;
  }
}
