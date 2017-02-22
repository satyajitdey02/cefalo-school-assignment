package cefalo.school.dp.builder.pattern.practice.self.sourcemaking;

/**
 * Created by satyajit on 10/29/2016.
 */
/*Product*/
class Pizza {
  private String dough = "";
  private String sauce = "";
  private String topping = "";

  public void setDough(String dough) {
    this.dough = dough;
  }

  public void setSauce(String sauce) {
    this.sauce = sauce;
  }

  public void setTopping(String topping) {
    this.topping = topping;
  }

  @Override
  public String toString() {
    return String.format("Pizza with: %s, %s, %s", this.dough, this.sauce, this.topping);
  }
}
